package Lab11.Chapter2;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_Manager {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<String> tasks = new ArrayList<>();
    private static final List<Boolean> tasksStatus = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = getUsetChoice();
            handleUserChoice(choice);
        }
    }

    private static void showMenu() {
        System.out.println("\nTo-Do List:");
        System.out.println("1. List tasks");
        System.out.println("2. Add task");
        System.out.println("3. Mark task as done");
        System.out.println("4. Delete task");
        System.out.println("0. Exit");
        System.out.println("Choose an option: ");
    }

    private static int getUsetChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void handleUserChoice(int choise) {
        scanner.nextLine();
        switch (choise) {
            case 1 -> listTasks();
            case 2 -> addTask();
            case 3 -> markTaskAsDone();
            case 4 -> deletTask();
            case 5 -> exitApp();
            default -> System.out.println("Invalid option. Try again.");
        }
    }

    private static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                String status = tasksStatus.get(i) ? "[Done]": "[Pending]";
                System.out.println((i+1)+"."+status+tasks.get(i));
            }
        }
    }

    private static void addTask(){
        System.out.println("Enter task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        tasksStatus.add(false);
        System.out.println("Task added!!!");
    }

    private static void markTaskAsDone(){
        System.out.println("Enter task number to mark as done: ");
        int doneIndex = getValidIndex();
        if (doneIndex != -1){
            tasksStatus.set(doneIndex, true);
            System.out.println("Task marked as done!!!");
        }
    }

    private static int getValidIndex(){
        while (!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter a valid task number.");
            scanner.next();
        }
        int index = scanner.nextInt()-1;
        scanner.nextLine();
        if(index < 0 || index >= tasks.size()){
            System.out.println("Invalid task number.");
            return -1;
        }
        return index;
    }

    private static void deletTask(){
        System.out.println("Enter task number to delete:");
        int deleteIndex = getValidIndex();
        if(deleteIndex != -1){
            tasks.remove(deleteIndex);
            tasksStatus.remove(deleteIndex);
            System.out.println("Task deleted!!1");
        }
    }

    private static void exitApp(){
        System.out.println("Exiting...");
        scanner.close();
        System.exit(0);
    }
}
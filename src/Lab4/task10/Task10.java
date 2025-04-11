package Lab4.task10;

public class Task10 {
    public static void main(String[] args) {
        int num1 = printNumbers("Entered numbers 1: ", 4, 9, 2, 6);
        int num2 = printNumbers("Entered numbers 2: ", 1, 34, 8, 0, 2);

    }

    public static int printNumbers(String message, int... numbers) {
        System.out.print(message);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        return 0;
    }
}
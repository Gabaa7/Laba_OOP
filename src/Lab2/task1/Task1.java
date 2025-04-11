package Lab2.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int num = sc.nextInt();

        if ( num > 0 ) {
            System.out.println("Ваше число додатнє ");
        } else if ( num == 0 ) {
            System.out.println("Ваше число = 0");
        } else {
            System.out.println("Ваше число від'ємне");
        }
        sc.close();
    }
}
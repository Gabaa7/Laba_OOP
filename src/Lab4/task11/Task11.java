package Lab4.task11;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Max: " + findMax(9, 7, 2, 19, 0, 3, 34, 1, 100));
    }

    public static int findMax(int... numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }
}
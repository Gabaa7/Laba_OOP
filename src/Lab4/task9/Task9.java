package Lab4.task9;

public class Task9 {
    public static void main(String[] args) {

        int sumZ = addVarargs(1, 6, 0, 9, 2);
        int sumX = addVarargs(5, 6, 14, 2, 5);
        int sumC = addVarargs(0, 3, 1, 5, 8);

        System.out.println("Sum Z is: " + sumZ);
        System.out.println("Sum X is: " + sumX);
        System.out.println("Sum C is: " + sumC);
    }

    static int addVarargs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
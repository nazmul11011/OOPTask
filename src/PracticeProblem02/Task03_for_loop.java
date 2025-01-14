package PracticeProblem02;

public class Task03_for_loop {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 2; i <= 20; i += 2) {
            evenSum += i;
        }

        for (int i = 1; i < 20; i += 2) {
            oddSum += i;
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}

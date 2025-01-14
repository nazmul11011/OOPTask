package PracticeProblem02;

public class Task03_while_loop {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;

        int i = 2;
        while (i <= 20) {
            evenSum += i;
            i += 2;
        }

        i = 1;
        while (i < 20) {
            oddSum += i;
            i += 2;
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}

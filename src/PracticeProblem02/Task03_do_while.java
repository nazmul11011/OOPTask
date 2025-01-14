package PracticeProblem02;

public class Task03_do_while {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;

        int i = 2;
        do {
            evenSum += i;
            i += 2;
        } while (i <= 20);

        i = 1;
        do {
            oddSum += i;
            i += 2;
        } while (i < 20);

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}

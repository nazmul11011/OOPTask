package PracticeProblem02;

public class Task02_for_loop {
    public static void main(String[] args) {
        System.out.println("Even numbers:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n Odd numbers:");
        for (int i = 1; i < 20; i += 2) {
            System.out.print(i + " ");
        }
    }
}

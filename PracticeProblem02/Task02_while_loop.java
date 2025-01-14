package PracticeProblem02;

public class Task02_while_loop {
    public static void main(String[] args) {
        System.out.println("Even numbers:");
        int i = 2;
        while (i <= 20) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println("\n Odd numbers:");
        i = 1;
        while (i < 20) {
            System.out.print(i + " ");
            i += 2;
        }
    }
}

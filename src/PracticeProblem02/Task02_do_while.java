package PracticeProblem02;

public class Task02_do_while {
    public static void main(String[] args) {
        System.out.println("Even numbers:");
        int i = 2;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 20);
        System.out.println("\n Odd numbers:");
        i = 1;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i < 20);
    }
}

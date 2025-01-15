package PracticeProblem03;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("number of elements in the series: ");
        int n = s.nextInt();
        int[] numbers = new int[n];
        System.out.println("enter series:");
        for (int i = 0; i < n; i++) {
            numbers[i] = s.nextInt();
        }
        System.out.println("reversed series:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        s.close();
    }
}

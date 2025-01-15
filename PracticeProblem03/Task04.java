package PracticeProblem03;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of elements in the series: ");
        int n = s.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = s.nextInt();
        }

        int greatest = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] > greatest) {
                greatest = numbers[i];
            }
        }
        System.out.println("The greatest number here: " + greatest);
        s.close();
    }
}

package PracticeProblem03;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = s.nextInt();
        int[] numbers = new int[n];
        int odd = 0, even = 0;
        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = s.nextInt();
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
    }
}

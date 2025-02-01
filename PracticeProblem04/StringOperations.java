package PracticeProblem04;

import java.util.Scanner;

public class StringOperations {
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equalsIgnoreCase(reversed);
    }

    public static int countCharacter(String input, char targetChar) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == targetChar) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        System.out.print("Enter a target character to count its occurrences: ");
        char targetChar = scanner.next().charAt(0);
        int count = countCharacter(input, targetChar);
        System.out.println("The character '" + targetChar + "' occurs " + count + " times in the string.");

        scanner.close();
    }
}

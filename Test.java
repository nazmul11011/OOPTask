import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int currentYear = 2024;

        try{
            System.out.println(getInputFromConsole(currentYear));
        }catch(NullPointerException e) {
            System.out.println("Null pointer exception");
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What is your name?");
        System.out.println("Hello! "+name+", Thanks for taking this course");

        String dateOfBirth = System.console().readLine("What year you were born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }
    public static String getInputFromScanner(int currentYear){
        Scanner s = new Scanner(System.in);
        System.out.println("Hi, What is your name?");
        String name = s.nextLine();
        System.out.println("Hello! " + name + ", Thanks for taking this course");

        System.out.println("What year you were born? ");
        String dateOfBirth = s.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }
}

package PracticeProblem03;

import java.util.Objects;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter students letter grade(0.0 - 4.0): ");
        double letterGrade=s.nextDouble();
        System.out.println("Does students completed semester?(yes/no)");
        String semester = s.next();
        if(letterGrade>=3.5){
            if(Objects.equals(semester, "yes")){
                System.out.println("Student eligible for madel");
            }else{
                System.out.println("Didn't completed semester!");
            }
        }else{
            System.out.println("Letter Grade minimum requirements didn't matched");
        }
        s.close();
    }
}

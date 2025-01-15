package PracticeProblem03;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of element: ");
        int n=s.nextInt();
        double[] array=new double[n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            array[i]=s.nextDouble();
        }
        double sum=0;
        for(double num:array){
            sum+=num;
        }
        double average = sum/n;
        System.out.println("Average is - "+average);
        s.close();
    }
}

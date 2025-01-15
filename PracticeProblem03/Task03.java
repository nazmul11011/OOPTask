package PracticeProblem03;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter target sales: ");
        double targetSales=s.nextDouble();
        System.out.println("Enter actual sales: ");
        double actualSales=s.nextDouble();
        System.out.println("Enter attendance percentage: ");
        double attendance=s.nextDouble();
        double salesP=(targetSales/actualSales)*100;
        int bonus;
        if(salesP>=95){
            if(attendance==100){
                bonus=60;
            }else if(attendance>=90){
                bonus=40;
            }else bonus=5;
        } else if (salesP>=80) {
            if(attendance==100){
                bonus=40;
            }else if(attendance>=90){
                bonus=20;
            }else bonus=5;
        } else{
            bonus=5;
        }
        System.out.println("Eligible bonus percentage "+bonus+"%");
        s.close();
    }
}

package PracticeProblem04;

import java.util.Scanner;

public class Product {

    public void filterProducts(String category){
        System.out.println("Results for "+category+" is here-");
    }
    public void filterProducts(int priceLow, int priceHigh){
        System.out.println("Results for price range from "+priceLow+" to "+ priceHigh+" is here-");
    }
    public void filterProducts(String category,String brand){
            System.out.println("Results for "+brand+" is here-");
    }
    public void filterProducts(String category, int priceLow, int priceHigh){
            System.out.println("Results for "+category+" from "+priceLow+" to "+priceHigh+" is here-");
    }
    public void filterProducts(String category, int priceLow, int priceHigh, String brand){
                System.out.println("Results for "+category+" from "+priceLow+" to "+priceHigh+" and for "+brand+" is here-");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product filterSystem = new Product();

        System.out.println("Which category you want to find? (e.g., 'electronics', 'fashion')");
        String category = scanner.next();
        filterSystem.filterProducts(category);

        System.out.println("Which price range you want to find? (e.g., products between $100 and $500)");
        int priceLow = scanner.nextInt();
        int priceHigh = scanner.nextInt();
        filterSystem.filterProducts(priceLow,priceHigh);

        System.out.println("Which brand ?(e.g., 'Apple', 'Nike')");
        String brand = scanner.next();
        filterSystem.filterProducts(category,brand);

        System.out.println("Which category and price range you want to find?");
        category = scanner.next();
        priceLow = scanner.nextInt();
        priceHigh = scanner.nextInt();
        filterSystem.filterProducts(category,priceLow,priceHigh);

        System.out.println("Which category , price range and brand you want to find?");
        category = scanner.next();
        priceLow = scanner.nextInt();
        priceHigh = scanner.nextInt();
        brand = scanner.next();
        filterSystem.filterProducts(category,priceLow,priceHigh,brand);

    }
}

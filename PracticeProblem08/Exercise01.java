package PracticeProblem08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Base class representing a menu item (Abstraction)
class MenuItem {
    String name;
    double price;

    MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Overridden toString method (Polymorphism)
    public String toString() {
        return name + " - $" + String.format("%.2f", price);
    }
}

// Derived class for food items (Inheritance)
class FoodItem extends MenuItem {
    FoodItem(String name, double price) {
        super(name, price);
    }
}

// Class for handling the food order (Without Encapsulation)
class FoodOrder {
    String customerName;
    String customerAddress;
    List<FoodItem> menu = new ArrayList<>();
    List<Integer> quantities = new ArrayList<>();

    FoodOrder() {
        // Adding menu items (Extensibility)
        menu.add(new FoodItem("Burger", 5.99));
        menu.add(new FoodItem("Pizza", 8.99));
        menu.add(new FoodItem("Pasta", 7.49));
    }

    // Method to take user input and order
    void takeOrder() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        customerName = sc.nextLine();
        System.out.print("Enter your address: ");
        customerAddress = sc.nextLine();

        System.out.println("\n===== MENU =====");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i));
        }

        for (int i = 0; i < menu.size(); i++) {
            System.out.print("Enter quantity for " + menu.get(i).name + " (or 0 to skip): ");
            int quantity;
            if (sc.hasNextInt()) {
                quantity = sc.nextInt();
                if (quantity < 0) {
                    System.out.println("Invalid quantity! Setting it to 0.");
                    quantity = 0;
                }
            } else {
                System.out.println("Invalid input! Skipping item.");
                sc.next(); // Clear invalid input
                quantity = 0;
            }
            quantities.add(quantity);
        }

        sc.close();
    }

    // Method to generate and display the bill
    void generateBill() {
        double total = 0;
        System.out.println("\n===== BILL =====");
        System.out.println("Customer: " + customerName);
        System.out.println("Address: " + customerAddress);
        System.out.println("----------------------------");

        for (int i = 0; i < menu.size(); i++) {
            if (quantities.get(i) > 0) {
                double itemTotal = quantities.get(i) * menu.get(i).price;
                total += itemTotal;
                System.out.printf("%s x %d = $%.2f%n", menu.get(i).name, quantities.get(i), itemTotal);
            }
        }

        System.out.println("----------------------------");
        System.out.printf("Total Amount: $%.2f%n", total);
        System.out.println("============================");
    }
}

// Main class to run the program
public class Exercise01 {
    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();
        order.takeOrder();
        order.generateBill();
    }
}
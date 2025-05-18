package PracticeProblem06;

import java.util.*;

public class User {
    int UserID;
    String UserName;
    String UserAddress;
    int PhoneNo;

    public User(int id, String name, String address, int phone) {
        this.UserID = id;
        this.UserName = name;
        this.UserAddress = address;
        this.PhoneNo = phone;
    }

    public void ReturnBooks() {
        System.out.println("Book returned!!!!");
    }

    public void PayFine(Date date, int amount) {
        System.out.println("Fine of " + amount + " paid on " + date);
    }

    public void AddNewUser(List<User> users, User user) {
        users.add(user);
    }

    public void DeleteUser(List<User> users, int id) {
        users.removeIf(user -> user.UserID == id);
    }

    public void UpdateDetails(String name, String address, int phone) {
        this.UserName = name;
        this.UserAddress = address;
        this.PhoneNo = phone;
    }

    public void BookPurchase() {
        System.out.println("Book purchased by USER");
    }
}
package PracticeProblem06;

import java.util.*;

public class Librarian<Books> {
    int Id;
    String Name;

    public Librarian(int id, String name) {
        this.Id = id;
        this.Name = name;
    }

    public Books SearchBook(List<Books> bookList, String name) {
        return Books.InquiryBook(bookList, name);
    }

    public boolean VerifyMember(List<User> users, int id) {
        for (User user : users) {
            if (user.UserID == id) {
                return true;
            }
        }
        return false;
    }

    public void OrderBooks() {
        System.out.println("Book ordered by librarian.");
    }

    public void SellBooks() {
        System.out.println("Book sold by librarian.");
    }
}
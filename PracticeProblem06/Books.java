package PracticeProblem06;

import java.util.*;

public class Books {
    int BookId;
    String BookName;
    String BookAuthor;
    String YearOfPub;
    float Price;
    String Status;

    public Books(int id, String name, String author, String year, float price, String status) {
        this.BookId = id;
        this.BookName = name;
        this.BookAuthor = author;
        this.YearOfPub = year;
        this.Price = price;
        this.Status = status;
    }

    public void AddNewBooks(List<Books> bookList, Books newBook) {
        bookList.add(newBook);
    }

    public void DeleteBooks(List<Books> bookList, int bookId) {
        bookList.removeIf(book -> book.BookId == bookId);
    }

    public void DisplayBookDetails() {
        System.out.println("ID: " + BookId + ", Name: " + BookName + ", Author: " + BookAuthor +
                ", Year: " + YearOfPub + ", Price: " + Price + ", Status: " + Status);
    }

    public static Books InquiryBook(List<Books> bookList, String name) {
        for (Books book : bookList) {
            if (book.BookName.equalsIgnoreCase(name)) {
                return book;
            }
        }
        return null;
    }
}
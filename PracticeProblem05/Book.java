package PracticeProblem05;

class Book {
    private String title;
    private String author;

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        if (author != null) {
            System.out.println("Author: " + author);
        } else {
            System.out.println("Author: Not specified");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Feluda");
        book1.displayBookDetails();

        Book book2 = new Book("ব্যোমকেশ সমগ্র", "শরদিন্দু বন্দ্যোপাধ্যায়");
        book2.displayBookDetails();
    }
}

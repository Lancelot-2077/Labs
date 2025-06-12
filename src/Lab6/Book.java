package Lab6;

public class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    void printInfo() {
        System.out.println("Book: " + title + ", Author: " + author);
    }
}

class Bo {
    public static void main(String[] args) {
        Book b1 = new Book("War and Peace", "Leo Tolstoy");
        Book b2 = new Book("Mystery Island");

        b1.printInfo();
        b2.printInfo();
    }
}


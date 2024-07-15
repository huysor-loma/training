package exercises5;

import java.awt.print.Book;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Books books1 = new Books("Java", "Dara", "I123");
        Books books2 = new Books("Javascript", "Dara", "4");
        Books books3 = new Books("PHP", "Dara", "I125");
        Books.addBook(books1);
        Books.addBook(books2);
        Books.addBook(books3);
    }
}

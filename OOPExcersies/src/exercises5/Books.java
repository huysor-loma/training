package exercises5;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private String title;
    private String author;
    private String ISBN;
    private static List<Books> bookCollect = new ArrayList<>();

    public Books(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public static void addBook(Books books) {
        bookCollect.add(books);
    }

    public void removeBook(Books books) {
        bookCollect.remove(books);
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookCollect=" + bookCollect +
                '}';
    }
}

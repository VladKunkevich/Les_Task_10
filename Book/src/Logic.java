import java.util.ArrayList;
import java.util.List;

public class Logic {

    public List<Book> Author(BookList bl, String author) {
        List<Book> result = new ArrayList<>();
        List<Book> books = bl.getBookList();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }
    public List<Book> Publisher(BookList bl, String publisher) {
        List<Book> result = new ArrayList<>();
        List<Book> books = bl.getBookList();
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> Year(BookList bl, int year) {
        List<Book> result = new ArrayList<>();
        List<Book> books = bl.getBookList();
        for (Book book : books) {
            if (book.getYear() > year) {
                result.add(book);
            }
        }
        return result;
    }
}

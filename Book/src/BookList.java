import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Book> bookList;

    public BookList(){
        bookList = new ArrayList<>();
    }

    public void add(Book book){
        bookList.add(book);
    }

    public List<Book> getBookList() {
        return bookList;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bookList == null) ? 0 : bookList.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        BookList other = (BookList) o;
        if (bookList == null) {
            if (other.bookList != null)
                return false;
        } else if (!bookList.equals(other.bookList))
            return false;
        return true;
    }

}

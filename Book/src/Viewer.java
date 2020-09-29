import java.util.List;

public class Viewer {

    public void print(String s, List<Book> list){
        System.out.println(s);

        for (Book b : list) {
            System.out.println(b.toString());
        }
    }
}

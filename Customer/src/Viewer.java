import java.util.List;

public class Viewer {
    public void print(String s, List<Customer> customers){
        System.out.println(s);
        for (Customer c : customers) {
            System.out.println(c.toString());
        }
    }
}

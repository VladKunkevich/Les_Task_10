import java.util.List;

public class Viewer {

    public void print(String s, List<Airline> airlines){
        System.out.println(s);
        for (Airline a : airlines) {
            System.out.println(a.toString());
        }
    }
}

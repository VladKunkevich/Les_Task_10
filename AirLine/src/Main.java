import java.sql.Time;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AirlineList al = new AirlineList();
        Logic log = new Logic();
        Viewer view = new Viewer();

        al.add(new Airline("Minsk", 789, "Boening 747", Time.valueOf("19:15:16"), "Monday"));
        al.add(new Airline("Moscow", 511, "Boening 747", Time.valueOf("10:11:00"), "Tuesday"));
        al.add(new Airline("Warsaw", 622, "Boening 747", Time.valueOf("11:12:13"), "Wednesday"));
        al.add(new Airline("Minsk", 733, "Boening 747", Time.valueOf("12:13:14"), "Thursday"));
        al.add(new Airline("Moscow", 844, "Boening 747", Time.valueOf("13:14:15"), "Friday"));
        al.add(new Airline("Minsk", 933, "Boening 747", Time.valueOf("14:15:16"), "Saturday"));
        al.add(new Airline("Moscow", 144, "Boening 747", Time.valueOf("15:16:17"), "Sunday"));

        List<Airline> l = log.flightsToDestination(al, "Minsk");
        view.print("Список рейсов 'Минск' ", l);

        List<Airline> l1 = log.flightForTheDay(al, "Monday");
        view.print("День недели: ",l1);

        List<Airline> l2 = log.afterTime(al, "Tuesday", Time.valueOf("10:11:00"));
        view.print("День недели и время вылета:", l2);

    }
}

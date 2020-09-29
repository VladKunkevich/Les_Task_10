import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Logic {

    public List<Airline> flightsToDestination(AirlineList lineList, String destination){
        List<Airline> result = new ArrayList<>();
        List<Airline> airlines = lineList.getAirlineList();
        for(Airline airline : airlines){
            if(airline.getDestination().equals(destination)){
                result.add(airline);
            }
        }
        return result;
    }

    public List<Airline> flightForTheDay(AirlineList lineList, String day){
        List<Airline> result = new ArrayList<>();
        List<Airline> airlines = lineList.getAirlineList();
        for(Airline airline : airlines){
            if(airline.getDay().equals(day)){
                result.add(airline);
            }
        }
        return result;
    }

    public List<Airline> afterTime(AirlineList lineList, String day, Time departureTime){
        List<Airline> result = new ArrayList<>();
        List<Airline> result1;
        result1 = flightForTheDay(lineList, day);
        for (Airline l : result1) {
            Time t = l.getDepartureTime();
            if (t.getTime() > departureTime.getTime()) {
                result.add(l);
            }
        }
        return result;

    }


}

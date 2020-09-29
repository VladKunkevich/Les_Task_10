import java.sql.Time;

public class Airline {

    private String destination;
    private int flightNumber;
    private String planeType;
    private Time departureTime;
    private String day;

    public Airline(String destination, int flightNumber, String planeType, Time departureTime, String day){
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.day = day;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((planeType == null) ? 0 : planeType.hashCode());
        result = prime * result + ((day == null) ? 0 : day.hashCode());
        result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
        result = prime * result + ((destination == null) ? 0 : destination.hashCode());
        result = prime * result + flightNumber;
        return result;
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Airline other = (Airline) obj;
        if (planeType == null) {
            if (other.planeType != null)
                return false;
        } else if (!planeType.equals(other.planeType))
            return false;
        if (day == null) {
            if (other.day != null)
                return false;
        } else if (!day.equals(other.day))
            return false;
        if (departureTime == null) {
            if (other.departureTime != null)
                return false;
        } else if (!departureTime.equals(other.departureTime))
            return false;
        if (destination == null) {
            if (other.destination != null)
                return false;
        } else if (!destination.equals(other.destination))
            return false;
        if (flightNumber != other.flightNumber)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Airline [destination = " + destination + ", flightNumber = " + flightNumber + ", planeType = "
                + planeType + ", departureTime = " + departureTime + ", day = " + day + "]";

    }


}

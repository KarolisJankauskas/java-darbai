public class Room {

    // Private instance variables
    private String code;
    private int seats;

    // Constructor to initialize the instance variables
    public Room(String classCode, int numberOfSeats) {
        this.code = classCode;
        this.seats = numberOfSeats;
    }

    // Getter methods to access the private variables
    public String getCode() {
        return code;
    }

    public int getSeats() {
        return seats;
    }

    // Setter methods to modify the private variables
    public void setCode(String code) {
        this.code = code;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}

package bai12;

public class Car extends RoadTransport {
    private int numberOfSeats;
    private String engineType;

    public Car(){

    }

    public Car(int id, String manufacture, int yearOfManufacture, double price, String color, int numberOfSeats, String engineType) {
        super(id, manufacture, yearOfManufacture, price, color);
        this.numberOfSeats = numberOfSeats;
        this.engineType = engineType;
    }

    public Car(int numberOfSeats, String engineType) {
        this.numberOfSeats = numberOfSeats;
        this.engineType = engineType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}

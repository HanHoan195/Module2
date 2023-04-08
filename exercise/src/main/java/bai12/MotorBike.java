package bai12;

public class MotorBike extends RoadTransport{
    private String cubicMeter;

    public MotorBike(){

    }

    public MotorBike(int id, String manufacture, int yearOfManufacture, double price, String color, String cubicMeter) {
        super(id, manufacture, yearOfManufacture, price, color);
        this.cubicMeter = cubicMeter;
    }

    public String getCubicMeter() {
        return cubicMeter;
    }

    public void setCubicMeter(String cubicMeter) {
        this.cubicMeter = cubicMeter;
    }
}

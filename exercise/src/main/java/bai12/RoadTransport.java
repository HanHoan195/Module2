package bai12;

public class RoadTransport {
    private int id;
    private String manufacture;
    private int yearOfManufacture ;
    private double price;
    private String color;

    public RoadTransport(int id, String manufacture, int yearOfManufacture, double price, String color) {
        this.id = id;
        this.manufacture = manufacture;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.color = color;
    }
    public RoadTransport(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

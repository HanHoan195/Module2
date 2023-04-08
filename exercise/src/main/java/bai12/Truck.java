package bai12;

import javax.swing.*;

public class Truck extends RoadTransport {
    private int tonnage;

    public Truck(){}

    public Truck(int id, String manufacture, int yearOfManufacture, double price, String color, int tonnage) {
        super(id, manufacture, yearOfManufacture, price, color);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }
}

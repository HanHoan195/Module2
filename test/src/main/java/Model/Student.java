package Model;

import utils.Gender;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private double diemtrungbinh;

    public Student() {
    }

    public Student(int id, String name, int age, String gender, String address, double diemtrungbinh) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.diemtrungbinh = diemtrungbinh;
    }
    public Student(String raw){
        String[] strings = raw.split(",");
        this.id =Integer.parseInt(strings[0]);
        this.name = strings[1];
        this.age = Integer.parseInt(strings[2]);
        this.gender = strings[3];
        this.address = strings[4];
        this.diemtrungbinh = Double.parseDouble(strings[5]);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getDiemtrungbinh() {
        return diemtrungbinh;
    }

    public void setDiemtrungbinh(double diemtrungbinh) {
        this.diemtrungbinh = diemtrungbinh;
    }

    @Override
    public String toString() {
        return id + ";" + name + ";" + name + ";" + age + ";" + gender + ";" + address + ";" + diemtrungbinh ;
    }
}

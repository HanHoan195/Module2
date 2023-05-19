package model;

public class Student {
    private long id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private double averagePoint;

    public Student() {
    }

    public Student(long id, String name, int age, String gender, String address, double averagePoint) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.averagePoint = averagePoint;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

    public Student parseData(String line) {
        String[] itemInfo = line.split(",");
        Student student = new Student();

        student.setId(Long.parseLong(itemInfo[0]));
        student.setName(itemInfo[1]);
        student.setAge(Integer.parseInt(itemInfo[2]));
        student.setGender(itemInfo[3]);
        student.setAddress(itemInfo[4]);
        student.setAveragePoint(Double.parseDouble(itemInfo[5]));

        return student;
    }

    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s",id,name,age,gender,address,averagePoint);
    }


}

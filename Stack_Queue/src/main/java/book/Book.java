package book;

import java.util.Date;

public class Book {
    //biến toàn cục - biến instance - biến của đối tượng
    // các biến này có đặc điểm gì
    //có giá trị mặc định dựa trên kiểu khai báo
    private long id;        //0l
    private String name;        //null
    private String description;         //null
    private Date entryDate;
    private double price;       //o.0d

    public Book(){

    }

    // // hàm khởi tạo - contructor để làm gì, đặc điểm ntn:
    //để khởi tạo các đối tượng ,có tên trùng vs tên class
    public Book(long id, String name, String description, Date entryDate, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.entryDate = entryDate;
        this.price = price;
    }

    //getter/seteter để lm gì
    //kiểm soát quyền truy cập và cập nhật các giá trị

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

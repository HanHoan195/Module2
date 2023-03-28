package excercise;

import java.util.Date;

public class Customer {
    //biến toàn cục - biến instance - biến của đối tượng
    // các biến này có đặc điểm gì
    //
    private long id;
    private String fullName;
    private String email;
    private String address;

    private Date createAt;


    public Customer(){

    }

    // hàm khởi tạo - contructor để làm gì, đặc điểm ntn:           ???
    //để tạo các đối tượng. có tên trùng vs tên class
    public Customer(long id, String fullName, String email, String address, Date createAt) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.createAt = createAt;
    }


    //getter/setter để làm gì: ???
    //để kiểm soát quyền truy cập các trường

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
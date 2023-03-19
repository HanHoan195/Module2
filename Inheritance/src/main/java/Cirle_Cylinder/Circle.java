package Cirle_Cylinder;

public class Circle {
    protected float radius;
    protected String color;

    public Circle(){

    }
    public Circle(float radius, String color){
        this.radius = radius;
        this.color = color;
    }


    // getter setter ở đây để lm gì?
    // Để cập nhật và lấy giá trị của radius và color
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        if (radius < 0){
            System.out.println("Bán kính không hợp lệ!");
        } else {
            this.radius = radius;
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public float getArea(){
        return (float) (Math.PI * this.radius * this.radius);
    }


    // Hàm toString để làm gì, từ đâu ra, override là gì        ???
    //Hàm toString để chuyển từ một đối tượng sang dạng chuỗi, đc kế thừa mặc định ở object, override là ghi đè.

    // this.radius lấy thông tin radius được, không cần this. có được ko ???
    // không cần this. vẫn lấy đc thông tin radius vì accesmodifier là protected và đang ở trong cùng lớp

    @Override
    public String toString (){
        return String.format("Circle Area: %s , Radius: %s , Color: %s", this.getArea(), radius, color);
    }

//    public static void main(String[] args) {
//        Circle circle = new Circle(3, "Red");
//        System.out.println(circle);
//
//
//    }
}

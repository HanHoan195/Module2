public class Rectangle {
    double width, height;
    public Rectangle(){
        //conatructor
    }
    //khai báo các thuộc tính
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    //phương thức getter setter
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }
    public String display(){
        return "Rectange{" + "width = " + width + ", height = " + height + "}";
    }
}

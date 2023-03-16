import java.awt.*;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double height = 1.0;
    public Rectangle(){
    }
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    public Rectangle(String color, boolean filled, double width, double height){
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }
    @Override
    public String toString(){
    return "A rectangle with width: " + this.width
            + " , lenght: " + this.height
            + " which is a subclass of " +super.toString()
            + " Area : " + getArea()
            + " Perimeter : " + getPerimeter();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3,6);
        System.out.println(rectangle);

        rectangle = new Rectangle("Black", false, 4, 7);
        System.out.println(rectangle);
    }
}

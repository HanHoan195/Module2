public class Circle {
    private static double radius = 1.0;
    private String color = "red";

    public Circle(){

    }public Circle(double radius){
        this.radius = radius;
    }
    public static double getRadius(){
        return radius;
    }
    public double getArea(){
        double Area = Math.PI * this.radius * this.radius;
        return Area;
    }
}

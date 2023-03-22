package comparable2;

public class Circle {
    private float radius = 3;
    private String color = "red";
    private boolean filled;

    public Circle(){

    }
    public Circle(float radius, String color,boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public Circle(float radius){
        this.radius = radius;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }
    public float getArea(){
        return (float) (Math.PI * radius * radius);
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString(){
        return String.format("Radius: %s Color: %s Area %s",radius, color,getArea());
    }


    public static void main(String[] args) {
        Circle circle = new Circle(3,"red",false);
        System.out.println(circle);
    }
}

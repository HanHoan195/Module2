package comparable_;

public class Circle {
    private float radius = 1;
    private String color = "red";
    private boolean filled = true;

    public Circle(){

    }
    public Circle(float radius, String color,boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
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

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public float getArea(){
        return (float) (Math.PI * radius * radius);
    }
    @Override
    public String toString(){
        return String.format("Radius: %s Color: %s is filled %s",radius, color,filled);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3,"red",false);
        System.out.println(circle);
    }
}

public class Circle2 extends Shape {
    private double radius = 1.0;

    public Circle2() {
    }
    public Circle2(double radius){
        this.radius = radius;
    }
    public Circle2(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString(){
        return  "A Circle with radius = " + getRadius() + " , Which is subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Circle2 circle2 = new Circle2();
        System.out.println(circle2);

        circle2 = new Circle2(3.5);
        System.out.println(circle2);

        circle2 = new Circle2("Indigo", false, 3.5);
        System.out.println(circle2);
    }
}
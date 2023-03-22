package resizeable;

public class Circle extends Geometric{
    private float radius;
    //khởi tạo đối tượng vs 1 tham số
    public Circle(float radius){
        this.radius = radius;
    }
    @Override
    //ghi đè phương thức getArea() của lớp cha đang là asbtract
    public float getArea() {
        return (float) (Math.PI * this.radius * radius);
    }

    public Circle(){

    }
    @Override
    //ghi đè phương thức resize ở interface
    public void resize(float perccent) {
        this.radius = this.radius * perccent;
    }

    @Override
    //ghi đè toString()
    public String toString (){
        return String.format("Circle color: %s, filled: %s, area: %s",getColor(),isFilled(),this.getArea());
    }

//    public static void main(String[] args) {
//        Circle circle = new Circle(3);
//        System.out.println(circle);
//    }
}

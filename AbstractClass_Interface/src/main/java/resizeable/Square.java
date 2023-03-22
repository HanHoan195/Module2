package resizeable;

public class Square extends Rectangle implements Colorable{
public Square(float width, float hiegth){
    super(width,hiegth);
}
public Square(float width, float heigth, String color, boolean filled){
    super(width, heigth, color, filled);
}
    @Override
    public void howToColor() {
        System.out.println("Print all four sides");
    }

    public static void main(String[] args) {
        Square square = new Square(3,5);
        System.out.println(square.getArea());
        square.howToColor();
    }
}

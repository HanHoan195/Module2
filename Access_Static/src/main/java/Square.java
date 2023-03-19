public class Square extends Rectangle{

    public Square(){

    }
    public Square(double size){
        super(size, size);
    }
    public Square( String color, boolean filled,double size){
        super(color, filled,size,size);
    }


    public double getSize() {
        return getWidth();
    }
    public void setSize( double size){
        setWidth(size);
        setHeight(size);
    }
//    @Override
//    public void setLength(double length){
//        setSize(length);
//    }
    @Override
    public String toString(){
        return "A Square with size = " +getSize() + " , which is a subclass of: " + super.toString();
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square("yellow", true, 5.8);
        System.out.println(square);
    }
}

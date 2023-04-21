package old.Triangle_Shape;

public class Triangle {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public Triangle(){

    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1){
        this.side1 = side1;
    }
    public double getSide2(){
        return side2;
    }
    public void setSide2(double side2){
        this.side2 = side2;
    }
    public double getSide3(){
        return side3;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }
    public double getArea(){
        double h = this.side1 * (Math.sqrt(3/2));//tính đường cao h
        return (h * side3) / 2; //diện tích tam giác đều
    }
    public double getPerimeter(){
        return side1 * 3;
    }
    @Override
    public String toString (){
        return String.format("Độ dài tam giác đều: %s\nDiện tích tam giác: %s\nChu vi tam giác: %s",side3,getArea(),getPerimeter());
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập độ dài của tam giác đều:");
//        double si = scanner.nextDouble();
//        System.out.println("Màu của tam giác:");
//        String color = scanner.nextLine();

        Triangle triangle = new Triangle();
        System.out.println(triangle);
    }
}

package old.Cirle_Cylinder;

public class Cylinder extends Circle{
    private float heigth;

    public Cylinder(){
        //ở đây mặc định nó gọi đi đâu?
        //gọi lên hàm khởi tạo lớp cha
    }
    public Cylinder(float radius, String color, float heigth){
        //C1: super(radius, color) cái này để lm gì?
        //gọi thuộc tính thuộc lớp cha
        super(radius, color);

        //C2: Vì sao ở đây  this.radius và this.color đc?
        //Vì Cylinder đang kế thừa lớp Circle nên đc thừa kế những thuộc tính của lớp cha
//        this.radius = radius;
//        this.color= color;

        //C3: vì sao gọi đc set?
        //vì đang kế thừa nên có đc những phương thức của lớp cha
        //setRadius(radius);
//        setColor(color);

        //C4:super.setColor vì sao dùng đc
        //vì dùng từ khóa super để gọi đến phương thức của lớp cha
//        super.setRadius(radius);
//        super.setColor(color);
        this.heigth = heigth;

    }

    //Tại sao phải ghi đề phương thúc getArea?
    // vì ở lớp Cylinder ko dùng lại getArea của lớp Circle vì công thức tính diện tích khác nha
    @Override
    public float getArea(){
        // Nếu lấy this.getArea thì chuyện gì sẽ xảy ra?
        // từ khóa this sẽ gọi đến biến hoặc phương thức gần nhất
        // ở đây nó sẽ gọi đến phương thức getArea của lớp Cylinder nên sẽ xảy ra hiện tượng vòng lặp vô tận
        return super.getArea() * this.heigth;
    }

    @Override
    public String toString(){
        return String.format("Cylinder Area : %s Color: %s Radius: %s", this.getArea(),color, this.radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5, "Red");
        //System.out.println(circle);

        Cylinder cylinder = new Cylinder(3,"Blue",10);
       System.out.println(cylinder);

        //ở đây sử dụng tính chất gì
        //Một biến thuộc kiểu dữ liệu của lớp cha tham chiếu tới một đối tượng của lớp con.
        //ở đây sử dụng tính đa hình
        Circle c1 = new Cylinder(3,"Black", 10);
        System.out.println(c1);

        //c1.getArea(): lấy phương thức nào để thực thi
        // lấy phương thức của lớp Cylinder(kiểu thực tế)
        float area = c1.getArea();
        System.out.println("Area c1: " + area);
    }
}


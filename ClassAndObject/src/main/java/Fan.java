public class Fan {
    //hằng được đặt tên là SLOW, MEDIUM, và FAST với giá trị 1, 2, và 3 để biểu thị tốc độ quạt
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    //Trường speed có kiểu số nguyên (private int) để xác định tốc độ quạt, mặc định là SLOW
    private int speed = SLOW;

   // Trường on có kiểu private boolean để xác định quạt đang bật hay tắt, mặc định là false (tắt).
    private boolean on = false;

    //Trường radius có kiểu private double để xác định bán kính quạt, giá trị mặc định là 5
    private double radius = 5;

    //Trường color có kiểu dữ liệu private String để xác định màu quạt, mặc định là blue
    private String color = "Blue";


    //Các getter và setter cho các thuộc tính

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        if(speed >0 && speed <4){
            this.speed = speed;
        }
    }
    public boolean isOn (){
        return on;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        if(radius > 0){
            this.radius = radius;
        }
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    //Phương thức khởi tạo không tham số tạo đối tượng fan mặc định
    public Fan(){

    }


    //display
    public String infomationAboutFan(){
        if(this.on){
            return "Your fan is ON. Speed : " + this.speed + " , color: " + this.color + " and radius : " + this.radius +".";
        }
        return  " Your fan is OFF. Color : " + this.color + " and radius : " + this.radius;
    }
}

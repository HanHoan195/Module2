package Point2D_3D;

public class Point3D extends Point2D{
    private float z;


    public Point3D(float x ,float y ,float z){
        //Cách 1: super để lm gi?
        //gọi đến phuong thức của lớp cha để lấy hai giá trị x, y
        super(x,y);


        //Cách 2: đc kế thừa phương thức setX , setY của lớp cha
//        this.setX(x);
//        this.setY(y);

        //Cách 3:gọi đến phương thức setX setY của lớp cha
//        super.setX(x);
//        super.setY(y);
        this.z = z;
    }
    public Point3D(){
        //Chỗ này có  nghĩa gì?
        //mặc định gọi lên hàm khơi tạo của lớp cha nên có thể ko cần super
    }

    public float getZ() {
        //this có ý nghĩa gì?
        //this đại diên cho đối tượng hiện tại nên có thể lấy đc gái trị z
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }


    public float[] getXYZ() {
       float[] xyz = new float[3];
       //Chỗ này là sao
        // Vì sao getX() cũng được, mà this.getX() cũng được, super.getX() cũng được
       xyz[0] = getX();  //đc kế thừa phương thức getX của lớp cha
       xyz[1] = super.getY();//gọi đến phương thứ getY của lớp cha
       xyz[2] = this.getZ();//lấy giá trị z ở đối tượng hiện tại
       return xyz;
    }


    public void setXYZ(float x, float y, float z) {
       setY(y);
       setX(x);
        this.z = z;
    }
    public String toString(){

        return String.format("(%s , %s, %s)", this.getX(), this.getY(),this.z);
    }
}




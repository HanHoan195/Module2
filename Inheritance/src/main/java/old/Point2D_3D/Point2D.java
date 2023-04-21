package old.Point2D_3D;

public class Point2D {
    //Biên x này là gì?
    // đây là biến instance của đối tượng có giá trị mặc định là 0.0f
    private float x;
    private float y;

    //Hàm khởi tạo để lm gì?
    // để khởi tạo đối tượng
    public Point2D (){

    }
    public Point2D( float x, float y){
        this.x = x;
        this.y = y;
    }


    //getter setter để lm gì?
    //để kiểm soát quyền truy cập và cập nhật thuộc tính
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[] xy=new float[2];
        xy[0] = x;
        xy[1] = y;
        return xy;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    // phương thức toString() từ đâu ra và nó để làm gì ?
    // Tại sao phải ghi đè phương thức này?

    // toString nằm trong lớp object, để hiện thị thông tin của đối tượng
    //ghi đè phương thức này vì ko muốn dùng lại của lớp cha
    @Override
    public String toString (){

        return String.format("(%s, %s)", this.x, this.y);
    }

//    public static void main(String[] args) {
//        String toado = "(2,3)";
//
//        int indexLast = toado.lastIndexOf(")");         // indexLast:4
//        String data = toado.substring(1, indexLast ); //toado: "(2,3)" indexLast: 4 data:"2,3"
//
//        String[] items = data.split(",");//data: "2,3" items: ["2" , "3"]
//
//        //System.out.println(Arrays.toString(items));
//    }
}

package resizeable;

public abstract class Geometric implements Resizeable{
    private String color;
    private boolean filled;

    //phương thức asbtract: không có phần thân kết thúc bằng dấu ;
    public abstract float getArea ();

    //khởi tạo đối tượng hai tham số
    public Geometric(String color, boolean filled){
        this.color= color;
        this.filled = filled;
    }
    //bắt buộc khởi tạo contrucstor không tham số
    public Geometric(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    //ghi đè phương thức toString()
    @Override
    public String toString(){
        return String.format("Geometric color: %s , filled: %s",color, filled);
    }
}

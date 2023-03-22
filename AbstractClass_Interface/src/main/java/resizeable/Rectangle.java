package resizeable;

public class Rectangle extends Geometric{
    private float width;
    private float heigth;
    public Rectangle(float width, float heigth, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.heigth = heigth;
    }

    public Rectangle(float width, float heigth){
        this.width = width;
        this.heigth = heigth;
    }
    @Override
    public float getArea(){
        return this.width * this.heigth;
    }

    @Override
    public void resize(float perccent) {
        this.width = (float) (this.width * Math.sqrt(perccent));
        this.heigth = (float) (this.heigth * Math.sqrt(perccent));
    }

    @Override
    public String toString(){
        return String.format("Rectange color: %s , filled: %s, area: %s",
                getColor(),isFilled(), this.getArea());
    }
}

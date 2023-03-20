package Point_MoveablePoint;

import java.util.Arrays;

public class MovabelPoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MovabelPoint(){

    }
    public MovabelPoint(float xSpeed, float ySpeed){
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
    }
    public MovabelPoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public float getYSpeed(){
         return ySpeed;
    }
    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }
    public float[] getSpeed(){
        float[] speed = new float[2];
        speed[0] = xSpeed;
        speed[1] = ySpeed;
        return speed;
    }
    @Override
    public String toString(){
        return String.format("(%s, %s ) speed = (%s, %s)" ,this.getX(),this.getY(),xSpeed,ySpeed);
    }
    public void move(){
        setX(getX() + this.xSpeed);
        setY(getY()+ this.ySpeed);
    }

    public static void main(String[] args) {
        MovabelPoint movabelPoint = new MovabelPoint(3,5,4,6);
        System.out.println(movabelPoint);

        movabelPoint.move();
        System.out.println(" MovabelPoint");
        System.out.println(Arrays.toString( movabelPoint.getXY()));
    }

}

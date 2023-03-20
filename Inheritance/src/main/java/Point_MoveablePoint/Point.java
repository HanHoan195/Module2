package Point_MoveablePoint;

import Point2D_3D.Point2D;

public class Point {
    private float x;
    private float y;
    public Point(){

    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }
    public void setXY(float x , float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] xy = new float[2];
        xy[0] = x;
        xy[1] = y;
        return xy;
    }
    public String toString(){
    return String.format("( %s, %s )",this.x, this.y);
    }

    public static void main(String[] args) {
        Point point = new Point(3,6);
        System.out.println(point);
    }
}

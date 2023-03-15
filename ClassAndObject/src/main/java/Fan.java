public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

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
}

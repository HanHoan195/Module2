

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class StopWatch {
    private LocalTime startTime;
    private  LocalTime endTime;
    //    public StopWatch (LocalTime startTime, LocalTime endTime) {
//        this.startTime = startTime;
//        this.endTime = endTime;
//    }
    public void setStartTime() {
        this.startTime = LocalTime.now();
    }
    public void start() {
        this.startTime = LocalTime.now();
    }
    public void end() {
        this.endTime = LocalTime.now();
    }
    public long getElapsedTime() {
        return ChronoUnit.MILLIS.between(this.startTime, this.endTime);
    }
    public static void main(String[] args) {
        Random random = new Random();
        double[] myArray = random.doubles(1000).toArray();;

        StopWatch myStopWatch = new StopWatch();
        myStopWatch.setStartTime();
        myStopWatch.start();
        for (int i = 0; i < myArray.length-1; i++) {
            for (int j = i+1; j < myArray.length; j++) {
                double temp;
                if (myArray[i] > myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
        myStopWatch.end();

        System.out.println("Total time (ms): " + myStopWatch.getElapsedTime());
    }
}
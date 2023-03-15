import java.util.Scanner;

public class FindMaxInMatrix {
    public static void main(String[] args) {

        int[][] arr = {{1,4,6}, {8,4,3}};
        int max = arr[0][0];
        for (int i =0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];

                }
            }
        }
        System.out.println("Max: " + max );
    }
}

import java.util.Arrays;

public class Bt7 {
    public static void main(String[] args) {
        //Sắp xếp số dương tăng dần, các số âm giữ nguyên vị trí
        int[] arr = {-1,3,-5,9,-2,2};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > 0 && arr[i] > arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

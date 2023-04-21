import java.util.Arrays;

public class BT8 {
    public static void main(String[] args) {
        //Sắp xếp lẻ tăng dần nhưng giá trị khác giữ nguyên vị trí
        int[] arr = {8,7,6,5,4,3,2,1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] % 2 != 0 && arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
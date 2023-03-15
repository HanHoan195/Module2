import java.lang.reflect.Array;
import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr={2,3,5,8,4};
        int index = 2;
       int[] b = deleteElement(arr, 2);
        System.out.println(Arrays.toString(b));

    }
    public static int [] deleteElement(int[] arr, int index ) {
        int[] arr2 = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            arr2[i] = arr[i];
        }
        for (int j = index + 1; j < arr.length; j++) {
            arr2[j - 1] = arr[j];
        }
        return arr2;

    }
}

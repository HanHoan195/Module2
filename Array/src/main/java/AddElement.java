import java.util.Arrays;

public class AddElement {
    public static int[] addElement(int[] arr, int value, int index){
            int[]arr2 = new int[arr.length+1];
            for(int i=0;i<index;i++){
                arr2[i] = arr[i];
            }

            for(int i = index+1;i<=arr.length;i++){
                arr2[i] = arr[i-1];
                arr2[index] = value;
            }
            return arr2;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,0,6,4};
            int value = 9;
            int index = 3;
            int[] aNew = addElement(arr,9, 3);
//            arr = aNew;
        System.out.println(Arrays.toString(aNew));
    }
}

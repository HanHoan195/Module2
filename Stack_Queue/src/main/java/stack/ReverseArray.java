package stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr= {1,3,4,6,7};
        for (int i=0;i< arr.length;i++){
            stack.push(arr[i]);
        }
        System.out.println(stack);

        for (int j=0;j< arr.length;j++){
            arr[j] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}

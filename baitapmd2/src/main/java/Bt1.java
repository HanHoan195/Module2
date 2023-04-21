import javax.swing.*;

public class Bt1 {
    public static void main(String[] args) {
        //Hãy liệt kê các giá trị có toàn chữ số lẻ trong mảng 1 chiều các số nguyên
        checkOddNumber();



        }
    public static void checkOddNumber() {
        int[] arr = {1, 42, 52, 579, 35};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }



    }



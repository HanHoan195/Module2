public class Bt4 {
    // Kiểm tra mảng có giá trị 0 hay không? Có trả về 1, không có trả về 0
    public static void main(String[] args) {
        int[] arr = {0, 34, 30, 65};
//        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                b = 1;
            }
        }
        System.out.println(b);


    }
}

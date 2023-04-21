public class Bt3 {
    //Đếm số lượng giá trị tận cùng bằng 5 trong mảng
    public static void main(String[] args) {
        int[] arr = {5,23,45,55,67,135};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5){
                count++;
            } else if (arr[i]%10 == 5){
                count++;
            }
        }
        System.out.println(count);
    }
}

public class Bt2 {
    public static void main(String[] args) {
        //Bài 2: Hãy liệt kê các vị trí mà giá trị tại đó là số nguyên tố
        //trong mảng 1 chiều các số nguyên
        int[] arr = {3,6,4,5,7,11};
        for (int i=0;i< arr.length;i++){
            if (isPrime(arr[i])){
                System.out.println(i);
            }
        }

    }

    public static boolean isPrime(int n){
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

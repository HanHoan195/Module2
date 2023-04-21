public class Bt5 {
    //Kiểm tra mảng có giảm dần hay không
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,8,9};
//        int[] arr= {9,8,6,4,1};
       boolean b = isDecresing(arr);
        System.out.println(b);
    }

    public static boolean  isDecresing(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return true;
            }
        }
        return false;
    }
}

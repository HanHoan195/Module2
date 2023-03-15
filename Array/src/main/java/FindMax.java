public class FindMax {
    public static void main(String[] args) {
        int[] arr= {2,9,6,8,0};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất là : " + max);
    }
}

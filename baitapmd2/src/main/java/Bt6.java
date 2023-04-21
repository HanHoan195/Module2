public class Bt6 {
    public static void main(String[] args) {
        //Hãy cho biết tất cả các phần tử trong mảng a có nằm trong mảng b không
        int[] arr1={1,2,4,5,6,9};
        int[] arr2={3,10};
        boolean a = checkArr(arr1, arr2);
        System.out.println(a);

    }
    public static boolean checkArr(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == arr1[i]){
                    return true;
                }
            }
        }
        return false;
    }


}

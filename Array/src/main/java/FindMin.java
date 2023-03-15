public class FindMin {
    public static void main(String[] args) {
        int[] arr={2,3,9,7,8};
        findMin(arr);

    }
    public static void findMin(int [] arr){
        int min = arr[0];
        int index = 0;
        for(int i =0;i< arr.length;i++){
            if(arr[i]< min){
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Min : " + min + "\nAt index : " + index);
    }
}

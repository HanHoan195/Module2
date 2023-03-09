import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        //nhập số năm(enter year)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year to check?");
        int year;
        year = scanner.nextInt();
        //check leap year

//        if(year % 4 == 0 ){
//            if(year % 100 == 0){
//                if(year % 400 == 0){
//                    System.out.println(year + " is leap year.");
//                } else {
//                    System.out.println(year + " is not leap year");
//                }
//            }else {
//                System.out.println(year + " is leap year");
//            }
//        } else {
//            System.out.println(year + " is not leap year");
//        }

            // kiểu boolean
//        boolean isLeapYear = false;
//        if(year % 4 == 0){
//            if(year % 100 == 0){
//                if(year % 400 == 0){
//                    isLeapYear = true;
//                }
//            }  else {
//                    isLeapYear = true;
//            }
//        }
//        if(isLeapYear){
//            System.out.printf("%d is leap year ", year);
//        } else {
//            System.out.printf("%d is not leap year", year);
//        }

            //kỹ thuật tách biến
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if(isLeapYear){
            System.out.printf("%d is leap year", year);
        } else {
            System.out.printf("%d is not leap year", year);
        }



    }
}

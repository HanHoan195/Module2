import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        //nhập tháng cần tính ngày
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want ot count day?");

        int month = scanner.nextInt();

        String daysInMonth;

        //swicth case
        switch (month){
            case 2:
                //System.out.println("Month " + month + " has 28 or 29 days");
                daysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
//                System.out.println("Month " + month + " has 31 day")

                daysInMonth = "31"; break;

            case 4:
            case 6:
            case 9:
            case 11:
                //System.out.println("Month " + month + " has 30 day");
                daysInMonth = "30";break;
            default:
               // System.out.println("Invalid input");
                daysInMonth = "";
        }

        if(!daysInMonth.equals("")) System.out.printf("The month '%d' has %s days  ", month, daysInMonth);
            else System.out.printf("Invalid input");


    }
}

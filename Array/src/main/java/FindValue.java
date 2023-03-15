import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        String[] students ={"Hoàn", "Pháp", "Bằng", "Nghĩa"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name to find: ");
        String inputName = scanner.nextLine();
//        boolean isExist = false;
        for(int i =0;i< students.length;i++){
            if(students[i].equals(inputName)){// equals so sánh hai chuỗi dựa trên nội dung
                System.out.println("Position of the student in the list ' " + inputName + " ' is " + i);
//                isExist = true;
                break;
            }
        }
//        if(!isExist){
            System.out.println("Not found '" + inputName + "' in the list");
        }
    }
//}

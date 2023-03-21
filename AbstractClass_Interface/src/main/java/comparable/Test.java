package comparable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];
        employees[0] = new Employee("Hoàn",20,1000);
        employees[1] = new Employee("Pháp",34   ,555);
        employees[2] = new Employee("Nghĩa",25,333);
        employees[3] = new Employee("Thiện",26,666);
        employees[4] = new Employee("Hưng",18,777);
        employees[5] = new Employee("Thi",30,888);
        employees[6] = new Employee("Hiếu",23,222);


        System.out.println("Trước khi sắp xếp");
        for (Employee employee : employees){
            System.out.println(employee);
        }


        //sắp xếp mảng
        System.out.println("Sau khi sắp xếp");
        Arrays.sort(employees);
        for (Employee employee : employees){
            System.out.println(employee);
        }


        //tìm vị trí n
        Employee emp  = new Employee("Thi",30,888);
        int n = Arrays.binarySearch(employees, emp);
        System.out.println("Vị trí" + n);
    }
}

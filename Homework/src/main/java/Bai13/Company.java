package Bai13;

import Bai13.comparator.ComparatorById;
import Bai13.model.*;

import java.util.*;
import java.sql.Date;

public class Company {
    Scanner sc = new Scanner(System.in);
    List<Employee> employees;
    public Company(){


    }


    //long id, String fullName, Date birthDay, String phone, String email,
    // EmployeeType employeeType, int expInYear, String proSkill
//    public void showEmployee(){
//
//        for (int i=0;i<employees.size();i++){
//            if(employees.get(i).getEmployeeType() == EmployeeType.Experience){
//                System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s | %-10s | %-10s \n",
//                        "ID","FullName", "DayOfBirth","Phone","Email", "EXPType","ExpYear", "ProSkill");
//
//                Experience experience = (Experience) employees.get(i);
//                System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s | %-10s | %-10s\n",
//                        experience.getId(),experience.getFullName(), experience.getBirthDay(),experience.getPhone(),
//                        experience.getEmail(), experience.getEmployeeType(), experience.getExpInYear(),experience.getProSkill());
//            }
//            if(employees.get(i).getEmployeeType() == EmployeeType.Fresher){
//                System.out.println(" ");
//                System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s | %-10s | %-20s | %-10s \n",
//                        "ID","FullName", "DayOfBirth","Phone","Email", "EXPType","Education", "GraduationDate","GraduationRank");
//
//
//                Fresher fresher = (Fresher) employees.get(i);
//                System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s | %-10s | %-20s | %-10s\n",
//                        fresher.getId(),fresher.getFullName(), fresher.getBirthDay(),fresher.getPhone(),
//                        fresher.getEmail(), fresher.getEmployeeType(), fresher.getEducation(),fresher.getGraduationDate(),fresher.getGraduationRank());
//            }
//            if(employees.get(i).getEmployeeType() == EmployeeType.Intern){
//                System.out.println("                                     ");
//                System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s | %-10s | %-10s | %-10s \n",
//                        "ID","FullName", "DayOfBirth","Phone","Email", "EXPType","Semester", "Major","Education");
//
//                Intern intern = (Intern) employees.get(i);
//                System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s | %-10s | %-10s | %-10s\n",
//                        intern.getId(),intern.getFullName(), intern.getBirthDay(),intern.getPhone(),
//                        intern.getEmail(), intern.getEmployeeType(), intern.getSemester(), intern.getMajors(), intern.getUniversityName());
//            }
////                 employees.get(i);
////            System.out.printf("%-3s | %-20s | %-35s | %-10s | %-20s | %-10s\n",
////                    employees.get(i).getId(),employee.getFullName(), employee.getBirthDay(),employee.getPhone(),
////                   employee.getEmail(), employees.get(i).getEmployeeType(), employees.get(i).getEmployeeType().);
//        }
//    }
//    public void showEmployee(List<Employee> employees){
//
//    }







    //bài sửa a Quang
    public void showEmployees(){
        System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s \n"
                ,"ID","FullName", "DayOfBirth","Phone","Email", "EmployeeType");
        for (int i=0;i<employees.size();i++){
            Employee e = employees.get(i);
            System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s \n"
                    ,e.getId(),e.getFullName(), e.getBirthDay(),e.getPhone(),e.getEmail(), e.getEmployeeType());
        }
    }

    public void addEmployees(){
        System.out.println("Nhập thông tin cơ bản:");
        System.out.println("Nhập họ và tên");
        String name = sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh");
        Date day = new Date(Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập SĐT:");
        String phone = sc.nextLine();
        System.out.println("Nhập email:");
        String email = sc.nextLine();

        System.out.println("Bạn muốn thêm loại nào?");
        System.out.println("Nhập 1. Thêm Experience");
        System.out.println("Nhập 2. Thêm Fresher");
        System.out.println("Nhập 3. Thêm Intern");

        int actionAdd = Integer.parseInt(sc.nextLine());

        Employee employee = null;

        switch (actionAdd){
            case 1:
            {

                inputEmployeeExperience(employee, employee.getFullName(), (Date) employee.getBirthDay(),employee.getPhone(),employee.getEmail()
                ,EmployeeType.Experience);

                employees.add(employee);
                break;
            }
            case 2:
            {

                inputEmployeeFresher(employee, employee.getFullName(), (Date) employee.getBirthDay(),employee.getPhone(),employee.getEmail()
                        ,EmployeeType.Experience);

                break;

            }
        }
        showEmployees();

    }

    private void inputEmployeeFresher(Employee employee, String fullName, Date birthDay, String phone, String email, EmployeeType experience) {
        System.out.println("Nhập ngày tốt nghiệp");
        Date dateGraduation = birthDay;
        System.out.println("Nhập xếp loại tốt nghiệp");
        String rankGraduation = sc.nextLine();
        System.out.println("Tốt nghiệp trường");
        String graduation = sc.nextLine();
        employee = new Fresher(maxID()+1,fullName,birthDay,phone,email,EmployeeType.Fresher,dateGraduation,rankGraduation,graduation);

        employees.add(employee);
    }

    public void inputEmployeeExperience(Employee employee,String fullName,Date date,String phone,
                                        String email,EmployeeType employeeType){
        System.out.println("Nhập năm kinh nghiệm:");
        int expYear = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập kỹ năng chuyên môn:");
        String proSkill = sc.nextLine();

        employee = new Experience(maxID()+1, fullName, date,phone,email,
                EmployeeType.Experience,expYear,proSkill);

        employees.add(employee);
    }

    public long maxID(){
        employees.sort(new ComparatorById());
        return employees.get(employees.size()-1).getId();
    }

    public static void main(String[] args) {
        Company company = new Company();
        company.showEmployees();
        company.addEmployees();
    }


    public void searchByType() {
    }
}

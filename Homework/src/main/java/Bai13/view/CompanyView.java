package Bai13.view;

import Bai13.Company;
import Bai13.comparator.ComparatorById;
import Bai13.model.Employee;
import Bai13.model.EmployeeType;
import Bai13.model.Experience;
import Bai13.service.CompanyServiceInMemory;
import Bai13.service.ICompanyService;
import Bai13.utils.ValidateUtils;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CompanyView {
    private ICompanyService iCompanyService;
    private Scanner scanner = new Scanner(System.in);
    public CompanyView(){
        iCompanyService = new CompanyServiceInMemory();
    }

    public void launcher(){
        Scanner scanner = new Scanner(System.in);
        Company company = new Company();
        boolean checkMune = true;
        do {
            System.out.println("---MENU---");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm Nhân viên");
            System.out.println("3. Sửa Nhân viên");
            System.out.println("4. Tìm nhân viên theo loại:");
            System.out.println("Nhập mục muốn chọn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    company.showEmployees();
                    break;
                case 2:
                    company.addEmployees();
                    break;
                case 3:
                    company.addEmployees();
                    break;
                case 4:
                    company.searchByType();
                    break;
                default:
                    System.out.println("Sai thông tin vui lòng nhập lại!");
            }
            boolean checkContinue = true;
            do {
                System.out.println("Bạn muốn tiếp tục không? Y/N");
                String choiceContinue = scanner.nextLine();
                switch (choiceContinue){
                    case "Y":
                        checkContinue = false;
                        checkMune = true;
                        break;
                    case "N":
                        checkContinue = false;
                        checkMune = false;
                        break;
                    default:
                        checkContinue = false;
                }

            } while (checkContinue);
        } while (checkMune);
    }

    public void showEmployees(List<Employee> result) {
        System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s \n",
                "ID", "FullName", "DayOfBirth", "Phone", "Email", "EXPType");
        System.out.println("                ");
        for (int i = 0; i < iCompanyService.showEmployee().size(); i++) {
            Employee employee = iCompanyService.showEmployee().get(i);
            System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s\n",
                    employee.getId(), employee.getFullName(), employee.getBirthDay(), employee.getPhone(),
                    employee.getEmail(), EmployeeType.Experience.toString());
        }
    }

    public void searchByType(String type) {
        System.out.println("Nhập type bạn muốn tìm:");
        type = scanner.nextLine();
        List<Employee> result = new ArrayList<>();
        for (int i=0;i< iCompanyService.showEmployee().size();i++){
            if (iCompanyService.showEmployee().get(i).getEmployeeType().toString().contains(type)){
                result.add(iCompanyService.showEmployee().get(i));
            }
        }
        showEmployees(result);
    }

    public void inputEmployeeName(Employee employee){
        String name ;
        boolean checkValid = false;
        do {
            System.out.println("Nhập tên nhân viên: ");
            name = scanner.nextLine();

            checkValid = ValidateUtils.isValidEmployeeName(name);
            if (checkValid == false){
                System.out.println("Tên không hợp lệ, vui lòng nhập lại.\n" +
                        " Tên phải từ 8-20 kí tự và bắt đầu bằng chữ cái");
            }
        } while (!checkValid);
        employee.setFullName(name);
    }


    public void addEmployeeById(long id, Employee employee) {
        System.out.println("Nhập họ và tên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh");
        Date day = new Date(Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập SĐT:");
        String phone = scanner.nextLine();
        System.out.println("Nhập email:");
        String email = scanner.nextLine();
        System.out.println("Nhập EXP Type");
        String type = scanner.nextLine();
        System.out.println("ExpinYear");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("ProSkill");
        String skill = scanner.nextLine();

        Comparator comparator = new ComparatorById();
        employee.sort(comparator);
        long maxId = iCompanyService.showEmployee().get(iCompanyService.showEmployee().size()-1).getId();
        if (type == "Experience"){
            employee = new Experience();
            employee.setId(maxId + 1);
            employee.setFullName(name);
            employee.setBirthDay(day);
            employee.setPhone(phone);
            employee.setEmail(email);
            employee.setEmployeeType(EmployeeType.valueOf(type));
            ((Experience) employee).setExpInYear(year);
            ((Experience) employee).setProSkill(skill);

            employee.add(employee);
            showEmployees((List<Employee>) employee);
        }
    }
    public void editEmployee(long id) {

        System.out.println("Nhập ID bạn muốn sửa");
        id = Long.parseLong(scanner.nextLine());

        System.out.println("Nhập họ và tên mới");
        String nameNew = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh mới");
        Date day = new Date(Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập SĐT mới:");
        String phoneNew = scanner.nextLine();
        System.out.println("Nhập email mới:");
        String emailNew = scanner.nextLine();
        System.out.println("Nhập EXP Type mới");
        String typeNew = scanner.nextLine();

        for (int i=0;i< iCompanyService.showEmployee().size();i++){
            if (id == iCompanyService.showEmployee().get(i).getId()){
                iCompanyService.showEmployee().get(i).setFullName(nameNew);
                iCompanyService.showEmployee().get(i).setBirthDay(day);
                iCompanyService.showEmployee().get(i).setPhone(phoneNew);
                iCompanyService.showEmployee().get(i).setEmail(emailNew);
                iCompanyService.showEmployee().get(i).setEmployeeType(EmployeeType.valueOf(typeNew));
            }
        }
        showEmployees(iCompanyService.showEmployee());
    }

}

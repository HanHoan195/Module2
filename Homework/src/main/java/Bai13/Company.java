package Bai13;

import java.util.*;
import java.sql.Date;

public class Company {
    Scanner sc = new Scanner(System.in);
    List<Employee> employees;
    public Company(){
    employees = new ArrayList<>();
    Employee ep1 = new Experience(1, "Hoan", new Date(1995, 5, 19),
            "142564757","hoan@gmail.com",EmployeeType.Experience,5,"java");

    Employee ep2 = new Intern(2,"Ly Ngô",new Date(1993,2,23),"124423",
            "ly@gmail.com",EmployeeType.Intern,"CNtt",2,"RMIT");

    Employee ep3 = new Fresher(3,"Quốc Pháp",new Date(1997,2,19),"124423",
            "phap@gmail.com",EmployeeType.Fresher,new Date(2022,4,20),"good","Hương vinh");


    employees.add(ep1);
    employees.add(ep2);
    employees.add(ep3);

    }


    //long id, String fullName, Date birthDay, String phone, String email,
    // EmployeeType employeeType, int expInYear, String proSkill
    public void showEmployee(){

        for (int i=0;i<employees.size();i++){
            if(employees.get(i).getEmployeeType() == EmployeeType.Experience){
                System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s | %-10s | %-10s \n",
                        "ID","FullName", "DayOfBirth","Phone","Email", "EXPType","ExpYear", "ProSkill");

                Experience experience = (Experience) employees.get(i);
                System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s | %-10s | %-10s\n",
                        experience.getId(),experience.getFullName(), experience.getBirthDay(),experience.getPhone(),
                        experience.getEmail(), experience.getEmployeeType(), experience.getExpInYear(),experience.getProSkill());
            }
            if(employees.get(i).getEmployeeType() == EmployeeType.Fresher){
                System.out.println(" ");
                System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s | %-10s | %-20s | %-10s \n",
                        "ID","FullName", "DayOfBirth","Phone","Email", "EXPType","Education", "GraduationDate","GraduationRank");


                Fresher fresher = (Fresher) employees.get(i);
                System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s | %-10s | %-20s | %-10s\n",
                        fresher.getId(),fresher.getFullName(), fresher.getBirthDay(),fresher.getPhone(),
                        fresher.getEmail(), fresher.getEmployeeType(), fresher.getEducation(),fresher.getGraduationDate(),fresher.getGraduationRank());
            }
            if(employees.get(i).getEmployeeType() == EmployeeType.Intern){
                System.out.println("                                     ");
                System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s | %-10s | %-10s | %-10s \n",
                        "ID","FullName", "DayOfBirth","Phone","Email", "EXPType","Semester", "Major","Education");

                Intern intern = (Intern) employees.get(i);
                System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s | %-10s | %-10s | %-10s\n",
                        intern.getId(),intern.getFullName(), intern.getBirthDay(),intern.getPhone(),
                        intern.getEmail(), intern.getEmployeeType(), intern.getSemester(), intern.getMajors(), intern.getUniversityName());
            }
//                 employees.get(i);
//            System.out.printf("%-3s | %-20s | %-35s | %-10s | %-20s | %-10s\n",
//                    employees.get(i).getId(),employee.getFullName(), employee.getBirthDay(),employee.getPhone(),
//                   employee.getEmail(), employees.get(i).getEmployeeType(), employees.get(i).getEmployeeType().);
        }
    }
    public void showEmployee(List<Employee> employees){
        System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s \n",
                "ID","FullName", "DayOfBirth","Phone","Email", "EXPType");
        System.out.println("                ");
        for (int i=0;i<employees.size();i++){
            Employee employee = employees.get(i);
            System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s\n",
                    employee.getId(),employee.getFullName(), employee.getBirthDay(),employee.getPhone(),
                    employee.getEmail(), EmployeeType.Experience.toString());
        }
    }

    public void addEmployee(){
        System.out.println("Nhập họ và tên");
        String name = sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh");
        Date day = new Date(Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập SĐT:");
        String phone = sc.nextLine();
        System.out.println("Nhập email:");
        String email = sc.nextLine();
        System.out.println("Nhập EXP Type");
        String type = sc.nextLine();
        System.out.println("ExpinYear");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println("ProSkill");
        String skill = sc.nextLine();

        Comparator comparator = new ComparatorById();
        employees.sort(comparator);
         long maxId = employees.get(employees.size()-1).getId();
         if (type == "Experience"){
             Experience employee = new Experience();
             employee.setId(maxId + 1);
             employee.setFullName(name);
             employee.setBirthDay(day);
             employee.setPhone(phone);
             employee.setEmail(email);
             employee.setEmployeeType(EmployeeType.valueOf(type));
             employee.setExpInYear(year);
             employee.setProSkill(skill);

             employees.add(employee);
             showEmployee();
         }



    }

    public void editEmployee(){
        System.out.println("Nhập ID bạn muốn sửa");
        long id = Long.parseLong(sc.nextLine());

        System.out.println("Nhập họ và tên mới");
        String nameNew = sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh mới");
        Date day = new Date(Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập SĐT mới:");
        String phoneNew = sc.nextLine();
        System.out.println("Nhập email mới:");
        String emailNew = sc.nextLine();
        System.out.println("Nhập EXP Type mới");
        String typeNew = sc.nextLine();

        for (int i=0;i< employees.size();i++){
            if (id == employees.get(i).getId()){
                employees.get(i).setFullName(nameNew);
                employees.get(i).setBirthDay(day);
                employees.get(i).setPhone(phoneNew);
                employees.get(i).setEmail(emailNew);
                employees.get(i).setEmployeeType(EmployeeType.valueOf(typeNew));
            }
        }
        showEmployee();
    }

    public void searchbyType(){
        System.out.println("Nhập type bạn muốn tìm:");
        String type = sc.nextLine();
        List<Employee> result = new ArrayList<>();
        for (int i=0;i< employees.size();i++){
            if (employees.get(i).getEmployeeType().toString().contains(type)){
                result.add(employees.get(i));
            }
        }
        showEmployee(result);
    }



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


}

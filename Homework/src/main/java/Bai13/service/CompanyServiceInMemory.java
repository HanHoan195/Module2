package Bai13.service;

import Bai13.comparator.ComparatorById;
import Bai13.model.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CompanyServiceInMemory implements ICompanyService{
    Scanner sc = new Scanner(System.in);
    List<Employee> employees;
    public CompanyServiceInMemory(){
        employees = new ArrayList<>();
        employees = new ArrayList<>();
        Employee ep1 = new Experience(1, "Hoan", new Date(1995, 5, 19),
                "142564757","hoan@gmail.com", EmployeeType.Experience,5,"java");

        Employee ep2 = new Intern(2,"Ly Ngô",new Date(1993,2,23),"124423",
                "ly@gmail.com",EmployeeType.Intern,"CNtt",2,"RMIT");

        Employee ep3 = new Fresher(3,"Quốc Pháp",new Date(1997,2,19),"124423",
                "phap@gmail.com",EmployeeType.Fresher,new Date(2022,4,20),"good","Hương vinh");


        employees.add(ep1);
        employees.add(ep2);
        employees.add(ep3);
    }


    @Override
    public List<Employee> showEmployee() {
        return null;
    }

    @Override
    public void addEmployeeById(long id, Employee employee) {

    }

    @Override
    public void editEmployee(long id) {

    }

}

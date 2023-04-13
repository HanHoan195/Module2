package Bai13.service;

import Bai13.model.Employee;

import java.util.List;

public interface ICompanyService {
    List<Employee> showEmployee();
    void addEmployeeById(long id, Employee employee);
    
    void editEmployee(long id);

}

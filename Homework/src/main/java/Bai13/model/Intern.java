package Bai13.model;

import Bai13.model.Employee;
import Bai13.model.EmployeeType;

import java.util.Date;

public class Intern extends Employee {


    private String majors;//chuyên ngành
    private int semester;//kỳ học
    private String universityName;//trường

    public Intern(){

    }

    public Intern(String majors, int semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(long id, String fullName, Date birthDay, String phone, String email,
                  EmployeeType employeeType, String majors, int semester, String universityName) {
        super(id, fullName, birthDay, phone, email, employeeType);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }


}

package Bai13;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Fresher extends Employee{

    private Date graduationDate;//ngày tốt nghiệp
    private String graduationRank;//xếp loại
    private String education;//trường

    public Fresher(){

    }

    public Fresher(Date graduationDate, String gradutionRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = gradutionRank;
        this.education = education;
    }

    public Fresher(long id, String fullName, Date birthDay, String phone, String email, EmployeeType employeeType,
                   Date graduationDate, String graduationRank, String education) {
        super(id, fullName, birthDay, phone, email, employeeType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}

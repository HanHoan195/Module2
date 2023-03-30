package Bai13;

import java.util.Date;

public class Experience extends Employee{
   private  int expInYear;
   private String proSkill;

   public Experience(){

   }

    public Experience(int expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience(long id, String fullName, Date birthDay, String phone, String email, EmployeeType employeeType, int expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email, employeeType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }
}

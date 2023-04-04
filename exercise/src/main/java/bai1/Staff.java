package bai1;

public class Staff extends Cadres{
    private String job;

    public Staff(){

    }

    public Staff(String fullName, int age, String gender, String address, String job) {
        super(fullName, age, gender, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}

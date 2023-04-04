package bai1;

public class Worker extends Cadres{
    private int skillLevel;

    public Worker(){

    }

    public Worker(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public Worker(String fullName, int age, String gender, String address, int skillLevel) {
        super(fullName, age, gender, address);
        this.skillLevel = skillLevel;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }
}

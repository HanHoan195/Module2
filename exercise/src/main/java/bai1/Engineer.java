package bai1;

public class Engineer extends Cadres{
    private String trainingIndustry;

    public Engineer(){

    }

    public Engineer(String fullName, int age, String gender, String address, String trainingIndustry) {
        super(fullName, age, gender, address);
        this.trainingIndustry = trainingIndustry;
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }
}

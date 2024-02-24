public class Disease extends Account{
    private String Name;
    private String Symptoms;
    private String Treatment;


    public Disease (String name, String symptoms, String treatment) {
        this.Name = name;
        this.Symptoms = symptoms;
        this.Treatment = treatment;
    }
    public Disease() {
        Name = "";
        Symptoms = "";
        Treatment = "";

    }
    public String getName() {
        return Name;
    }

    public String getSymptoms() {
        return Symptoms;
    }

    public String getTreatment(){
        return Treatment;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSymptoms(String symptoms) {
        Symptoms = symptoms;
    }

    public void setTreatment(String treatment){
        Treatment = treatment;
    }

}


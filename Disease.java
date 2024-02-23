public class Disease {
  private String Name;
  private String Symptoms;
  private String Treatment;
  

public Disease (String name, String symptoms, String treatment) {
  this.Name = name;
  this.Symptoms = symptoms;
  this.Treatment = treatment;
}
  public Disease() {
    
  }
   public String getName() {
    return this.Name;
  }

  public String getSymptoms() {
    return this.Symptoms;
  }

  public String getTreatment(){
    return this.Treatment;
  }

  public void setName(String name) {
    this.Name = name;
  }

  public void setSymptoms(String symptoms) {
    this.Symptoms = symptoms;
  }

  public void setTreatment(String treatment){
    this.Treatment = treatment;
  }
  
}

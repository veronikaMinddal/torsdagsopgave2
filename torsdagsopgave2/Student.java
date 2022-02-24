public class Student{
  //1.fields
  private String name;
  private int age;
  private boolean isFemale;
  private String datamatikerTeam;

  public Student (String tmpName, int tmpAge, boolean tmpIsFemale, String tmpDatamatikerTeam){
    this.name = tmpName;
    this.age = tmpAge;
    this.isFemale = tmpIsFemale;
    this.datamatikerTeam = tmpDatamatikerTeam;


  }

    public String getNameGroup(){
      return this.name;
      return this.datamatikerTeam;
    }

}

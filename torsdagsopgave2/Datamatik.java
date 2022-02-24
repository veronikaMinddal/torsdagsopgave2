public class Datamatik {
  public static void main (String[] args){
    Teacher tobias = new Teacher("Tobias", 38, false);
    Student veronika = new Student("Veronika", 22, true, "Gruppe H");
    Student storeWilliam = new Student("Store William", 23, false, "Gruppe H");

    System.out.println(getName.tobias());
    System.out.println(getNameGroup.veronika());
    System.out.println(getNameGroup.storeWilliam());

    Student[] arrStu;
    arr arrStu[] = new Student[10];
    arrStu[0] = ("Bjørn", 27, false, "Gruppe K");
    arrStu[1] = ("Ole", 47, false, "Gruppe B");
    arrStu[2] = ("Britta", 51, true, "Gruppe K");
    arrStu[3] = ("Laura", 21, true, "Gruppe C");
    arrStu[4] = ("Nadja", 25, true, "Gruppe A");
    arrStu[5] = ("Gustav", 22, false, "Gruppe G");
    arrStu[6] = ("Cathrine", 22, true, "Gruppe G");
    arrStu[7] = ("Sarah", 29, true, "Gruppe B");
    arrStu[8] = ("Thomas", 48, false, "Gruppe C");
    arrStu[9] = ("Daniel", 21, false, "Gruppe A");

    String thisName (int num, Student[] arrStu){
      thatName = getName.arrStu[num]();
      return thatName;
    }

    int thisNum (String thisName, Student[] arrStu){
      for (int i = 0; i < arrStu.length; i++){
      String thatName = getName.arrStu[i];
      if (thatName = thisName){
        thatNum = i;
      }
      }
      return thatName;
    }





  }
}

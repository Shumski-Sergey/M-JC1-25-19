package src.pvetashkov.lab6creditki;

public class BelarusBank extends Bank {
    private String Owner;
    //public BelarusBank(String title,  String number, String type, String syspay) {
     //   super (title, number, type, syspay);
      //  this.Owner=Owner;
   // }
    public String getOwner(){return Owner;}
    public void setOwner(String Owner){this.Owner="BlrBank";}
}

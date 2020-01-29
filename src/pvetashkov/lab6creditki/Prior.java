package src.pvetashkov.lab6creditki;

public class Prior extends Bank{
    private String Owner;
    private String type;
   // public Prior(String title, String number, String type, String syspay){
     //  super(title, syspay, number, type);
     //   this.Owner=Owner;
   // }
    public String getOwner(){return Owner;}
    public void setOwner(){this.Owner="PriorBank";}
    public String getType(){return type;}
    public void setType(){this.type="debet";}
}

package src.pvetashkov.lab6creditki;

public class VisaGold extends Prior {
    public int month;
    public String name;

    public VisaGold(String title, String number, String syspay,  String owner, String type, int month, String name){
       super(title, number, syspay, owner, type);
       this.month=month;
       this.name=name;

  }
    public int getMonth(){return month;}
    public void setMonth(){this.month=12;}
    public String getName(){return name;}
    public void setName(){this.name="Ivan";}
}

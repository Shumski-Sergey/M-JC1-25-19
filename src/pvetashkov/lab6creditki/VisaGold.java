package src.pvetashkov.lab6creditki;

public class VisaGold extends Prior {
    public int month;
    public boolean wireless;
    public String name;

    public VisaGold(String title,  String type, String number, String owner){
      // super(title, number, owner, number);
       this.wireless=wireless;
       this.month=month;
       this.name=name;

  }
    public int getMonth(){return month;}
    public void setMonth(){this.month=month;}
    public boolean getWireless(){return wireless;}
    public void setWireless(){this.wireless=wireless;}
    public String getName(){return name;}
    public void setName(){this.name=name;}
}

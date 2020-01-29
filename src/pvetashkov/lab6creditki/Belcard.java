package src.pvetashkov.lab6creditki;

public class Belcard extends BelarusBank {
    private boolean wireless;
    private int srok;
    private String name;

    public Belcard(String title,  String number, String type, String owner){
      super ();
     this.wireless=wireless;
     this.srok=srok;
     this.name=name;
   }
    public boolean getWireless(){return wireless;}
    public void setWireless(){this.wireless=wireless;}
    public int getSrok(){return srok;}
    public void setSrok(){this.srok=srok;}
    public String getName(){return name;}
    public void setName(){this.name=name;}
}

package src.pvetashkov.lab6creditki;

public class Belcard extends BelarusBank {
    private String SysPay;
    private boolean wireless;
    private int srok;
    private String name;

    public Belcard(String title,  String number, String type, String owner){
        super (title, number, type);
        this.SysPay="debet";
        this.wireless=true;
        this.srok=srok;
        this.name=name;
    }
    public String getSysPay(){return SysPay;}
    public void setSysPay(){this.SysPay=SysPay;}
    //public boolean getWireless(){return wireless;}
   // public void setWireless(){this.wireless=wireless;}
    public int getSrok(){return srok;}
    public void setSrok(){this.srok=srok;}
    public String getName(){return name;}
    public void setName(){this.name=name;}
}

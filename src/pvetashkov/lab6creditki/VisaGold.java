package src.pvetashkov.lab6creditki;

public class VisaGold extends Prior {
    private String SysPay;
    private int month;
    private boolean wireless;
    private String name;

    public VisaGold(String title,  String type, String number,String owner){
        super(title, number, owner);
        this.SysPay="credit";
        this.wireless=false;
        this.month=month;
        this.name=name;

    }
    public String getSysPay(){return SysPay;}
    public void setSysPay(){this.SysPay=SysPay;}
    public int getMonth(){return month;}
    public void setMonth(){this.month=month;}
    public String getName(){return name;}
    public void setName(){this.name=name;}
}

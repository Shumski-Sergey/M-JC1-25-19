package src.pvetashkov.lab6creditki;

public class Prior extends Bank{
    private String Owner;
    public Prior(String title, /*String name,*/ String number, String type){
       // super(title, name, number, type);
        this.Owner=Owner;
    }
    public String getOwner(){return Owner;}
    public void setOwner(){this.Owner="PriorBank";}
}

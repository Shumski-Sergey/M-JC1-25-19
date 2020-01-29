package src.pvetashkov.lab6creditki;

public class BelarusBank extends Bank {
    private String Owner;
    public BelarusBank(String title, /*String name,*/ String number, String type) {
        //super (title, /*name,*/ number, type);
        this.Owner=Owner;
    }
    public String getOwner(){return Owner;}
    public void setOwner(String Owner){this.Owner="BlrBank";}
}

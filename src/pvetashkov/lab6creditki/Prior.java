package src.pvetashkov.lab6creditki;

public class Prior extends Bank{
    private String owner;
    private String type;

    public Prior(String title, String number, String syspay, String owner, String type) {
        super(title, number, syspay);
        this.owner=owner;
        this.type=type;
    }
    public String getOwner(){return owner;}
    public void setOwner(String owner){this.owner="Aus";}
    public String getType(){return type;}
    public void setType(String type){this.type="cr";}
}

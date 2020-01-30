package src.pvetashkov.lab6creditki;

public class Belcard extends BelarusBank {
    private int srok;
    private String name;

    public Belcard(String title,  String number, String syspay, String country, int srok, String name){
        super(title, number, syspay, country);
        this.srok=srok;
        this.name=name;
   }
    public int getSrok(){return srok;}
    public void setSrok(){this.srok=srok;}
    public String getName(){return name;}
    public void setName(){this.name=name;}
}

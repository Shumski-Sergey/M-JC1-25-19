package src.pvetashkov.lab6creditki;

public class BelarusBank extends Bank {
    private String country;

    public BelarusBank(String title, String number, String syspay, String country) {
        super(title, number, syspay);
        this.country=country;
    }

    public String getCountry(){return country;}
    public void setCountry(String Country){this.country=country;}
}

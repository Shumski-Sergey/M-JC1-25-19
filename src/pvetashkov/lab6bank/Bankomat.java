package pvetashkov.lab6bank;

public class Bankomat {
    private int twenty;
    private int fifty;
    private int hundred;

    public Bankomat (int twenty, int fifty, int hundred){
        this.twenty=twenty;
        this.fifty=fifty;
        this.hundred=hundred;
    }
    public int getTwenty(){return twenty;}
    public void setTwenty(){this.twenty=twenty;}
    public int getFifty(){return fifty;}
    public void setFifty(){this.fifty=fifty;}
    public int getHundred(){return hundred;}
    public void setHundred(){this.hundred=hundred;}

}

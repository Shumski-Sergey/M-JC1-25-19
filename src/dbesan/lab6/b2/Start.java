package dbesan.lab6.b2;

import dbesan.lab6.b2.util.InputMoney;
import dbesan.lab6.b2.util.Sub;

import java.io.IOException;


public class Start {
    private static long rubles;
    public static long getRubles() {
        return rubles;
    }

    public static void setRubles(long rubles) {
        Start.rubles = rubles;
    }


    public static void main(String[] args) throws IOException {
        rubles = InputMoney.InputRub();
       //new Summ(rubles);
        new Sub(rubles);

    }


}





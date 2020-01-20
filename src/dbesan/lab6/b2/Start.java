package dbesan.lab6.b2;

import dbesan.lab6.b2.util.InputCop;
import dbesan.lab6.b2.util.InputRub;
import dbesan.lab6.b2.util.Summ;

import java.io.IOException;


public class Start {
    private static long rubles;
    private static int penny;
    public static void main(String[] args) throws IOException {
        rubles = InputRub.InputRub();
        penny = InputCop.InputCop();
        new Summ(rubles, penny);
    }


}





package dbesan.lab6.b2.util;
import static dbesan.lab6.b2.util.InputMoney.PENNY_DOT;

public class OutputMoney {
        OutputMoney(long summ) {
        String Strsumm = Long.toString(summ);
        String concation = "";
        char[] chsumm = Strsumm.toCharArray();
        for (int i = 0; i < chsumm.length - PENNY_DOT; i++)//тут отделяем  последние числа и остается основная сумма
        {
            concation = concation.concat(Character.toString(chsumm[i]));

        }
        long concationed = Long.parseLong(concation);
        String concPen = "";

                char [] listarr = new char[(int) PENNY_DOT];
        for (long i = (chsumm.length - 1) - PENNY_DOT; i < (chsumm.length - 1) ; i++) {
for(int j = 0; j<listarr.length;j++){
                       listarr[j] = chsumm[(int) i];}

        }

        for(int i = 0; i<listarr.length; i++){
                concPen = concPen.concat(Character.toString(listarr[i]));}
        long dotpennys = Long.parseLong(concPen);

        System.out.println(concationed + "," + dotpennys);
    }
}

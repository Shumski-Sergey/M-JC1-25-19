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
        for (int i = chsumm.length; i > chsumm.length - PENNY_DOT; i--) {
            concPen = concPen.concat(Character.toString(chsumm[i - 1]));
        }
        long dotpennys = Long.parseLong(concPen);

        System.out.println(concationed + "," + dotpennys);
    }
}

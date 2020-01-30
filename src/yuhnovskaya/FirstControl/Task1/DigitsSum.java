package src.yuhnovskaya.FirstControl.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitsSum {
    String str;

    public DigitsSum(String str) {
        this.str = str;
    }

    public static int DigitsSum(String str) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(str);
        int sum = 0;
        while (matcher.find()) {
            int i=matcher.start();//Index of digit
            int digit=Character.getNumericValue(str.charAt(i));//value of digital symbol
            sum = sum + digit;
        }
        return sum;
    }
}

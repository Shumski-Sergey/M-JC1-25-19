package src.yuhnovskaya.FirstControl.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Digits_Num {
    String str;

    public Digits_Num(String str) {
        this.str = str;
    }

    public static int DigitsNum(String str){
        Pattern pattern=Pattern.compile("[0-9]");
        Matcher matcher=pattern.matcher(str);
        int num=0;
        while (matcher.find()){
            num=num+1;
        }
        return num;
    }
}
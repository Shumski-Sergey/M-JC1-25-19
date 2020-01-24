package dbesan.lab5strings;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A6 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Pattern pattern = Pattern.compile("[ ]"); //считаем слова по пробелу
        Pattern patternend = Pattern.compile("\\z");//считаем последнее слово
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова через пробелы");
        String inpstr = scanner.nextLine();
        Matcher matcher = pattern.matcher(inpstr);//матчер на перые паттерны
        Matcher matcherend = patternend.matcher(inpstr);
        int strcount = 0;
        while (matcher.find() || matcherend.find()) {
            strcount++;
        }//сколько слов

        String[] arrStr = inpstr.split(" ");//делим на слова строку
        for (int i = 0; i < arrStr.length; i++) {
            for(int j = 0; j<arrStr[i].length();j++){
            char firstChar = arrStr[i].charAt(j);
              String first = Character.toString(firstChar);
              byte[] first2=first.getBytes("Unicode");
              String result = new String(first2, "Unicode");
               System.out.print

                       (result);}

        }
    }
}

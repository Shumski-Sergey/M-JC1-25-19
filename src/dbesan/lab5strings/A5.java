package dbesan.lab5strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class A5 {
    public static void main(String[] args) {}} /*

        Pattern pattern = Pattern.compile("[ ]"); //считаем слова по пробелу
        Pattern patternend = Pattern.compile("\\z");//считаем последнее слово
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите слова через пробелы");
        String inpstr = scanner.nextLine();
        Matcher matcher = pattern.matcher(inpstr);//матчер на перые паттерны
        Matcher matcherend = patternend.matcher(inpstr);
        int strcount = 0;
        while (matcher.find() || matcherend.find())
        {strcount++; }//сколько слов
        String[] arrStr = inpstr.split(" ");//делим на слова строку
        int latcount = 0;//счетчик слов с латиницей
                for (int i = 0; i < arrStr.length; i++) //цикл считает сколько слов с латиницей, чтобы сделать массив
                {
            Pattern pattern1 = Pattern.compile("^[a-zA-Z]$");
            Matcher matcher1 = pattern1.matcher(arrStr[i]);
                    while (matcher1.find())
                    {latcount++;}
                }
        String[] arrLat = new String[latcount];// сюда пишутся латинские слова
        for (int i = 0; i < arrStr.length; i++) //цикл ищет латинские слова и пишет их в массив
        {
             Pattern pattern2 = Pattern.compile("^[a-zA-Z]$");
            Matcher matcher2 = pattern2.matcher(arrStr[i]);
            while (matcher2.find())
            {for(int j = 0; j<arrLat.length; j++) //непосредственно запись
            {
                arrLat[j]=arrStr[i];
            }
            }
        }
        int glcount = 0;//гласные
        int soglcount = 0;//согласные
        int length = 0;//длина, служебная для того что ниже
        for (int i = 0; i < arrLat.length; i++) {
            for (char character : arrLat[i].toCharArray()) //делаем строку для того чтобы выяснить длину отдельного слова
            {
                length = arrStr[i].length();
            }}
        String[] arrtmp = new String[length];
        int finalcount = 0;//вывести количесто слов с равным количеством гласных и согласных - это счетчик
        for (int i = 0; i < arrLat.length; i++) {
           for (char character : arrLat[i].toCharArray()) {
             arrtmp[i] = String.valueOf(character);//возможно не верно, тест не представляется возможным, ибо проблема выше
            }
            Pattern pattern3 = Pattern.compile("[aeiouyAEIOUY]");
            Matcher matcher3 = pattern3.matcher(arrtmp[i]);
            Pattern pattern4 = Pattern.compile("[qwrtpsdfghjklzxcvbnmQWRTPSDFGHJKLZXCVBNM]");
            Matcher matcher4 = pattern4.matcher(arrtmp[i]);
            while (matcher3.find()) {
                glcount++;
            }
            while (matcher4.find()) {
                soglcount++;
            }
            if(glcount==soglcount) {finalcount++;}
        }
        System.out.println(finalcount);
    }
        }
*/




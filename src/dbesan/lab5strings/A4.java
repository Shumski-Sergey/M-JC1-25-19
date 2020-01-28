package dbesan.lab5strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class A4 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[ ]"); // ловит все слова кроме последнего
        Pattern pattern1 = Pattern.compile("\\z"); // ловит последнее слово
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова через пробелы");
        String inpstr = scanner.nextLine();
        Matcher matcher = pattern.matcher(inpstr); // соответсвенно к строкам 11 и 12
        Matcher matcher1 = pattern1.matcher(inpstr);
        int strcount = 0; //счетчик слов
        while (matcher.find() || matcher1.find()) //ищем количество слов
        {
            strcount++;
        }
        String[] arrStr = inpstr.split(" ");//пишем слова в массив со словами
        String[] arrStr1 = new String[21474];//массив для соответственной печати
        int[] arrLen = new int[strcount]; //массив с длинами
        int length = 0;
        for (int i = 0; i < strcount; i++) {
            for (char character : arrStr[i].toCharArray()) { //превращаем строку в массив чаров, чтобы посчитать ее длину
                length = arrStr[i].length();//собсно, длина строки
                arrLen[i] = length;
                arrStr1[length] = arrStr[i];
            }
        }
        Arrays.sort(arrLen); //сортируем массив с длинами

        System.out.println(arrStr1[arrLen[0]] + " " + arrLen[0]);//выводим, берем длину из отсортированного массива с длинами и с позиции соответствующей длине берем строку из массива со строками


    }

}

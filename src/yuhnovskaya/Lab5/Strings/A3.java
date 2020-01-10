package yuhnovskaya.Lab5.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//3. Имеется строка с текстом. Вывести текст, составленный из последних букв
//всех слов
public class A3 {
    public static void main(String[] avgs){
        System.out.println("Enter a text: ");
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        Pattern pattern=Pattern.compile("[a-zA-Z]\\b");
        Matcher last_symb=pattern.matcher(text);
        System.out.print("New word: ");
        while (last_symb.find()) {
            System.out.print(text.substring(last_symb.start(), last_symb.end()));
        }
    }
}

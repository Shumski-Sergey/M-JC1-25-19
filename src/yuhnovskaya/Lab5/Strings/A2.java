package yuhnovskaya.Lab5.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//2. Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//текста также могут быть пробелы, но могут и отсутствовать.
public class A2 {
    public static void main(String[] avgs){
        System.out.println("Enter text:");
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        Pattern pattern=Pattern.compile("(^ *\\w)|( +\\w)");
        Matcher word=pattern.matcher(text);
        int num=0;
        while (word.find()) {
            num = num + 1;
        }
        System.out.println("\nNumber of words is "+num);
    }
}

package yuhnovskaya.Lab5.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1. Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество
public class A1 {
    public static void main(String[] avgs){
        System.out.print("Enter a string: ");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        Pattern pattern=Pattern.compile("[,.;:?!-]");

        Matcher matcher=pattern.matcher(str);
        int num=0;
        while (matcher.find()){
            num=num+1;
        }
        System.out.print("Number of punctuation marks: "+num);
    }
}

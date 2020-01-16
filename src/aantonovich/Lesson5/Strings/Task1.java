package aantonovich.Lesson5.Strings;//Найти в строке не только запятые,
// но и другие знаки препинания. Подсчитать общее их количество

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main (String[] args){
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите текст с различными знаками препинания:");
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("[.,;:?!]");
        Matcher matcher = pattern.matcher(text);
       while (matcher.find()){
           count++;
       }
        System.out.println("В тексте " + count + " знаков препинания.");
    }
}

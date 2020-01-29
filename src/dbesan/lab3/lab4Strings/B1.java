package dbesan.lab3.lab4Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Поиск знаков препинания
 **/
public class B1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(". , ; : ! ? -");
        Scanner scanner = new Scanner(System.in);
        Matcher matcher = pattern.matcher(scanner.nextLine());
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }

}

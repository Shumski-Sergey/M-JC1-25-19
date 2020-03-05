package dbesan.lab11streams.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Logics {
    static void builderListToString() {
        List<String> arrStr = lister();
        String result = arrStr.stream()
                .filter(str -> str.matches(".*[0-9]+.*"))
                .map(str -> str.replaceAll("\\W|\\D", ""))
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }

    private static List<String> lister() {
        /*подготавливаем коллекцию для обработки*/
        Pattern pattern = Pattern.compile("[ ]"); //считаем слова по пробелу
        Pattern patternend = Pattern.compile("\\z");//считаем последнее слово
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова через пробелы");
        String inpstr = scanner.nextLine();
        Matcher matcher = pattern.matcher(inpstr);//матчер на перые паттерны
        Matcher matcherend = patternend.matcher(inpstr);
        List<String> arrStr = new ArrayList<String>();
        arrStr = Arrays.asList(inpstr.split(" "));//делим на слова строки и делаем коллекцию
        return arrStr;
    }
}

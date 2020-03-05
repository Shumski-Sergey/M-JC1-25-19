package dbesan.lab11streams.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static dbesan.lab11streams.Task2.Runner.MIX_WORLD_LENGHT;

public class Logics {
    static void builderListToString() {
        List<String> arrStr = lister();
        String result = arrStr.stream()
                .filter(x -> x.length() > MIX_WORLD_LENGHT)
                .collect(Collectors.joining(","));
        System.out.println(result);
    }

    private static List<String> lister() {
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

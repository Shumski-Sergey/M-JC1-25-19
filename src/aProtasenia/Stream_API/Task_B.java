package aProtasenia.Stream_API;
//Считать с консоли имя файла. Файл содержит слова, разделенные знаками препинания.
// Вывести в консоль количество слов "world", которые встречаются в файле. Закрыть потоки.

import src.skarpen.StreamAPI.Task_4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_B {
    public static void main(String[] args) throws IOException {
        Reader fileReader = new FileReader("src\\aProtasenia\\Stream_API\\text.txt");
        Scanner scanner = new Scanner(fileReader);
        int numberOfWorld=0;
        while (scanner.hasNextLine()) {
            Pattern pattern = Pattern.compile("\\bworld\\b");
            Matcher matcher = pattern.matcher(scanner.nextLine().toLowerCase());
            while (matcher.find()) {
                numberOfWorld++;
            }
                    }
        System.out.println("'world' was found " + numberOfWorld + " times");
        fileReader.close();
    }
}
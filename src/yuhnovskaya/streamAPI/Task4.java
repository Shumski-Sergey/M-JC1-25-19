package src.yuhnovskaya.streamAPI;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;


//Считать с консоли имя файла. Файл содержит слова, разделенные знаками препинания. Вывести в консоль количество
// слов "world", которые встречаются в файле. Закрыть потоки.
public class Task4 {
    public static void main(String [] avgs) {
        System.out.println("Enter file name:");
        Scanner scanner = new Scanner(System.in);
        File file_name = new File(scanner.nextLine());
        Pattern pattern = Pattern.compile("\\bworld\\p{P}");

        try (Stream<String> str = Files.lines(Paths.get(file_name.getAbsolutePath()))) {
            long num = str.filter(pattern.asPredicate()).count();
            System.out.print("Number of 'world' is " + num);
        } catch (IOException ignored) {
        }
    }
}
// File name:  src\yuhnovskaya\streamAPI\text.txt
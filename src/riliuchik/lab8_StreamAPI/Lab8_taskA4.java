package riliuchik.lab8_streamAPI;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.FileNotFoundException;

/**
 * Считать с консоли имя файла. Файл содержит слова, разделенные знаками препинания.
 * Вывести в консоль количество слов "world", которые встречаются в файле. Закрыть потоки.
 */

public class Lab8_taskA4 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Укажите путь к файлу (например: riliuchik\\lab8_StreamAPI\\world.txt): ");
        while (true) {
            String fileName = in.readLine();
            try {
                BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
                in.close();
                int count = 0;
                while (fileReader.ready()) {
                    String str = fileReader.readLine().toLowerCase();
                    Pattern pattern = Pattern.compile("\\bworld\\b");
                    Matcher matcher = pattern.matcher(str);
                    while (matcher.find()) count++;
                }
                fileReader.close();
                System.out.print("В указанном файле слово \"world\" встречается " + count + " раз(-а).");
                break;
            } catch (FileNotFoundException e) {
                System.out.print("Файл не найден. Попробуйте ещё раз: ");
            }
        }
    }
}
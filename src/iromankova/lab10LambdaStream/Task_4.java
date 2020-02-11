package iromankova.lab10LambdaStream;
/*4*.Считать с консоли имя файла. Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле. Закрыть потоки.*/


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Task_4 {
    private static final String FILE_DIRECTORY = "src" + File.separator + "iromankova"
            + File.separator + "lab10LambdaStream"+ File.separator + "text.txt";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new BufferedReader((new FileReader(FILE_DIRECTORY))))) {
            scanner.useDelimiter("([.,!?:;)\"(-]|\\s+)+");
            int counterWordWorld = 0;
            while (scanner.hasNext()) {
                String word = scanner.next();
                System.out.println(word);
                if (word.equals("world")) {
                    counterWordWorld++;
                }
            }
            System.out.println("Количество слов \"world\", которые встречаются в файле text.txt: " + counterWordWorld);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package tmurashka.control;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Создать и заполнить файл случайными целыми значениями. Удалить все нечетные.
 * Выполнить сортировку содержимого по возрастанию и вывести в другой файл(output)
 */

public class Task3 {
    private static final String IN_FILE_PATH = "src/tmurashka/control/input.txt";
    private static final String OUT_FILE_PATH = "src/tmurashka/control/output.txt";

    public static void main(String[] args) throws IOException {
        writeNumbersToFile();
        FileWriter writer = new FileWriter(new File(OUT_FILE_PATH));
        readNumbersFromFile().stream().filter(n -> n % 2 == 0).sorted().mapToInt(n -> n).forEach(n -> {
            try {
                writer.write(n + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.close();
    }

    private static void writeNumbersToFile() throws IOException {
        FileWriter writer = new FileWriter(new File(IN_FILE_PATH));
        new Random().ints(20, 0, 20).forEach(n -> {
            try {
                writer.write(n + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.close();
    }

    private static ArrayList<Integer> readNumbersFromFile() throws FileNotFoundException {
        FileReader reader = new FileReader(IN_FILE_PATH);
        Scanner scanner = new Scanner(reader);
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        return list;
    }
}

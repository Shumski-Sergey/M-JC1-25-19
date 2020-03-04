package iyakushevich.SecondControl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 3. Создать и заполнить файл случайными целыми значениями. Удалить все нечетные.
 * Выполнить сортировку содержимого по возрастанию и вывести в другой файл(output).
 */

public class Task3 {
    private static final String SOURCE_FILE_PATH = "src/iyakushevich/SecondControl";
    private static final String SOURCE_FILE_NAME = "Task3_input.txt";
    private static final String OUT_FILE_NAME = "Task3_output.txt";

    public static void main(String[] args) throws IOException {
        File sourceFile = createFile(SOURCE_FILE_PATH, SOURCE_FILE_NAME);
        writeToFile(sourceFile);

        List<Integer> list = fromFileToList(sourceFile);

        writeToOutputFile(list.stream().filter(x -> x % 2 == 0).sorted().collect(Collectors.toList()));
        System.out.println("Чтение, сортировка и запись выполнена. Файл источник " + SOURCE_FILE_NAME + ", " +
                "файл назначения " + OUT_FILE_NAME);
    }

    private static void writeToOutputFile(List<Integer> list) throws IOException {
        File outputFile = new File(SOURCE_FILE_PATH, OUT_FILE_NAME);
        FileWriter fileWriter = new FileWriter(outputFile);
        for (Integer i:list
             ) {
            fileWriter.write(i + "");
            fileWriter.append('\n');
        }
        fileWriter.close();
    }

    private static List<Integer> fromFileToList(File sourceFile) throws IOException {
        List<Integer> list = new ArrayList<Integer>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(sourceFile));
            String text;

            while ((text = reader.readLine()) != null) {
                list.add(Integer.parseInt(text));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    private static void writeToFile(File sourceFile) throws IOException {
        FileWriter fileWriter = new FileWriter(sourceFile);
        for (int i = 0; i < 100; i++) {
            fileWriter.write((int) (Math.random() * 100) + "");
            fileWriter.append('\n');
        }
        fileWriter.close();
    }

    private static File createFile(String filePath, String fileName) {
        File targetFile = new File(filePath, fileName);
        try {
            targetFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return targetFile;
    }
}

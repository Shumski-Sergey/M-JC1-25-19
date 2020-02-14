package iyakushevich.lesson12_IOStream;

import java.io.*;

/**
 * 3.Организовать построчное считывание данных, введенных с консоли, и их запись в файл.
 * Признаком окончания записи (конец работы программы) является строка со словом «#ESC».
 */

public class Lesson12_A3 {

    private static final String FILE_PATH = "src/iyakushevich/lesson12_IOStream";
    private static final String FILE_NAME = "lesson12_A3_util.txt";

    public static void main(String[] args) throws IOException {
        System.out.println("Введите строки (для завершения набора введите #ESC): ");
        File targetFile = createFile(FILE_PATH, FILE_NAME);
        readAndSaveToFile(targetFile);
    }

    private static File createFile(String filePath, String fileName) throws IOException {
        File targetFile = new File(filePath, fileName);
        targetFile.createNewFile();
        return targetFile;
    }

    private static void readAndSaveToFile(File targetFile) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fileWriter = new FileWriter(targetFile);

        String line;
        while (true) {
            line = reader.readLine();
            if (line.equals("#ESC")) break;
            fileWriter.write(line + "\n");
        }

        fileWriter.close();
    }
}

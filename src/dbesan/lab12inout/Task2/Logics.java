package dbesan.lab12inout.Task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Logics {
    static void writeListFiles() throws IOException {
        File[] files = new File(getTargetPath()).listFiles();
        catalogLister(files);
    }

    private static void catalogLister(File[] files) {
        try {
            String targetfile = getTargetFile();
            boolean created = new File(targetfile).createNewFile();
            Writer writer = new FileWriter(targetfile);
            if (created) {
                for (File i : files) {
                    writer.write(("\n" + "Путь: " + i.getAbsolutePath()
                            + " Имя: " + i.getName()
                            + " Дата: " + new SimpleDateFormat("dd.MM.yyyy").format(new Date(i.lastModified()))));
                }
            } else if (new File(targetfile).exists()) {
                System.out.println("Файл уже существует.");
                catalogLister(files);
            } else {
                System.out.println("Не удалось.");
                catalogLister(files);
            }
            writer.close();
            System.out.println("Файл успешно записан.");
        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }

    private static String getTargetPath() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте каталог");
        return scanner.nextLine();
    }

    private static String getTargetFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте путь и имя файла. Например: C:/user/log.txt");
        return scanner.nextLine();
    }
}

package dbesan.lab12inout.Task3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*Организовать построчное считывание данных, введенных с консоли, и их запись в файл.
Признаком окончания записи (конец работы программы) является строка со словом «#ESC».*/
public class Logics {
    private static final String EXIT_PHRASE = "#ESC";
    private static final int BUFF_SIZE = 1024;

    static void writeFromCon() throws IOException {
        writerFromConToFile();
    }

    private static void writerFromConToFile() {
        try {
            File file = new File(getTargetFile());
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter, BUFF_SIZE);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст или #ESC для выхода.");
            while (!(scanner.nextLine()).equals(EXIT_PHRASE)) {
                bufferedWriter.write(scanner.nextLine());
            }
            scanner.close();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            writerFromConToFile();
        }
    }

    private static String getTargetFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте путь и имя файла. Например: C:/user/log.txt");
        return scanner.nextLine();
    }
}


package riliuchik.lab10_InputOutput.Lab10_taskA3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Организовать построчное считывание данных, введенных с консоли, и их запись в файл.
 * Признаком окончания записи (конец работы программы) является строка со словом «#ESC».
 */

public class Lab10_taskA3 {
    private static final String PATH = "src/riliuchik/lab10_InputOutput/Lab10_taskA3/";
    private static final String OUTPUTFILE = "strings.txt";

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter(new File(PATH, OUTPUTFILE));
        System.out.println("Введите строки для записи в файл. Для окончания записи введите #ESC:");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = in.readLine();
            if (line.equals("#ESC")) break;
            fileWriter.write(line + "\n");
        }
        fileWriter.close();
        System.out.print("Успешно записан файл " + PATH + OUTPUTFILE);
    }
}
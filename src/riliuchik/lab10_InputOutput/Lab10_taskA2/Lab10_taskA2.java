package riliuchik.lab10_InputOutput.Lab10_taskA2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * Написать программу, которая создаст текстовый файл и запишет в него
 * список файлов (путь, имя, дата создания) из заданного каталога.
 */

public class Lab10_taskA2 {
    private static final String PACKAGEFORSEARCH = "src/riliuchik/lab4_arrays/fileTasksArrays";
    private static final String OUTPUTFILE = "src/riliuchik/lab10_InputOutput/Lab10_taskA2/output.txt";

    public static void main(String[] args) throws Exception {
        getInformation(new File(PACKAGEFORSEARCH));
    }

    private static void getInformation(File files) throws FileNotFoundException {
        PrintStream print = new PrintStream(new FileOutputStream(OUTPUTFILE));
        for (File file : Objects.requireNonNull(files.listFiles())) {
            if (file.isFile()) {
                print.println("Путь: " + file.getPath());
                print.println("Имя: " + file.getName());
                print.println("Дата: " + new SimpleDateFormat("dd.MM.yyyy").format(new Date(file.lastModified())) + "\n");
            }
        }
        print.close();
        System.out.print("Успешно записан файл " + OUTPUTFILE);
    }
}
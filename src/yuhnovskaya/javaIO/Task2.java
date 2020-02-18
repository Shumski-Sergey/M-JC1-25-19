package src.yuhnovskaya.javaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;


// Написать программу, которая создаст текстовый файл и запишет в него список файлов (путь, имя,
// дата создания) из заданного каталога.
public class Task2 {
    public static void main(String[] avgs) throws FileNotFoundException {
        File source = new File("src/yuhnovskaya/javaIO");
        File[] files = source.listFiles();
        PrintWriter writer = new PrintWriter("src/yuhnovskaya//javaIO/catalog.txt");
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        for (File src : files) {
            writer.printf("\n" + src.getAbsolutePath()+" "+src.getName()+" "+ new Date(src.lastModified()));
        }
        writer.close();
    }
}

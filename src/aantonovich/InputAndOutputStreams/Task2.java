package aantonovich.InputAndOutputStreams;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

// Написать программу, которая создаст текстовый файл и запишет в него список файлов
// (путь, имя, дата создания) из заданного каталога
public class Task2 {
    public static void main (String [] args) throws Exception {
        creatFile("src\\aantonovich\\InputAndOutputStreams\\task2.txt") ;
    }
    public static void creatFile(String nameFile) throws Exception {
        PrintWriter printWriter = new PrintWriter(nameFile);
        File file = new File(nameFile);
        File directory = file.getParentFile();
        File[] allFiles = directory.listFiles();
        StringBuilder stringBuilder = new StringBuilder();
        for(File varFile : Objects.requireNonNull(allFiles)){
            BasicFileAttributes fileAttributes = Files.readAttributes(file.toPath(),BasicFileAttributes.class);
            stringBuilder.append(varFile).append(" ")
                    .append(fileAttributes.creationTime()).append("\n");
        }
        printWriter.write(String.valueOf(stringBuilder));
        printWriter.close();
    }
}

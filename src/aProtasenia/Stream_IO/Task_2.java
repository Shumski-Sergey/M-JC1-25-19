package src.aProtasenia.Stream_IO;
//Написать программу, которая создаст текстовый файл и запишет в него
// список файлов (путь, имя, дата создания) из заданного каталога.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.*;

public class Task_2 {
    public static void main(String[] args) throws IOException {
        File myFolder = new File("src/aProtasenia/Stream_IO");
        FileWriter writer = new FileWriter("src/aProtasenia/Stream_IO/task_2.txt");
        for (File file : myFolder.listFiles()) {
            try {
                BasicFileAttributes serve = Files.getFileAttributeView(Paths.get(file.getAbsolutePath()), BasicFileAttributeView.class).readAttributes();
                FileTime fileTime = serve.creationTime();
                writer.write(file.getAbsolutePath() + " " + file.getName() + " " + fileTime + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        writer.close();
    }
}
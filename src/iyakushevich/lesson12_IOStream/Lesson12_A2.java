package iyakushevich.lesson12_IOStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * 2.  Написать программу, которая создаст текстовый файл и запишет
 * в него список файлов (путь, имя, дата создания) из заданного каталога.
 */

public class Lesson12_A2 {

    private static final String FILE_NAME = "lesson12_A2_util.txt";
    private static final String FILE_PATH = "src/iyakushevich/lesson12_IOStream";
    private static final String FOLDER_TO_SCAN = "src/iyakushevich/lesson12_IOStream";
//    private static final String FOLDER_TO_SCAN = "src/iyakushevich/lesson10StreamAPI";

    public static void main(String[] args) throws IOException {
        File lesson12A2util = createFile();
        getFileList(FOLDER_TO_SCAN, lesson12A2util);

    }


    private static File createFile() throws IOException {
        File targetFile = new File(FILE_PATH, FILE_NAME);
        targetFile.createNewFile();
        return targetFile;
    }

    private static void getFileList(String folderToScan, File outputFile) throws IOException {
        File directory = new File(folderToScan);
        FileWriter fileWriter = new FileWriter(outputFile);

        int fileCounter = 0;
        for (File file : directory.listFiles()
        ) {
            if (file.isFile()) {
                fileWriter.write("PATH: " + file.getAbsolutePath() + "\n");
                fileWriter.write("NAME: " + file.getName() + "\n");
                fileWriter.write("MODIFIED: " + new Date(file.lastModified()) + "\n\n");
                System.out.println("Найден " + ++fileCounter + " файл...");
            }
        }

        fileWriter.close();
    }
}

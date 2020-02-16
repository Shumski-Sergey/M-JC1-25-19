package iromankova.lab12InOutStream;
/*2.  Написать программу, которая создаст текстовый файл и запишет в него список
файлов (путь, имя, дата создания) из заданного каталога. */

import iromankova.packageOfUsedClasses.InputOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;

public class Task_2 {
    public static void main(String[] args) throws IOException {
        File file = InputOutput.createNewFile("text3.txt");
        String pathDirectory = InputOutput.readFromTheConsole("Укажите путь к каталогу (например: " +
                "src\\iromankova\\lab10LambdaStream ):  ");
        getFilesDescription(pathDirectory, file);
        System.out.println("Список файлов (путь, имя, дата создания) из заданного каталога" +
                " находится в файле: " + file.getPath());
    }

    private static void getFilesDescription(String pathDirectory, File file) {
        File directory = new File(pathDirectory);

        try (FileWriter fileWriter = new FileWriter(file)) {
            for (File fileOfDirectory : Objects.requireNonNull(directory.listFiles())) {
                if (fileOfDirectory.isFile()) {
                    fileWriter.write(fileOfDirectory.getAbsolutePath() + "; " + fileOfDirectory.getName() + "; " +
                            new Date(fileOfDirectory.lastModified()) + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

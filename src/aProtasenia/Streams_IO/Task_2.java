package aProtasenia.Streams_IO;

//Написать программу, которая создаст текстовый файл и запишет в него
// список файлов (путь, имя, дата создания) из заданного каталога.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;

public class Task_2 {
    public static void main(String[] args) throws IOException {
        //Создание файла txt2.txt
        FileWriter fileWriter = new FileWriter("src\\aProtasenia\\Streams_IO\\text2.txt");
        //Объект-каталог c файлами
        File objectFolder = new File("src\\aProtasenia\\Stream_API");
        //Создание списка файлов объекта-каталога и forEach на его основе
        for (File txtFile : Objects.requireNonNull(objectFolder.listFiles())) {
                //Запись пути файла в text2.txt
                fileWriter.write("PATH: " + txtFile.getAbsolutePath() + "\n");
                //Запись имени файла в text2.txt
                fileWriter.write("NAME: " + txtFile.getName() + "\n");
                //Запись даты создания файла в text2.txt
                fileWriter.write("DATE: " + new Date(txtFile.lastModified()) + "\n\n");
        }
        fileWriter.close();
    }
}

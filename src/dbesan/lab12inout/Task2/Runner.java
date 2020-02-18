package dbesan.lab12inout.Task2;

import java.io.IOException;

import static dbesan.lab12inout.Task2.Logics.writeListFiles;

/*Написать программу, которая создаст текстовый файл и запишет в него список файлов (путь, имя, дата создания) из заданного каталога.*/
public class Runner {
    public static void main(String[] args) throws IOException {
        writeListFiles();
    }
}

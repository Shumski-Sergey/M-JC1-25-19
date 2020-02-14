package dbesan.lab12inout.Task1;


/*Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел. Закрыть поток ввода-вывода./*
 */

import java.io.IOException;

import static dbesan.lab12inout.Task1.Logics.fileread;

public class Runner {
    public static void main(String[] args) throws IOException {
        fileread();
    }
}

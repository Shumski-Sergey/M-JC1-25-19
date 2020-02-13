package iyakushevich.lesson12_IOStream;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1. Ввести с консоли имя файла. Найти байт или байты с максимальным количеством повторов.
 * Вывести их на экран через пробел. Закрыть поток ввода-вывода.
 */

public class Lesson12_A1 {

    public static final String CHAR_ENCODING = "UTF-8";
    public static final String FILE_PATH = "src/iyakushevich/lesson12_IOStream/lesson12_A1_util.txt";
    public static final int BYTE_LENGTH = 256;

    public static void main(String[] args) throws IOException {
        FileInputStream fileReader = getBufferedReader();
        int[] byteArray = countBytes(fileReader);
        getMostFrequentByte(byteArray);
        fileReader.close();
    }

    private static FileInputStream getBufferedReader() {
        FileInputStream fileReader = null;
        try {
            fileReader = new FileInputStream(FILE_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return fileReader;
    }

    private static int[] countBytes(FileInputStream bufferedReader) throws IOException {
        int i;

        int[] byteArray = new int[BYTE_LENGTH];
        while ((i = bufferedReader.read()) != -1) {
            //System.out.print((byte) i + " ");
            byteArray[i] = byteArray[i] + 1;
        }
        return byteArray;
    }

    private static void getMostFrequentByte(int[] byteArray) {
        int max = Arrays.stream(byteArray).max().getAsInt();

        for (int j = 0; j < byteArray.length; j++) {
            if (byteArray[j] == max) System.out.print(j + " ");
        }
    }
}

package aantonovich.InputAndOutputStreams;

import org.jetbrains.annotations.NotNull;
import java.io.*;
import java.util.Arrays;

// Ввести с консоли имя файла. Найти байт или байты с максимальным количеством повторов.
// Вывести их на экран через пробел. Закрыть поток ввода-вывода

public class Task1 {
    public final static int BYTE = 256;

    public static void main(String[] args) {
        System.out.println("Enter the full path to the file: ");
        try {
            String nameFile = new BufferedReader(new InputStreamReader(System.in)).readLine();
            FileInputStream file = new FileInputStream(nameFile);
            int[] bytes = countByte(file);
            file.close();
            byteWithMaxNumberOfRepetitions(bytes);
        }  catch (IOException e) {
            e.printStackTrace();

            // D:\JAVA Projects\M-JC1-25-19\src\aantonovich\InputAndOutputStreams\task1.txt

        }
    }

    @NotNull
    private static int[] countByte(@NotNull FileInputStream file) throws IOException {
        int[] bytes = new int[BYTE];
        int byteHigh;
        while ((byteHigh = file.read()) != -1) {
            bytes[byteHigh] += 1;
        }
        return bytes;
    }

        private static void byteWithMaxNumberOfRepetitions (@NotNull int[] bytes){
        int max = Arrays.stream(bytes).max().getAsInt();
            for (int aByte : bytes) {
                if (aByte == max) System.out.print(aByte + " ");
            }
        }
    }

package aProtasenia.Streams_IO;

// Организовать построчное считывание данных, введенных с консоли, и их запись в файл.
// Признаком окончания записи (конец работы программы) является строка со словом «#ESC».

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fileWriter = new FileWriter("src\\aProtasenia\\Streams_IO\\text3.txt");
        while (true) {
            String text3 = console.readLine();
            if (text3.equals("#ESC")) break;
            fileWriter.write(text3 + "\n");
        }
        fileWriter.close();
    }
}

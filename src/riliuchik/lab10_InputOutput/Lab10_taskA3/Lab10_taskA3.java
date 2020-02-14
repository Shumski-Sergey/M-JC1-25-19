package riliuchik.lab10_InputOutput.Lab10_taskA3;

import java.io.*;
import java.util.ArrayList;

/**
 * Организовать построчное считывание данных, введенных с консоли, и их запись в файл.
 * Признаком окончания записи (конец работы программы) является строка со словом «#ESC».
 */

public class Lab10_taskA3 {
    private static final String OUTPUTFILE = "src/riliuchik/lab10_InputOutput/Lab10_taskA3/strings.txt";

    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        System.out.println("Введите строки для записи в файл. Для окончания записи введите '#ESC':");
        String str = null;
        while (true) {
            try {
                str = in.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            assert str != null;
            if (str.equals("#ESC")) break;
            strings.add(str);
        }
        PrintStream print = new PrintStream(new FileOutputStream(OUTPUTFILE));
        for (String string : strings) {
            print.println(string);
        }
        print.close();
        System.out.print("Успешно записан файл " + OUTPUTFILE);
    }
}
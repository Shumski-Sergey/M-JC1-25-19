package src.aProtasenia.Stream_IO;
//3.Организовать построчное считывание данных, введенных с консоли, и их запись в файл.
// Признаком окончания записи (конец работы программы) является строка со словом «#ESC».

import java.io.*;

public class Task_3 {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter
                ("src/aProtasenia/Stream_IO/task_3"))) {
            System.out.println("Enter strings or enter #ESC to exit");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String consoleLine;
            while (true){
                consoleLine = reader.readLine();
                if (consoleLine.equals("#ESC")) break;
                bufferedWriter.write(consoleLine+"\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

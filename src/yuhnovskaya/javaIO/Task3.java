package src.yuhnovskaya.javaIO;

import java.io.*;

//Организовать построчное считывание данных, введенных с консоли, и их запись в файл. Признаком окончания записи
// (конец работы программы) является строка со словом «#ESC».
public class Task3 {
    public static void main(String[] avgs) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter strings and '#esc' to complite:");
        try { BufferedWriter writer = new BufferedWriter((new OutputStreamWriter(new FileOutputStream("src/yuhnovskaya/javaIO/result.txt"))));
            while (true) {
            String string = reader.readLine();
            if (string.equals("#esc")) {
                writer.flush();
                break;
            }
            writer.write(string+"\n");
        }
            reader.close();
            writer.close();
        } catch (FileNotFoundException ex) {
            System.out.print(ex.getMessage());
        } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }
    }
}

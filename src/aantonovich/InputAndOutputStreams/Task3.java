package aantonovich.InputAndOutputStreams;

//Организовать построчное считывание данных, введенных с консоли, и их запись в файл.
// Признаком окончания записи (конец работы программы) является строка со словом «#ESC»

import java.io.*;
import java.util.Objects;

public class Task3 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строки текста. Для завершения введите ESC");
        File file = new File("src"+File.separator+"aantonovich"+File.separator+"InputAndOutputStreams"+File.separator+"task3.txt");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        String string = null;
        while (true) {
            try {
                string = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (Objects.equals(string, "ESC")) break;
            writer.write(Objects.requireNonNull(string) + "\n");
        }
              writer.close();
              bufferedReader.close();
        }

    }

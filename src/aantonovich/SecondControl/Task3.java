package aantonovich.SecondControl;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите числа через пробел: ");
        File file = new File("src"+File.separator+"aantonovich"+File.separator+"SecondControl"+File.separator+"task3.txt");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        int integer = 0;
        while (true) {
            try {
                integer = bufferedReader.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            writer.write(integer + " ");
            try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
  //              = scanner.toString().

            }

        }
    }
}

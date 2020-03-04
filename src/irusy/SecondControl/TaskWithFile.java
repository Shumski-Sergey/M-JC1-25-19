package src.irusy.SecondControl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Random;
public class TaskWithFile {
    public static void main(String args[]) throws IOException {
        //создаем случайные числа и заполняем ими создаваемый файл
        Random rand = new Random();
        try (PrintStream out = new PrintStream(new FileOutputStream("task03_output.txt"))) {
            for(int i = 0; i < rand.nextInt(100); i++) {
                out.print("" + rand.nextInt() + " ");
            }
            out.close();
        }

        //считываем из файла данные
        String text = new String(Files.readAllBytes(Paths.get("task03_output.txt")), StandardCharsets.UTF_8);
        String[] strings = text.split(" ");

        //преобразуем их в числа
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String i : strings) {
            try {
                numbers.add(Integer.parseInt(i));
            } catch (NumberFormatException e) {
            }
        }

        //убираем нечетные и сортируем по возрастанию
        numbers.removeIf(i -> i % 2 != 0);
        numbers.sort((num1, num2) -> num1.compareTo(num2));

        //записываем в другой файл результат
        try (PrintStream out = new PrintStream(new FileOutputStream("task03_result.txt"))) {
            numbers.forEach(i -> out.print("" + i + " "));
            out.close();
        }
    }
}

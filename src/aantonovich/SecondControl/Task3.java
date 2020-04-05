package aantonovich.SecondControl;

//Создать и заполнить файл случайными целыми значениями. Удалить все нечетные.
// Выполнить сортировку содержимого по возрастанию и вывести в другой файл(output).

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task3 {
    static final File input = new File("src" + File.separator + "aantonovich" + File.separator + "SecondControl" + File.separator + "input.txt");
    static final File output = new File("src" + File.separator + "aantonovich" + File.separator + "SecondControl" + File.separator + "output.txt");

    public static void main(String[] args) throws IOException {
        writeFile();
        readAndWriteFile();
    }
    //        45 5 4 5 67 77 88 44
    private static void writeFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите числа через пробел: ");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(input)));
        String string = null;
        while (true) {
            try {
                string = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            writer.write(Objects.requireNonNull(string));
            break;
        }
        writer.close();
    }

    private static void readAndWriteFile() throws IOException{
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(input)))) {
            List<Integer> list = new ArrayList<>();
            while (scanner.hasNextInt()){
                list.add(scanner.nextInt());
            }
            List<Integer> s2 =   list.stream()
                    .filter(x -> x%2 == 0)
                    .sorted().collect(Collectors.toList());

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output)));
            writer.write(s2.toString());
            writer.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
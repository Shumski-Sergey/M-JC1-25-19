package aantonovich.Training;

//Создать и заполнить файл случайными целыми значениями. Удалить все нечетные.
// Выполнить сортировку содержимого по возрастанию и вывести в другой файл(output).

import java.io.*;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WorkWithFiles {
    static final File input = new File("src" + File.separator + "aantonovich" + File.separator + "Training" + File.separator + "input.txt");
    static final File output = new File("src" + File.separator + "aantonovich" + File.separator + "Training" + File.separator + "output.txt");

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
        Integer s = scanner.nextInt();
        List<Integer> s1 = List.of(Integer.parseInt(String.valueOf(s), 10));
             List<Integer> s2 =   s1.stream()
                     .filter(x -> x%2 == 0)
                     .sorted().collect(Collectors.toList());

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output)));
        writer.write(String.valueOf(s2));
        writer.close();
    }
    catch (FileNotFoundException e){
        e.printStackTrace();
    }
}
}
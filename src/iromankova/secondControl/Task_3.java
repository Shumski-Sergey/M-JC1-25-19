package iromankova.secondControl;
//3. Создать и заполнить файл случайными целыми значениями. Удалить все нечетные.
// Выполнить сортировку содержимого по возрастанию и вывести в другой файл(output).

import iromankova.packageOfUsedClasses.InputOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_3 {
    static final int RANGE_OF_NUMBERS = 100;
    static final int ARRAY_LENGTH = 11;
    static final int FOR_COUNT_ODD_NUMBER = 2;
    public static void main(String[] args) throws IOException {
        File file = InputOutput.createNewFile("text5.txt");
        File file1 = InputOutput.createNewFile("text6.txt");
        fillWithNumbers (file);
        List<Integer> list = readFromFile (file);
        System.out.println(list);
        List<Integer> list1 = choiceAndSort (list);
        writeToFile (file1, list1);
    }

    private static void writeToFile(File file1, List<Integer> list1) {
        try (FileWriter fileWriter = new FileWriter(file1)) {
            for (int el : list1) {
                fileWriter.write(el + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private static List<Integer> choiceAndSort(List<Integer> list) {
        List<Integer> list1 = list
                .stream()
                .filter(num -> {

                    return num % FOR_COUNT_ODD_NUMBER == 0;
                })
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list1);
        return list1;
    }

    private static List<Integer> readFromFile(File file) {
        List<Integer> list = new ArrayList<> ();
        try (Scanner scanner = new Scanner(new BufferedReader ((new FileReader (file))))) {
            scanner.useDelimiter(" ");
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    private static void fillWithNumbers(File file) {
        Random random = new Random();
        try (FileWriter fileWriter = new FileWriter(file)) {
            for (int i = 0; i < ARRAY_LENGTH; i++) {
                fileWriter.write(random.nextInt(RANGE_OF_NUMBERS) + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

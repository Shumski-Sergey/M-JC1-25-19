package KKropa.Second_control;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


//3. Создать и заполнить файл случайными целыми значениями. Удалить все нечетные.
// Выполнить сортировку содержимого по возрастанию и вывести в другой файл(output).
public class Task_3 {
    static final int QUANTITY_ELEMENTS = 10;
    static final int RANGE = 20;
    static final int FOR_DIVISION = 2;

    public static List<Integer> main(String[] args) throws IOException {

        ArrayList<Integer> list = new ArrayList<>();
        WriteToFile(list);
        ArrayList<Integer> listFromFile = new ArrayList<>();
        getElementsFromFile(listFromFile);




        List<Integer> outputListFromFile = listFromFile
                .stream()
                .filter(number-> {
                    return number % FOR_DIVISION == 0;})
                .sorted()
                .collect(Collectors.toList());
        System.out.println(outputListFromFile);
        return outputListFromFile;

//        File sortedOutputFile = new File("./src/KKropa/Second_control/Return_Text_task_3.txt");
//        PrintWriter pw2 = new PrintWriter(sortedOutputFile);
//        for (int i = 0; i<outputListFromFile.size(); i++){
//            pw2.println(outputListFromFile.get(i));
//        }
//        pw2.close();

    }



    private static void getElementsFromFile(ArrayList<Integer> listFromFile) throws FileNotFoundException {
        File inputFile = new File("./src/KKropa/Second_control/Text_task_3.txt");
        Scanner scanner = new Scanner(inputFile);
        while (scanner.hasNextInt()) {
            listFromFile.add(scanner.nextInt());
        }
        System.out.println(listFromFile);
    }

    private static void WriteToFile(ArrayList<Integer> list) throws FileNotFoundException {
        for (int i = 0; i < QUANTITY_ELEMENTS; i++) {
            int elements = (int) (Math.random() * RANGE+ 1);
            list.add(i, elements);
        }
        File outputFile = new File("./src/KKropa/Second_control/Text_task_3.txt");
        PrintWriter pw = new PrintWriter(outputFile);

        for (int i = 0; i < list.size(); i++) {
            pw.println(list.get(i));
        }
        pw.close();
    }
}

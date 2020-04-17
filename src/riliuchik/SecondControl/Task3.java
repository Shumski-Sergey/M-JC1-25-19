//package riliuchik.SecondControl;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.nio.charset.StandardCharsets;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Random;
//
///**
// * Создать и заполнить файл случайными целыми значениями. Удалить все нечетные.
// * Выполнить сортировку содержимого по возрастанию и вывести в другой файл(output).
// */
//
//public class Task3 {
//    private static final String PATH1 = "src/riliuchik/SecondControl/first.txt";
//    private static final String PATH2 = "src/riliuchik/SecondControl/second.txt";
//    private static final int QUANTITYOFNUMBERS = 20; //количество случайных значений
//    private static final int RANGE = 100;
//
//    public static void main(String[] args) throws IOException {
//        PrintWriter writer1 = new PrintWriter(PATH1, StandardCharsets.UTF_8);
////        PrintWriter writer2 = new PrintWriter(PATH2, StandardCharsets.UTF_8);
//        int[] array = new int[QUANTITYOFNUMBERS];
//        Random random = new Random();
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(RANGE) + 1; //заполняю значениями от 1 до RANGE включительно
//        }
//        for (int value : array) {
//            writer1.write(value + " ");
//        }
//        writer1.close();
//        ArrayList<Integer> numbers = new ArrayList<>();
//        for (int value : array) {
//            if (value % 2 == 0) {
//                numbers.add(value);
//            }
//        }
//        Collections.sort(numbers);
//        for (int number : numbers) {
//            writer2.write(number + " ");
//        }
//        writer2.close();
//        System.out.print("Файлы успешно записаны");
//    }
//}
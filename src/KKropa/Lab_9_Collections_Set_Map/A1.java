package KKropa.Lab_9_Collections_Set_Map;

import java.util.*;

//1.Пользователь вводит набор чисел в виде одной строки (“1, 2, 3, 4, 4, 5”).
// Избавиться от повторяющихся элементов в строке и вывести результат на экран.
public class A1 {
    public static void main(String[] args) {

        System.out.println("Enter the string of numbers: ");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] array = (s.split(" "));

        Set<String> newArray = new HashSet<>(Arrays.asList(array));

        System.out.println("String of numbers without repetition: " + newArray);

    }
}

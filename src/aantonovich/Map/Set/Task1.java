package aantonovich.Map.Set;

import java.util.*;

// Пользователь вводит набор чисел в виде одной строки (“1, 2, 3, 4, 4, 5”).
// Избавиться от повторяющихся элементов в строке и вывести результат на экран
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(", ");
        Set <String> set = new HashSet<>(Arrays.asList(s1));
        System.out.println(set);
    }
}
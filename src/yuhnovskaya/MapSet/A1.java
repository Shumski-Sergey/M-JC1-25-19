package src.yuhnovskaya.MapSet;
//Пользователь вводит набор чисел в виде одной строки (“1, 2, 3, 4, 4, 5”).
// Избавиться от повторяющихся элементов в строке и вывести результат на экран.
import java.util.*;

public class A1 {
    public static void main(String[]avgs) {
      Scanner scanner=new Scanner(System.in);
      String str=scanner.nextLine();

        Set<String> newstring = new HashSet<>();
        newstring.addAll(Arrays.asList(str.split(", ")));
        System.out.println(newstring);
    }
}

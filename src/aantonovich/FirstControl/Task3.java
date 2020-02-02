package aantonovich.FirstControl;

import java.util.ArrayList;
import java.util.Scanner;
// Создаем список строк, считываем с клавиатуры 5 штук и добавляем их в список.
// Затем с помощью цикла найдем из списка самую длинную строку (или несколько, если она такая не одна).
// Самые длинные строки будут выведены на экран
public class Task3 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter number of the string:");
        Scanner scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the strings:");
        ArrayList<String> text = new ArrayList<>();
        for (int i = 0; i < n; i++){
            text.add(i,scanner.nextLine());}
        System.out.println("The longest string: ");
        int longestString = text.get(0).length();
        for (String value : text) {
            if (value.length() > longestString) {
                longestString = value.length();
            }
        }
        for (String s : text) {
            if (s.length() == longestString) {
                System.out.println(s);
            }
        }
    }
}


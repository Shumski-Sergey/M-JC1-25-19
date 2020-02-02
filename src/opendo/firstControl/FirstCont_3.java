import java.util.ArrayList;
import java.util.Scanner;

public class FirstCont_3 {
    private static final int NUMB_OF_LINES = 5;

    public static void main(String[] args) {
        // Cоздадим список строк, считаем с клавиатуры 5 штук и добавим их в список.
        // Затем с помощью цикла найдем из списка самую длинную строку (или несколько, если она такая не одна).
        // Cамые длинные строки будут выведены на экран.

        ArrayList<String> sourceStr = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите 5 строк: ");
        for (int i = 1; i <= NUMB_OF_LINES; i++) { // заполнение списка строками
            sourceStr.add(input.nextLine());
        }

        output(sourceStr,largestStr(sourceStr));
    }

    public static int largestStr (ArrayList<String> sourceStr){  //поиск самых длинных строк в списке
        int largestStr = sourceStr.get(0).length();
        for (int i = 0; i < NUMB_OF_LINES; i++) {
            if (sourceStr.get(i).length() >= largestStr) {
                largestStr = sourceStr.get(i).length();
            }
        }
   return largestStr;
    }

    public static void output (ArrayList<String> sourceStr, int largestStr){ //вывод самых длинных строк списка на экран
        for (int i = 0; i < NUMB_OF_LINES; i++) {
            if (sourceStr.get(i).length() == largestStr)
                System.out.println("Самая длинная строка: " + sourceStr.get(i));
        }
    }
}


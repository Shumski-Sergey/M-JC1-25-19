package aantonovich.Lesson5;// Ввести n строк с консоли.
// Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String[] text;
        int n; // кол-во строк
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк:");
        n = Integer.parseInt(scanner.nextLine());
        text = new String[n]; // массив строк
        System.out.println("Введите строки :");
        for (int i = 0; i < n; i++) { // перебор массива и нахождение суммы всех символов
            text[i] = scanner.nextLine();
            sum += text[i].length();
        }
        for (int j=0; j< n; j++){
            if (text[j].length() < sum/n ) { // если длина строки меньше среднеарифметической длины, то выводим на экран
                System.out.println("Длина строки " +text[j] + " меньше средней и равна " + text[j].length() + " символов");
            }
        }
    }
}

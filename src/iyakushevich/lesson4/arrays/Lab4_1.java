package iyakushevich.lesson4.arrays;

/*
4.Создать двухмерный квадратный массив, и заполнить его «бабочкой»,
т.е таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1
*/

import java.util.Scanner;

public class Lab4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { //формируем двухмерный массив, все значения которого - нули
                for (int k = i; (k < n - i); k++) { //перезаписываем единицами строки (доходим от 0 до средней строки)
                    array[i][k] = 1;
                }
                for (int k = n - i - 1; k < i + 1; k++) { //перезаписываем единицами строки
                    array[i][k] = 1;
                }
                System.out.print(array[i][j]); //вывод всех строк массива
            }
            System.out.println(); //переход на новую строку после вывода каждой строки
        }
    }
}

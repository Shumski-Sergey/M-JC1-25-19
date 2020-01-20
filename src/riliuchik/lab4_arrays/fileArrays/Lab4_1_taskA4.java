package src.riliuchik.lab4_arrays.fileArrays;

import java.util.Scanner;

//Создать двухмерный квадратный массив, и заполнить его «бабочкой»,
//т.е таким образом:
//1 1 1 1 1
//0 1 1 1 0
//0 0 1 0 0
//0 1 1 1 0
//1 1 1 1 1

public class Lab4_1_taskA4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк/столбцов для двухмерного квадратного массива (например, 5): ");
        int num;
        do {
            while (!in.hasNextInt()) {
                System.out.print("Вы ввели не число, попробуйте ещё раз: ");
                in.next();
            }
            num = in.nextInt();
            if (num < 3) {
                System.out.print("Задача не имеет смысла при количестве элементов меньше 3, попробуйте ещё раз: ");
            }
        }
        while (num < 3);
        int array[][] = new int[num][num];
        int i, j;
        for (i = 0; i < num / 2; i++) {
            for (j = 0; j < num; j++) {
                if ((i > j) || (j > num - i - 1)) array[i][j] = 0;
                else array[i][j] = 1;
            }
        }
        for (i = num / 2; i < num; i++) {
            for (j = 0; j < num; j++) {
                if ((i < j) || (j < num - i - 1)) array[i][j] = 0;
                else array[i][j] = 1;
            }
        }
        System.out.println("Тогда массив, заполненный \"бабочкой\", будет иметь следующий вид:");
        for (i = 0; i < num; i++) {
            for (j = 0; j < num; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
package d.grigirchik.lab4.arrays;

import java.util.Scanner;

//Создать двухмерный квадратный массив, и заполнить его «бабочкой»,
//т.е таким образом:
//1 1 1 1 1
//0 1 1 1 0
//0 0 1 0 0
//0 1 1 1 0
//1 1 1 1 1
public class Task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arraySize;

		System.out.println("Введите размерность квадратного массива");
		System.out.print("Cтроки/столбцы: ");

		do {
			while (!scanner.hasNextInt()) {
				System.out.println("Вы ввели не число, попробуйте еще раз");
				scanner.next();
			}
			arraySize = scanner.nextInt();
			if (arraySize <= 0) {
				System.out.println(" Введите целое положительное число кроме 0");
			}
		}
		while (arraySize <= 0);

		int array[][]= new int[arraySize][arraySize];
//		 заполнение массива;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array[i].length-i; j++) {
				array[i][j] = 1;
				array[array.length-i-1][array.length-j-1] = 1;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
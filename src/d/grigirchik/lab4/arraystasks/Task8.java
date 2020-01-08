package d.grigirchik.lab4.arraystasks;
//Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.println("Enter please natural number");
		do {
			while (!scanner.hasNextInt()) {
				System.out.println("It is not a namber, please enter natural number");
				scanner.next();
			}
			number = scanner.nextInt();
			if (number < 0) {
				System.out.println("your number must be positive");
			}
		} while (number < 0);
		for (int i = 1; i <= number; i++) {
		if (number%i==0){
			System.out.print(i + " ");
		}
		}
	}
}
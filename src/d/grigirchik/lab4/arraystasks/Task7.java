package d.grigirchik.lab4.arraystasks;

import java.util.Scanner;
//Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
public class Task7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		int fact = 1;
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
		System.out.println("Your number is: " + number);
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("It is your factorial: "+ fact);
	}
}

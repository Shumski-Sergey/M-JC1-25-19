package d.grigirchik.lab4.arraystasks;

import java.util.Scanner;
//Напишите программу Deal.java, которая должна имитировать раздачу карт для игры в покер.
// Программа получает число n, задаваемое с консоли пользователем, и раздает карты на n  игроков (по 5 карт каждому) из рассортированной колоды.
// Разделяйте пять карт, выданных каждому игроку, пустой строкой.
public class Deal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		int  suitСounter=0;
		System.out.println("Enter please natural number of players");
		do {
			while (!scanner.hasNextInt()) {
				System.out.println("It is not a namber, please enter number of players");
				scanner.next();
			}
			number = scanner.nextInt();
			if (number <= 1 || number > 10) {
				System.out.println("your number of players must be 2 and not more than 10");
			}
		} while (number <= 1 || number > 10);
		for (int i = 1; i <= number; i++) {

			System.out.println("This is cards for player number " + i);

			for (int j = 1; j <= 5; j++) {
				System.out.print((int) (2 + Math.random() * 13) + " ");
				switch ((int) (1 + Math.random() * 4)) {
					case (1):
						System.out.println("Diamonds");
						break;
					case (2):
						System.out.println("Hearts");
						break;
					case (3):
						System.out.println("Spades");
						break;
					case (4):
						System.out.println("Clubs");
						break;
				}
			}
			System.out.println();
		}
	}
}

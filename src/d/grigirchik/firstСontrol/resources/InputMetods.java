package d.grigirchik.firstСontrol.resources;

import java.util.Scanner;

public class InputMetods {
	static final int RANDOM_BOUNDAIES=100; //границы чисел рандома

	// метод запрашивает ввод числа, проверяет чтобы пользователь ввел именно число большее 0

	protected static int enterNumber() {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		do {
			while (!scanner.hasNextInt()) {
				System.out.println("Вы ввели не число, введите число большее 0");
				scanner.nextLine();
			}
			number = scanner.nextInt();
			if (number <= 0) {
				System.out.println("Вы ввели число меньшее 0, введите число большее 0");
			}

		} while (number <= 0);
		System.out.println("Спасибо, вы ввели число:" + number);
		return number;
	}

	// метод запрашивает ввод строк
	protected static StringBuilder stringInput(int stringNumber) {
		Scanner scanner = new Scanner(System.in);
		if (stringNumber != 0) {
			System.out.print(" Введите строку " + stringNumber + ": ");
		} else {
			System.out.print(" Введите строку:");
		}
		StringBuilder str = new StringBuilder();
		str.append(scanner.nextLine());
		return str;

	}

	// метод генерирует рандомное число int  в пределах [0;100]
	public static int randomNumbers() {
		return (int) (Math.random() * RANDOM_BOUNDAIES);
	}
}

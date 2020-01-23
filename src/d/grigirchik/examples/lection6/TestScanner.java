package d.grigirchik.examples.lection6;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		String str="1 Java 2 Java 3 Java";
		Scanner scanner = new Scanner(str);

		scanner.useDelimiter("\\s*Java\\s*");
		while (scanner.hasNextInt()) {
			System.out.println(scanner.nextInt());

			//регулярные выражения
		}
	}
}

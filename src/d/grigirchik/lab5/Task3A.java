package d.grigirchik.lab5;

import java.util.Scanner;

public class Task3A {
	public static void main(String[] args) {
		int sum = 0;
		float average;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the dimension of the string array: ");
		String[] strings = new String[scanner.nextInt()];
		scanner.nextLine();
		for (int i = 0; i < strings.length; i++) {
			System.out.print("Enter string " + (i + 1) + ": ");
			strings[i] = scanner.nextLine();
			sum = sum + strings[i].length();
		}
		average = (float)sum / strings.length;
		System.out.println("sum:"+sum);
		System.out.println("mean:" + average);
		System.out.println("--------------------------------------------");
		System.out.println("Strings whose length is less than average");
		for (int i = 0; i < strings.length; i++) {
			if (average > strings[i].length()) {
				System.out.println("String number "+ (i+1) + ": " + strings[i] + " line length: " + strings[i].length());
			}
		}
		System.out.println("--------------------------------------------");
		System.out.println("Lines longer than average");
		for (int i = 0; i < strings.length; i++) {
			if (average < strings[i].length()) {
				System.out.println("String number "+ (i+1) + ": " + strings[i] + " line length: " + strings[i].length());
			}
		}
	}
}

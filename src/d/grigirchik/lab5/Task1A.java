package d.grigirchik.lab5;

//Ввести n строк с консоли, найти самую короткую и самую длинную строки.
//				Вывести найденные строки и их длину.

import java.util.Scanner;

public class Task1A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the dimension of the string array");
		int numberOfStrings;
		int longLinePosition = 0;
		int shortLinePosition = 0;
		numberOfStrings = scanner.nextInt();
		String[] strings = new String[numberOfStrings];
		scanner.nextLine();
		for (int i = 0; i < strings.length; i++) {
			System.out.println("Enter string number " + (i + 1));
			strings[i] = scanner.nextLine();
		}
		int shortLine = strings[0].length();
		int longLine = strings[0].length();
		for (int i = 1; i < strings.length; i++) {
			if (shortLine > strings[i].length()) {
				shortLine = strings[i].length();
				shortLinePosition = i;
			}
			if (longLine < strings[i].length()) {
				longLine = strings[i].length();
				longLinePosition = i;
			}
		}
		System.out.println("Long string number " + (longLinePosition+1) +
						", this string includes text: " + '"'+strings[longLinePosition]+'"' +
						" number of chars: " + longLine);
		System.out.println("Short string number " + (shortLinePosition+1) +
						", this string includes text: " + '"'+ strings[shortLinePosition]+ '"' +
						" number of chars: " + shortLine);
	}
}

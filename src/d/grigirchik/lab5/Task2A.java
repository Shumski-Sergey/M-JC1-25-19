package d.grigirchik.lab5;
//Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Task2A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the dimension of the string array: ");
		String[] strings = new String[scanner.nextInt()];
		scanner.nextLine();
		for (int i = 0; i < strings.length; i++) {
			System.out.print("Enter string " + (i + 1) + ": ");
			strings[i] = scanner.nextLine();
		}
//сортировка рабочая
		for (int i = strings.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (strings[j].length() < strings[j + 1].length()) {
					String swap = strings[j];
					strings[j] = strings[j + 1];
					strings[j + 1] = swap;
				}
			}
		}
	//сортировка почемуто не рабочая
//		for (int i = 0; i < strings.length; i++) {
//			for (int j = 0; j < strings.length; i++) {
//				if (strings[j].length() < strings[j+1].length()) {
//				String	box = strings[j];
//					strings[j] = strings[j + 1];
//					strings[j + 1] = box;
//				}
//			}
//		}
		System.out.println("output lines in descending order");
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		System.out.println("output lines in ascending order");
		for (int i=strings.length-1; i>0; i--){
			System.out.println(strings[i]);
		}
	}
}


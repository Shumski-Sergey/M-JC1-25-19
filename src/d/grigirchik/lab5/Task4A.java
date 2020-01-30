package d.grigirchik.lab5;

import java.util.Scanner;

public class Task4A {
	public static void main(String[] args) {
		String str;
		int position=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type a few words separated by a space, when done press Enter:");
		System.out.println();
		str=scanner.nextLine();
		// разделение слов из введенной строки и заполнение ими массив words
		String[] words = str.split(" +");
		int min = words[0].length();
		for (int i=0; i<words.length; i++){
			if (min>words[i].length()){
				min = words[i].length();
				position=i;
			}
		}
		System.out.print("The shortest word:"+ words[position]);
	}
}
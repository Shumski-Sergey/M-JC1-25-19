package d.grigirchik.lab5;

//Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского алфавита,
// а среди них – количество слов с равным числом гласных и согласных букв.

import java.util.Scanner;
// НАВЕРНОЕ СТОИТ РЕШИТЬ ПРИМЕНЯЯ ПАТТЕРН И МАЧЕР
public class Task5A {
	public static void main(String[] args) {
		String str;
		String latWord = "";
		String latWordS = "";
		int counterVowel = 0;
		int counterСonsonants = 0;
		int equallyVowelConsonants = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type a few words separated by a space, when done press Enter:");
		System.out.println();
		str = scanner.nextLine();
		String[] words = str.split(" +"); //строка дробиться по пробелу и присвается массиву слов
		for (int i = 0; i < words.length; i++) {
			//прогоняя по данному циклу, проверяется каждое i слово, слово должно состоять только из латинских букв
			for (int j = 0; j < words[i].length(); j++) {
				//если окажеться что хоть один символ в слове не явл. латинским, то цикл прерывается и слово бракуется
				if ((words[i].charAt(j) >= '\u0041' && words[i].charAt(j) <= '\u005A') ||
								(words[i].charAt(j) >= '\u0061' && words[i].charAt(j) <= '\u007A')) {
					latWord = latWord + words[i].charAt(j);
				} else {
					latWord = "";
					break;
				}
			}
			latWordS = latWordS + " " + latWord;
			latWord = "";
		}
		String[] latwordsArrey = latWordS.split(" +");
		System.out.println("We have: " + (latwordsArrey.length - 1) + " which contain only latin letters");
		for (int i = 0; i < latwordsArrey.length; i++) {
			System.out.println(latwordsArrey[i]);
			for (int j = 0; j < latwordsArrey[i].length(); j++) {
				if (latwordsArrey[i].charAt(j) == 'A' || latwordsArrey[i].charAt(j) == 'a' ||
								latwordsArrey[i].charAt(j) == 'E' || latwordsArrey[i].charAt(j) == 'e' ||
								latwordsArrey[i].charAt(j) == 'I' || latwordsArrey[i].charAt(j) == 'i' ||
								latwordsArrey[i].charAt(j) == 'O' || latwordsArrey[i].charAt(j) == 'o' ||
								latwordsArrey[i].charAt(j) == 'U' || latwordsArrey[i].charAt(j) == 'u') {
					counterVowel++;
				} else {
					counterСonsonants++;
				}
			}
			if ((counterVowel == counterСonsonants) && (counterVowel != 0)) {
				equallyVowelConsonants++;
				counterVowel = 0;
				counterСonsonants = 0;
			}
		}
		System.out.println("We have: " + (equallyVowelConsonants) + " word(s), which contains an equal number of vowels and consonants");
	}
}






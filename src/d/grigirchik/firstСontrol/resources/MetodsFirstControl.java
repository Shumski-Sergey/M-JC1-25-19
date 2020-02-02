package d.grigirchik.firstСontrol.resources;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetodsFirstControl {

	//метод выводит только цифры из введенной строки, считает их количесвто и сумму
	public static void firstTask(StringBuilder string) {
		int counter = 0;
		int sum = 0;
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(string);

		System.out.print("Вывожу только цифры из введеной строки: ");
		while (m.find()) {
			System.out.print(m.group() + " ");
			counter++;
			sum = sum + Integer.parseInt(m.group());

		}
		System.out.println();
		System.out.println("Количество цифр в строке: " + counter);
		System.out.println("Вывод суммы цифр строки: " + sum);
	}

	//метод определяет самую большую строку
	public static int maxStringSizeDetector(ArrayList<StringBuilder> strings) {
		int maxStringSize = strings.get(0).length();
		for (int i = 1; i < strings.size(); i++) {
			if (strings.get(i).length() >= maxStringSize) {
				maxStringSize = strings.get(i).length();
			}
		}
		return maxStringSize;
	}

	//вывод самых длинных строк
	public static void maxStringSizeOutput(ArrayList<StringBuilder> strings, int maxStringSize) {
		for (int i = 0; i < strings.size(); i++) {
			if (strings.get(i).length() == maxStringSize) {
				System.out.println("Самая длинная строка " + i+ ": " +strings.get(i));
			}
		}
	}
}


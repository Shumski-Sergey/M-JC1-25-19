package d.grigirchik.examples.lection6;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class pattern {
	public static void main(String[] args) {
		String str1 = "Hello. My name is Dzmitry, I am 29 yers old. I like this course very mach. This " +
						"cat has name Moon, he lake a milk";
		String str2 = "Hello. My name is Dzmitry, I am 29 yers old. I like this course very mach. This " +
						"cat has name Moon, he lake a milk";
		String str3="1Java2Java3Java";
		System.out.println("-----------------StringTokenizer----------------------");
		//разбиение строки на подстроки, примитивный метод
		StringTokenizer st = new StringTokenizer("Java Near Us", " ", true);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("-----------------split-через регуляр \\. ---------------------");
		//разбиение строки метод split, регулярное выр. через "\\"
		String[] array = str1.split("\\. ");
		for (String temp : array) {
			System.out.println(temp);
		}
		System.out.println("----------------split через регуляр [., ]------------------------------------");
		//разбиение строки метод split, регулярное выр. через "[ ]"
		String[] array1 = str1.split("[., ]");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		System.out.println("-----------------Scanner------------------------------");
//вывод из текста только то что  строки через метод scanner
		Scanner scanner = new Scanner(str2);
		while (scanner.hasNext()) {
			if (scanner.hasNext("Dzmitry")) {
				System.out.println(scanner.next());
			} else if (scanner.hasNextInt()) {
				System.out.println(scanner.nextInt());
			} else {
				{
					scanner.hasNext();
				}
			}
		}
		// разделитель через scsnner
Scanner scanner1 = new Scanner(str3).useDelimiter("Java");
		while (scanner1.hasNextInt()){
			System.out.println(scanner1.nextInt());
		}
	}
}

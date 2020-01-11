package d.grigirchik.lab5;

public class example1 {
	public static void main(String[] args) {
		boolean condition;
		String str1 = "Я изуячаю";
		String str2 = "Бла бла";
		String str = "Test  string               for split";
//		String str2 = " и еще англ.яз";
//		String str3 = str1+str2;
//		System.out.println(str1+str2);
//		System.out.println(str3);
//		StringBuilder strBuilder = new StringBuilder(str1);
//		strBuilder.append(" и англ. яз");
//		System.out.println(strBuilder);
//		StringBuffer stringBuffer = new StringBuffer();
		String[] words = str.split(" +");
		// split разрезает строку str на части, далее присваиваем массиву words
//		типа данных String
		for (String word: words) {
			System.out.print(word + " ");
		}
		System.out.println();
		// matches проверяет имеется ли в строке определенные символы, цыфры, буквы
//		возвращает значение true/false;
		System.out.println("-207  34l".matches("-?[0123 456789kl]+"));
		condition=str1.matches("-?");
		System.out.println(condition);
	}
}


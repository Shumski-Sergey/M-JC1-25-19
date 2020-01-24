package d.grigirchik.examples.lection6;

public class stringBilderAndStringBufer {
	public static void main(String[] args) {
		String str = "Monster";
		String str1 = "Monster2";
		String str2 = "Monster3";
		String result = str;
		String str3="insert Example";
		String str4="ЗеркалО";
		str = str.concat(" s2");

		//в данном случае создается новый ооюбект каждый раз
		// при сложении строки, что снижает производительность
		// Желателньо в данном случа исрользовать
		// StringBuilder - потокоНебезопасный, но быстрый
		// или StringBuffer - покобезопасный, но медленный

		str2 = str + " " + str2 + " ssd";
		for (int i = 0; i < 3; i++) {
			result = result + i;
		}
		System.out.println(result);

		// использование stringBuilder

		StringBuilder stringBuilder = new StringBuilder(str);
//		приклеивание строк к строке stringBilder
		stringBuilder.append(" " + str1);
		System.out.println(stringBuilder);
// удвление части строки
		stringBuilder.delete(1,4);
		System.out.println(stringBuilder);
// вывод длины строки
		System.out.println(stringBuilder.length());
// удаление конкретного символа по его порядковому номеру
		stringBuilder.deleteCharAt(0);
		System.out.println(stringBuilder);
//		добавление символа/строки/числа с указанием его положения
		stringBuilder.insert(1,str3);
		System.out.println(stringBuilder);
//		разварачивает/зеркалит строку
		StringBuilder stringBuilder1 = new StringBuilder();
		stringBuilder1.append(str4);
		stringBuilder1.reverse();
		System.out.println(stringBuilder1);

	}
}

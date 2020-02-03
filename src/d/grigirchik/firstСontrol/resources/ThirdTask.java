package d.grigirchik.firstСontrol.resources;

import d.grigirchik.firstСontrol.interfaces.Solutions;

import java.util.ArrayList;

//Cоздадим список строк, считаем с клавиатуры 5 штук и добавим их в список.
// Затем с помощью цикла найдем из списка самую длинную строку (или несколько, если она такая не одна).
// Cамые длинные строки будут выведены на экран.

public class ThirdTask extends InputMetods implements Solutions {
	final static int STRINGS_ARRAY_SIZE = 5;   //количество строк вводимых с клавиатуры

	public void showTaskSolution() {
		System.out.println("Отличный выбор! Задача №3");
		ArrayList<StringBuilder> strings = new ArrayList<>();
		for (int i = 0; i < STRINGS_ARRAY_SIZE; i++) {
			int stringNumber = i + 1;
			strings.add(stringInput(stringNumber));
		}
		MetodsFirstControl.maxStringSizeOutput(strings, MetodsFirstControl.maxStringSizeDetector(strings));
	}
}

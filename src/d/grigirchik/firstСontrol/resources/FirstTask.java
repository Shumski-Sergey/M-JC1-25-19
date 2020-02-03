package d.grigirchik.firstСontrol.resources;

import d.grigirchik.firstСontrol.interfaces.Solutions;

public class FirstTask extends InputMetods implements Solutions {

	public void showTaskSolution() {
		StringBuilder stringLine = new StringBuilder();
		final int CHOSE_METOD_PARAMETR = 0; //параметр для унификациии метода ввода строк,
		// определяет, что для данной задачи в методе stringInput не будут нумероваться строки
		System.out.println("Отличный выбор! Задача №1");

		stringLine.append(stringInput(CHOSE_METOD_PARAMETR));
		MetodsFirstControl.firstTask(stringLine);
	}
}

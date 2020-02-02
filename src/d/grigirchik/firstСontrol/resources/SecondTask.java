package d.grigirchik.firstСontrol.resources;

import d.grigirchik.firstСontrol.interfaces.Solutions;

//		Заменить каждый элемент списка с четным номером на соседний слева элемент.

import java.util.ArrayList;

public class SecondTask extends InputMetods implements Solutions {

	public void showTaskSolution() {
		ArrayList<Integer> array = new ArrayList<>();
		System.out.println("Отличный выбор! Задача №2");
		System.out.println("Введите размер списка, который я заполню случайными числами:");
		int arraySize = enterNumber();

		for (int i = 0; i < arraySize; i++) {
			array.add(randomNumbers());
		}
		System.out.println("Случайно сгенерированный список:");
		System.out.println(array);

		System.out.println("Решение:");
		//так как номер элемента 0 явл. четным числом, то логичным будет
		//выполнить замену этого эелемента на последний элемент списка
		array.set(0, array.get(arraySize - 1));
		//определение четности номера элемента листа замена его соседним элементом слева
		for (int i = 1; i < arraySize; i++) {
			if (i % 2 == 0) {
				array.set(i, array.get(i - 1));
			}
		}
		System.out.println(array);
	}
}

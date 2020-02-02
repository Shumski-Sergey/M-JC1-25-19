package d.grigirchik.firstСontrol.resources;


import d.grigirchik.firstСontrol.interfaces.Solutions;

public class TaskSelection extends InputMetods {
	public static void taskSelection() {
		System.out.println("Приветсвую, вы просматриваете контрольную работу №1");

		Solutions task1 = new FirstTask();
		Solutions task2 = new SecondTask();
		Solutions task3 = new ThirdTask();

		int choise = 0;
		while (choise != 9) {

			System.out.println("Ниже представлены задачи контрольной работы");
			System.out.println("-----------------------------------------------------------------------------------------------");
			System.out.println("Задача №1:В данной строке найти количество цифр. Вывести количество и сумму цифр.(С клавиатуры)");
			System.out.println("-----------------------------------------------------------------------------------------------");
			System.out.println("Задача №2:Заменить каждый элемент списка с четным номером на соседний слева элемент.");
			System.out.println("-----------------------------------------------------------------------------------------------");
			System.out.println("Задача №3:Cоздадим список строк, считаем с клавиатуры 5 штук и добавим их в список. ");
			System.out.println("Затем с помощью цикла найдем из списка самую длинную строку (или несколько, если она такая не одна).");
			System.out.println("Cамые длинные строки будут выведены на экран.");
			System.out.println("-----------------------------------------------------------------------------------------------");
			System.out.println("Сделайте свой правильный выбор, введите номер задачи (1, 2, 3), для выхода из программы введите 9:");

			switch (enterNumber()) {
				case 1:
					outputSolution(task1);
					break;
				case 2:
					outputSolution(task2);
					break;
				case 3:
					outputSolution(task3);
					break;
				case 9:
					System.out.println("Вышел из программы. Хорошего дня!");
					choise = 9;
					break;
				default:
					System.out.println("Введите 1, 2, 3, или 9 (для завешения программы)");
			}
		}
	}
	public static void outputSolution(Solutions showSolution) {
		showSolution.showTaskSolution();
	}
}

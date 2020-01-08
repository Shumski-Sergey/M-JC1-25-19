package d.grigirchik.lab4.arraystasks;
//Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
public class Task2 {
	public static void main(String[] args) {
		int i = 1;
		int times = 1;
		do {
			System.out.println(i);
			i += 2;
			times += 1;
		} while (times <= 55);
	}
}

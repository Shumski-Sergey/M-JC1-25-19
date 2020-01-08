package d.grigirchik.lab4.arraystasks;
//Выведите на экран все члены последовательности 2an-1–1, где a1=2, которые меньше 10000.
public class Task5 {
	public static void main(String[] args) {
		for (int i=2; i<10000; i=2*i-1){
			System.out.println(i);
		}
	}
}

package d.grigirchik.lab4.arraystasks;
//Выведите на экран все двузначные члены последовательности 2an-1+200, где a1= –166.
public class Task6 {
	public static void main(String[] args) {

		for (int i = -166; i<=99; i=2*i+200){
			if (i>-99) {
				System.out.println(i);
			}
		}
	}
}

package d.grigirchik.lab4.arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = {111111111, 4141414, 3, 5, 2, 4, 23, 11, 211, 3, 1235, 24334, 41};
		int a;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if ( array[j-1]> array[j]) {
					 a= array[j-1];
					 array[j-1]=array[j];
					 array[j]=a;
				}
			}
		}
		for (int i=0; i<array.length; i++){
			System.out.print(array[i]+" ");
		}
	}
}

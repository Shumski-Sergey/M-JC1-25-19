import java.util.Scanner;

public class Lab4_3a_arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int numb = in.nextInt(); //создаём размер массива

        int[] array = new int[numb];

        System.out.print("Source array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (200 + 1)) - 100; //ввод рондомных чисел в диапазоне [-100; 100]
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.print("Inverted array: ");

        int mirror;
        for (int j = 0; j < numb / 2; j++) {
            mirror = array[j];
            array[j] = array[numb - j - 1]; // по очереди меняются местами противоположные элементы массива.
            array[numb - j - 1] = mirror; //[numb-j-1] - формула для определения противоположного элемента массива.
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

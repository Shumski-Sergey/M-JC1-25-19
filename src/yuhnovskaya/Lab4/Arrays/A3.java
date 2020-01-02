package yuhnovskaya.Lab4.Arrays;
////3.Создать массив, заполнить его случайными элементами, распечатать,
////перевернуть, и снова распечатать (при переворачивании нежелательно создавать
////еще один массив).
public class A3 {
    public static void main(String[] args) {
        //array declaration and filling
        int[] array = new int[9];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //array reverse
        for (int i = 0; i <array.length/2; i++) {
            {int t = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = t;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


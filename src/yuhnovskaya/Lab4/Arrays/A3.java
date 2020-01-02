package yuhnovskaya.Lab4.Arrays;
////3.Создать массив, заполнить его случайными элементами, распечатать,
////перевернуть, и снова распечатать (при переворачивании нежелательно создавать
////еще один массив).
public class A3 {
    public static void main(String[] args) {
        //array declaration and filling
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //array reverse
        for (int i = 0; i <array.length; i++) {
            for (int j=array.length-1; j>=0; j--) {
                int t=array[i];
                array[i]=array[j];
                array[j]=t;
                System.out.print(array[i] + " ");}break;}
    }
}

package dbesan.lab3.add2;

public class A3 {
    /**
     * переворачиваем массив
     **/
    public static void main(String[] args) {
        int[] array;
        array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (99 + (Math.random() * 99)));
        }
        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("Перевернутый массив: ");
        for (int j = array.length; j > 0; j--) {
            int temp = 0;
            int i = 0;
            i++;
            temp = array[i];
            array[i] = array[j - 1];
            array[j - 1] = temp;
            System.out.print(array[i] + " ");

        }

    }
}

package yuhnovskaya.Lab4.Arrays;
//4.Создать двухмерный квадратный массив, и заполнить его «бабочкой»,
//т.е таким образом:
//1 1 1 1 1
//0 1 1 1 0
//0 0 1 0 0
//0 1 1 1 0
//1 1 1 1 1
public class A4 {
    public static void main(String[] avgs) {
        int[][] array = new int[5][5];
        //array filling
        //upper half
        for (int i = 0; i <= array.length / 2; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i > j) | (j >= (array[i].length - i))) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }
        //lower half
        for (int i = array.length - 1; i >= array.length/2; i--) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i < j) | (j <(array[i].length-1 - i))) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }
        //array printing
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

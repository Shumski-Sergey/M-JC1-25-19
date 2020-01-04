package yuhnovskaya.Lab4.Tasks_arrays;
//1. Имеется целое число, следует вывести его в бухгалтерском формате.
//Т.е. начиная справа каждые три позиции отделяются пробелом. Например число
//20023143 должно быть выведено как 20 023 143
public class B1 {
    public static void main(String[] avgs) {
        int size = (int) (5 + Math.random() * 10);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i]);
        }
        System.out.println();
        int d=size%3;
                for (int i=0;i<d;i++) {System.out.print(array[i]);}System.out.print(" ");
        for (int j = size-1; j >=0; j=j-3) {
            for (int i = size-1-j+d; i <=size-j+3; i++) {
                System.out.print(array[i] );} System.out.print(" ");
            }
        }
    }



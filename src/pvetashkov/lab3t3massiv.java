package pvetashkov;
public class lab3t3massiv {
    public static void main(String[] args) {
        int a = 1000, b = 9999;
        int array[] = new int[3334];
        for (int i = 0; i < array.length-1; i++) {
            while (a < b) {
                array[i] = a;
                a=a+3;
                System.out.print("." + array[i] + ".");
            }
        }
    }
}
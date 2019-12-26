package pvetashkov;

public class lab3t3massiv3 {
    public static void main(String[] args) {
        int array[] = new int[25];
        int a = 90;
        for (int i = 0; i < (array.length); i++) {
            array[i] = a;
            a = (a - 5);
            if (array[i] >= 0) { // "while" doesnot work. why?
                System.out.print("nonnegative" + array[i] + ".");
            }
        }
    }
}

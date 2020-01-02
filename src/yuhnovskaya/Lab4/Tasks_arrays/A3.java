package yuhnovskaya.Lab4.Tasks_arrays;
//3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности
// 90 85 80 75 70 65 60 ….
public class A3 {
    public static void main(String[] avgs) {
        int length = 90 / 5;
        int[] progr = new int[length];
        progr[0] = 90;
        for (int i = 1; i < progr.length; i++) {
            progr[i] = progr[i - 1] - 5;
        }
        for (int i = 0; i < progr.length; i++) {
            System.out.print(progr[i] + " ");
        }
    }
}

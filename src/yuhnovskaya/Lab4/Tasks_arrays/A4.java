package yuhnovskaya.Lab4.Tasks_arrays;
//4. Создайте программу, выводящую на экран первые 20 элементов последовательности
// 2 4 8 16 32 64 128 ….
public class A4 {
    public static void main(String[] avgs) {
        int [] progr=new int[20];
        progr[0]=2;
        for (int i=1; i<progr.length; i++) {
            progr[i] = progr[i-1] * 2;
        }
        for (int i=0;i<progr.length; i++) {
            System.out.print(progr[i]+" ");
        }
    }
}

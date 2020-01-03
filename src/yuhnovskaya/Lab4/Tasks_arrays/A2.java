package yuhnovskaya.Lab4.Tasks_arrays;
//2. Создайте программу, выводящую на экран первые 55 элементов последовательности
// 1 3 5 7 9 11 13 15 17 ….
public class A2 {
    public static void main(String[] avgs) {
        int[] progr=new int[55];
        progr[0]=1;
        for (int i=1; i<progr.length; i++) {
            progr[i]=progr[i-1]+2;
        }
        for (int i=0; i<progr.length; i++)
        {System.out.print(progr[i]+" ");}
    }
}

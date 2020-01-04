package yuhnovskaya.Lab4.Tasks_arrays;
//5. Выведите на экран все члены последовательности 2an-1–1, где a1=2,
// которые меньше 10000.
public class A5 {
    public static void main(String[] avgs) {
        //array size
        int length=0;
        for (int a=2; a<10000; a=2*a-1) {
            length = length + 1;
        }
        //array declaration
        int[] progr=new int[length];
        //array filling
        progr[0]=2;
        for (int i=1; i<progr.length; i++) {
            progr[i]=2*progr[i-1]-1;}
        //array output
        for (int i=0; i<progr.length; i++) {
            System.out.print(progr[i]+" ");
        }
    }
}

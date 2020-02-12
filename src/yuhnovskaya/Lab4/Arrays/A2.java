package src.yuhnovskaya.Lab4.Arrays;
//2. Определите сумму элементов массива, расположенных между минимальным
//и максимальным значениями.
public class A2 {
    public static void main(String[] args)
    {//array declaration and filling
        int[]array=new int[10];
        for (int k = 0; k < array.length; k++) {
            array[k] =(int)(Math.random()*100);
            System.out.print(array[k]+" ");}
        System.out.println();
        //searching for the min and max positions
        int max=0;
        int min=0;
        for (int i=max+1; i<array.length; i++)
        {if (array[i]>array[max]) {max=i;}
            if (array[i]<array[min]) {min=i;}}
        //calculation the sum of elements between min and max positions
        int sum=0;
        if (min<max) {
            for (int i=min+1; i<max; i++)
            {sum=sum+array[i];}}
        else { for (int i=max+1; i<min; i++) {sum=sum+array[i];}}
        System.out.println ("The sum between min and max = "+sum);}
}

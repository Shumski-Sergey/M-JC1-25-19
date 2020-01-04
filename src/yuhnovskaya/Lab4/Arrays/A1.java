package yuhnovskaya.Lab4.Arrays;
//1.В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.
public class A1 {
    public static void main(String[] args)
    {int[]array=new int[10];
        for (int k = 0; k < array.length; k++) {
            array[k] =(int)(Math.random()*100);
            System.out.print(array[k]+" ");}
        System.out.println();
        int max=0;
        for (int i=max+1; i<array.length; i++)
        {if (array[i]>array[max]) {max=i;}  }

        System.out.println ("position of the max mark = "+max);}

}


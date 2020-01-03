package pvetashkov;
import java.util.Scanner;
import java.util.Random;
public class lab3SummaMinMax {
    public static void main(String[] args) {
        int n=8, i, indexmax = 0, indexmin = 0;
        int maxrange = 1000, min = maxrange, max = 0, sum=0;
        System.out.println(" Enter size");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Random rand = new Random();
        int array[] = new int[n];
        for (i = 0; i < n ; i++) {
            array[i] = rand.nextInt(100);
            System.out.print(array[i]+" ");
            if (array[i] <= min) {
                min = array[i];
                indexmin = i;
            }
            if (array[i] > max) {
                max = array[i];
                indexmax = i;
            }
        }

        if (indexmax > indexmin) {
            for (i = indexmin+1; i < indexmax; i++) {
                sum = sum + array[i];}
        }
        if (indexmax < indexmin) {
            for (i = indexmax+1; i < indexmin; i++) {
                sum = sum + array[i];}

            System.out.println("summ " + sum);}

        System.out.println("max is " + max);
        System.out.print("min is " + min);
    }
}



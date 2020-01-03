package pvetashkov;
import java.util.Scanner;
import java.util.Random;
public class lab3index {
    public static void main(String[] args) {
        int n;
        int max = 0; //значение максимального эл-та
        int maxi=0; // индекс максимального
        Random rand = new Random();
        System.out.println("enter size of array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(1000);// вместо поиска имеющейся оценки просто накидаем новых
            if (array[i] > max) {
                max = (array[i]);
                maxi = i;
            }
            System.out.print(array[i] +"\t");
            System.out.print("");
            }
        System.out.println("max count is  " + max); //пусть будет и само значение ячейки
        System.out.println("index of max is "+maxi);
       }
}


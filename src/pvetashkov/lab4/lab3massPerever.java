package pvetashkov.lab4;
import java.util.Random;
import java.util.Scanner;
public class lab3massPerever {
    public static void main(String[] args) {
        int n;
        int f = 1, temp;
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int array[] = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(100);
            System.out.print("--" + array[i]);
        }
        System.out.println();
        if (n % 2 != 0) {//если нечетное количество эл-тов
            for (int i = 0; i < (n-1)/2; i++, f++) { //с середины отражает зеркально новый порядок
                temp = array[i];
                array[i] = array[n - f];
                array[n - f] = temp;
            System.out.print(array[i]+" ");}
        } else {      //четное кол-во
            for (int i = 0; i < n/2 ; i++,f++) {
                temp = array[i];
                array[i] = array[n-f];
                array[n-f] = temp;
                System.out.print(array[i] + "  ");
            }
        }
    }
}
package pvetashkov.lab4;
import java.util.Scanner;
import java.util.Random;
public class lab4A3 {
    public static void main(String[] args) { //не слишком правильно, но переворачивает
        int n, temp;
        System.out.println("enter size of square array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Random rnd = new Random();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rnd.nextInt(100);
                System.out.print(arr[i][j] + "-");
                }
                System.out.println();}
        System.out.println();
                for (int i = 0; i < n; i++) {
                    for (int j = n-1; j>=0; j--) {
                        temp = arr[i][j];
                        arr[i][j] = arr[j][i];
                        arr[j][i] = temp;
                        System.out.print(arr[i][j] + "_");}
                        System.out.println();
                }

               }
            }
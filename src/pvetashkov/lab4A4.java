package pvetashkov;
import java.util.Scanner;
public class lab4A4 {
    public static void main(String[] args) {
        System.out.println("Size?");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][] = new int[n][n];
        if (n%2==0) {
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
                System.out.print(arr[i][j]+" ");
            } System.out.println();
         }
         System.out.println();
        for (int i=1;i<n-1;i++){
            for (int j=i;j<n-1;j++){
                arr[i][j]=1;
                }
        }
           for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");}
                    System.out.println();

            }
        }
    }
}
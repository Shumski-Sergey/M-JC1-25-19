package pvetashkov.lab5;
import java.util.Scanner;
public class lab5A1 {
    public static void main(String[] args){
        System.out.println("Enter quantity");
        int n;
        String temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        String str[]=new String[n];
        System.out.println("Type any strings");
        for (int i=0; i<n; i++){
            str[i]=sc.nextLine();
         System.out.println(str[i]);}
        for (int i=0; i<n; i++) {
            if (str[i].length() < str[n-1].length()) {
                temp = str[i];
                str[i] = str[n-1];
                str[n-1] = temp;
            }
        }
            System.out.print("the longest is_"+ str[0]+" " +str[0].length()+" letters");
            System.out.println();
            System.out.print("the shortest is_"+ str[n-1]+" " +str[n-1].length()+" letters");
            sc.close();
        }
}

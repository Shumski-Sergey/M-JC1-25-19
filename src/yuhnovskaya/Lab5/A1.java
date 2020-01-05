package yuhnovskaya.Lab5;

import java.util.Scanner;

//Ввести n строк с консоли, найти самую короткую и самую длинную строки.
// Вывести найденные строки и их длину.
public class A1 {
    public static void main(String[] avgs) {
        //number of lines
        System.out.print("Enter number of lines: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String [] array=new String[n];
        //input strings and array filling
            for (int i=0; i<n; i++) {
            System.out.print("Enter string "+(i+1)+": ");
            Scanner scanner2=new Scanner(System.in);
            String str = scanner2.nextLine();
            array[i]=str;
            }
            //searching max and min length
            int max=0;
            int min=0;
            for (int j=max+1; j<n; j++)
            {if (array[j].length()>array[max].length()){max=j;}
            if (array[j].length()<array[min].length()){min=j;}
            }
           System.out.println("\nmax length="+array[max].length()+";\nthe longest string: "+array[max]);
           System.out.println("\nmin length="+array[min].length()+";\nthe shortest string: "+array[min]);
    }
}


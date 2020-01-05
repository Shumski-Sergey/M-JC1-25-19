package yuhnovskaya.Lab5;

import java.util.Scanner;

//2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
public class A2 {
    public static void main(String[] avgs){
        //input strings
        System.out.print("Enter number of lines: ");
        Scanner scanner=new Scanner (System.in);
        int n=scanner.nextInt();
        String[] array=new String[n];
        for (int i=0; i<n;i++){
            System.out.print("Enter sine_"+(i+1)+": ");
            Scanner scanner2=new Scanner(System.in);
            String str=scanner2.nextLine();
            array[i]=str;
            }
        //from min to max
        System.out.println("\nResult_Increase:");
        for (int i=0;i<n;i++) {
            for (int j=i+1; j<n; j++){
              if (array[j].length()<array[i].length()){
              String t=array[i];
              array[i]=array[j];
              array[j]=t;}
            }
        System.out.println("String_"+(i+1)+": "+array[i]+" ("+array[i].length()+")");
        }
        //from max to min
        System.out.println("\nResult_Decrease:");
        for (int i=0;i<n;i++) {
            for (int j=i+1; j<n; j++){
                if (array[j].length()>array[i].length()){
                    String t=array[i];
                    array[i]=array[j];
                    array[j]=t;}
            }
            System.out.println("String_"+(i+1)+": "+array[i]+" ("+array[i].length()+")");
        }
    }
}

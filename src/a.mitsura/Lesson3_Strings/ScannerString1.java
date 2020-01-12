package a.mitsura.Lesson3_Strings;

import java.util.Scanner;

public class ScannerString1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How much lines there will be created?");
        int n=sc.nextInt();
        String[] array=new String[n];
    for(int i=0; i<n; i++) {
        Scanner line = new Scanner(System.in);
        System.out.println("text the line");
        array[i] = line.nextLine();
        }
        int minLength=array.length;
        int maxLength=array.length;
    for(int i=1; i<array.length; i++){
            if(array[i].length()<minLength){
            minLength=array[i].length();}else{
            maxLength=array[i].length();
            }
        }
    System.out.println("The longest line is consists of "+ maxLength+" symbols");
    System.out.println("The shortest line is consists of "+minLength+" symbols");
    }
}

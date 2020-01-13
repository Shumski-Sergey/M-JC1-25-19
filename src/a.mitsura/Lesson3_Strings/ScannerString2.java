package a.mitsura.Lesson3_Strings;

import java.util.Scanner;

public class ScannerString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much lines there will be created?");
        int n = sc.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            Scanner line = new Scanner(System.in);
            System.out.println("text the line");
            array[i] = line.nextLine();}
//        Сортировка пузырьком из JC1:
        for(int  i=array.length-1; i>0; i--){
            for(int j=0;j<i;j++){
                if(array[j].length()>array[j+1].length()){
                    String temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for (String graduality: array) {
            System.out.println(graduality);
        }
        }
    }

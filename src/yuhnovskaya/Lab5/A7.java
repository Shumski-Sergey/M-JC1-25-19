package yuhnovskaya.Lab5;

import java.util.Scanner;

//7. Ввести n слов с консоли. Найти слово, состоящее только из различных символов.
// Если таких слов несколько, найти первое из них.
public class A7 {
    public static void main(String[] avgs){
        System.out.print("Enter number of words: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String[] array=new String[n];
        for (int i=0; i<n;i++){
            System.out.print("Enter word_"+(i+1)+": ");
            Scanner scanner2=new Scanner(System.in);
            String word=scanner2.nextLine();
            array[i]=word;
        }
        int dif_symb=0;
        for (int i=0; i<n; i++) {
            char[] ar_symb = array[i].toCharArray();
            int count=0;
            outer:
            for (int j = 0; j < array[i].length()-1; j++) {
                for (int k=j+1; k<array[i].length();k++){

                    if (ar_symb[j] == ar_symb[k]) {
                        break outer;}
                }
                count=count+1;
            }
            if ((count+1)==array[i].length()){
                dif_symb=i; break;
            }
        }
        System.out.println(array[dif_symb]);
    }
}

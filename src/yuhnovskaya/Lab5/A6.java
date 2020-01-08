package yuhnovskaya.Lab5;

import java.util.Scanner;

//6. Ввести n слов с консоли. Найти слово, символы в котором идут в стро-гом порядке возрастания их кодов.
// Если таких слов несколько, найти первое из них.
public class A6 {
    public static void main(String[] avgs){
        System.out.print("Enter number of words: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String[] array=new String[n];
        for (int i=0; i<n; i++){
            System.out.print("Enter word_"+(i+1)+": ");
            Scanner scanner2=new Scanner(System.in);
            String word=scanner2.nextLine();
            array[i]=word;
        }
        int incr=0;// number of an increasing word
        int noincr=0;// amount of no-increasing words
        outer:
        for (int i=0;i<n;i++) {
            char[] ar_symb = array[i].toCharArray();
            int count_incr=0;//amount of an increasing symbols
            for (int j = 0; j < array[i].length()-1 ; j++) {
                if ((int)ar_symb[j]<(int)ar_symb[j+1]){
                    count_incr=count_incr+1;
                }
            }
            if (count_incr+1==array[i].length()){
                incr=i;
                System.out.print("The first word with increasing code: "+array[incr]);
                break outer;
            }
            else {noincr=noincr+1;}
        }
        if (noincr==n){
                System.out.print("There is no word with increasing code:(");
        }
    }
}

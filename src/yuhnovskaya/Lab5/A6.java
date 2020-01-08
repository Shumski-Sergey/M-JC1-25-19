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
        int incr_code=0;
        int noincr_code=0;
        outer:
        for (int i=0;i<n;i++) {
            char[] ar_symb = array[i].toCharArray();
            int count_incr=0;
            for (int j = 0; j < array[i].length()-1 ; j++) {
                if ((int)ar_symb[j]<(int)ar_symb[j+1]){
                    count_incr=count_incr+1;
                }
            }
            if (count_incr+1==array[i].length()){
                incr_code=i;
                System.out.print("The first word with increasing code: "+array[incr_code]);
                break outer;
            }
            else {noincr_code=noincr_code+1;}
        }
        if (noincr_code==n){
                System.out.print("There is no word with increasing code:(");
        }
    }
}

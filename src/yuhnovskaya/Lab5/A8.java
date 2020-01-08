package yuhnovskaya.Lab5;

import java.util.Scanner;

//8. Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром.
// Если таких слов больше одного, найти второе из них.
public class A8 {
    public static void main(String[] avgs) {
        System.out.print("Enter number of words: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String[] array=new String[n];
        for (int i=0; i<n;i++) {
            System.out.print("Enter word_"+(i+1)+": ");
            Scanner scanner2=new Scanner(System.in);
            String word=scanner2.nextLine();
            array[i]=word;
        }
        int count_pal=0;
        int pal=0;outer:
        for (int i=0;i<n; i++) {
            char[] ar_dig=array[i].toCharArray();
            boolean dig=array[i].matches("[0-9]+");
            if ((dig) & (array[i].length()>1)){
                int count=0;
                for (int j = 0; j < array[i].length() / 2; j++) {
                    if (ar_dig[j] != ar_dig[array[i].length()-1-j]) {
                        break ;
                    }
                    else {
                        count=count+1;
                    }
                }
                if (count==array[i].length()/2) {
                    pal = i;
                    count_pal = count_pal + 1;
                    if (count_pal == 2) {
                        System.out.print("\nThe seconf word-palindopm: " + array[pal]+"\n");
                    }
                }
            }
        }
        if (count_pal == 1) {
            System.out.print("\nThe word-palindrom: " + array[pal]+"\n");
        }
        if (count_pal == 0) {
            System.out.print("\nThere is no word-palindrom here:("+"\n");
        }
    }
}

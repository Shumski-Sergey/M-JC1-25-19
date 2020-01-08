package yuhnovskaya.Lab5;

import java.util.Scanner;
//5. Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского алфавита,
// а среди них – количество слов с равным числом гласных и согласных букв.
public class A5 {
    public static void main(String[] avgs){
        System.out.print("Enter number of words: ");
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        String[] array=new String[n];
        for (int i=0; i<n; i++){
            System.out.print("Enter word_"+(i+1)+": ");
            Scanner scanner2=new Scanner(System.in);
            String word=scanner2.nextLine();
            array[i]=word;
        }

        int num_lat=0;
        for (int i=0;i<n;i++) {
            char[] ar_symb = array[i].toCharArray();
            boolean lat = array[i].matches("[a-zA-Z]+");
            if (lat) {
                int num_vow = 0;
                int num_cons = 0;
                for (int j = 0; j < array[i].length(); j++) {
                    if (ar_symb[j] == 'e' | ar_symb[j] == 'E' |
                            ar_symb[j] == 'y' | ar_symb[j] == 'Y' |
                            ar_symb[j] == 'u' | ar_symb[j] == 'U' |
                            ar_symb[j] == 'i' | ar_symb[j] == 'I' |
                            ar_symb[j] == 'o' | ar_symb[j] == 'O' |
                            ar_symb[j] == 'a' | ar_symb[j] == 'A') {
                        num_vow = num_vow + 1;
                    }
                    else {
                        num_cons = num_cons + 1;
                    }
                }
                System.out.println("Word_"+(i+1)+": vowels="+num_vow + "; consonants=" + num_cons);
                if (num_vow == num_cons) {
                    num_lat = num_lat + 1;
                }
            }
        }
        System.out.println("Number of words consisting of latin letters that have the same number of vowels and consonants: "+ num_lat);
    }
}

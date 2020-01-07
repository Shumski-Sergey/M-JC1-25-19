package yuhnovskaya.Lab5;

import java.util.Scanner;
import java.util.regex.Pattern;

//4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
// Если таких слов несколько, найти первое из них.
public class A4 {
    public static void main(String[] avgs) {
        System.out.print("Enter number of words: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter word_" + (i + 1) + ": ");
            Scanner scanner2 = new Scanner(System.in);
            String str = scanner2.nextLine();
            array[i] = str;}
                int[] ar_min=new int[n];
        for (int i=0; i<n; i++){
            char[] ar_str=array[i].toCharArray();
            int num_symb=0;
            for (int j=0; j<array[i].length()-1;j++){
                if (ar_str[j]!=ar_str[j+1]){
                        num_symb=num_symb+1;
                }
                ar_min[i]=num_symb;
            }
        }
        int min=0;
        for (int k=min+1; k<n; k++) {
            if (ar_min[k]<ar_min[min]){
                min=k;}
            }
        System.out.print("\nResult: "+array[min]);
    }
}
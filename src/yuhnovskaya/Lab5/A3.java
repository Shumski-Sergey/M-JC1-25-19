package yuhnovskaya.Lab5;

import java.util.Scanner;

//3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.
public class A3 {
    public static void main(String[] abgs){
        //Inputting^
        System.out.print("Enter number of strings: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String[] array=new String[n];
        for (int i=0; i<n;i++){
            System.out.print("Enter string_"+(i+1)+": ");
            Scanner scanner2=new Scanner(System.in);
            String str=scanner2.nextLine();
            array[i]=str;
        }
        int t_length=0; //total length
        for (int i=0;i<n;i++){
            t_length=t_length+array[i].length();
        }

        int avg_length=t_length/n;//average string length
        System.out.println("\nAverage length="+avg_length);
        //longer than average length:
        System.out.println("\nLonger than average length:");
        for (int i=0; i<n; i++){
            if (array[i].length()>avg_length){
                System.out.println(array[i]+" ("+array[i].length()+")");
            }
        }
        //Shorter than average length:
        System.out.println("\nShorter than average length:");
        for (int i=0; i<n; i++) {
            if (array[i].length() < avg_length) {
                System.out.println(array[i] + " (" + array[i].length() + ")");
            }
        }

    }
}

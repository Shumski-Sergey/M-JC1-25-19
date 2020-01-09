package pvetashkov.lab5; //уволок у Димы. внаглую. не разобрался полностью. выдает первое слово

import java.io.*;

public class lab5A4 {
    public static void main(String[] args) throws IOException {
        StringBuffer sbf = new StringBuffer();
        System.out.println("enter quantity of words");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0, index=0, mem=0;
        String str[] = new String[n];

        System.out.println("and words");
        for (int i = 0; i < str.length; i++) {
            str[i] = br.readLine();
        }
        char arr[];
        for (int i = 0; i < str.length; i++) {
            arr = new char[str[i].length()];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = str[i].charAt(j);
            }
            for (int j = 0; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; j++) {
                    if (arr[j] == arr[k]) {
                        break;
                    } else if (k == arr.length - 1) {
                        count++;
                    }
                }
            }
            if ( mem > count) {
                index = i;
                mem = count;
            }
           count = 0;
        }
        System.out.print("Min diff letter is " + str[index]);
    }


}
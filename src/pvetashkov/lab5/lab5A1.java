package pvetashkov.lab5;
import java.io.*;
public class lab5A1 {
    public static void main(String[] args) throws IOException {
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        String str = new String();
        int sum = 0;
        char[] ch = {'-', '.', ',', ':', ';', '?', '!'};
        System.out.println("Enter string");
        str = rdr.readLine();
        char[] chr = str.toCharArray();
        for (int i=0; i < chr.length; i++) {
            for (int j=0; j<ch.length;j++) {
                if (chr[i] == ch[j]) {
                    sum++;
                }
            }
          }
            System.out.println("кол-во знаков препинания равно "+sum);}
        }
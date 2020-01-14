package pvetashkov.lab5;
import java.io.*;
import java.nio.*;
public class lab5A6 {
    public static void main(String[] args) throws IOException {
        String str = new String();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("type here any words  whose Unicode will gte upper");
        str = br.readLine();
        boolean ok=false;
        System.out.print("our word: " + str);
        System.out.println();
        String ws[] = str.split(" +");
        for (int i = 0; i < ws.length; i++) {
            for (int j = 0; j < ws[i].length() - 1; j++) {
                if (ws[i].charAt(j+1)%ws[i].charAt(j)==1) {
                    ok = true;}}
                if (ok == true) {
                    System.out.print(ws[i] + "_");}
        ok=false;}
        }
    }
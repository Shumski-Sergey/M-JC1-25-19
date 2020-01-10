package pvetashkov.lab5;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class lab5A5 {
    public static void main(String[] args) throws IOException {
        StringBuffer sbf = new StringBuffer();
        String str;
        boolean a = false;
        int count = 0, glcount = 0, other = 0;
        String shab = ("^[a-zA-Z]+");
        String glas = ("[eyuioajEYUIOAJ]+");
        Pattern p = Pattern.compile(shab);
        Pattern pp = Pattern.compile(glas);
        System.out.println("Enter any words");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        String slova[] = str.split(" +");
        for (int i = 0; i < slova.length; i++) {
            Matcher m = p.matcher(slova[i]);
            while (m.find()) {
                count++;
                System.out.print(slova[i] + " ");
            }
        }

        for (int j = 0; j< slova.length; j++) {
            Matcher m = p.matcher(slova[j]);
            Matcher mm=p.matcher(slova[j]);
            while (m.find()) {
               // Matcher mm = pp.matcher(slova[i]);
                while (mm.find()) {
                    a = true;
                }
                if (a == true) {
                    glcount++;}
                if (a==false) {
                    other++;}
            }


              if (glcount == other) {
                    System.out.print(slova[j] + "_");}
                }
               // }
            //}
            System.out.println();
            System.out.print("Good words are " + count);

        }
    }

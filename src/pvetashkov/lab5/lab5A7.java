package pvetashkov.lab5;//двубуквенные слова не отсеивает
import java.io.*;
import java.nio.*;
public class lab5A7 {
    public static void main(String [] args) throws IOException{
        System.out.println("enter anything");
        String str=new String();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        str=br.readLine();
        String words[]=str.split(" +");
        System.out.println("our sentence is: "+str);
        boolean sign=false;
        for (int i=0;i<words.length;i++) {
            for (int j = 0; j < words[i].length() ; j++) {
                for (int k = 1; k < j; k++) {
                    if (words[i].charAt(j) == words[i].charAt(k)) {
                        sign=true;
                    break;}
                    else {sign=false;}
              }
          }
            if (sign==false){
            System.out.print(" Different letter made is: " + words[i]);}
        }
   }
}

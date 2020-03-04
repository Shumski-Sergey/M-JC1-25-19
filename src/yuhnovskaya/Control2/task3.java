package src.yuhnovskaya.Control2;

import java.io.*;

/**
 * Created by user on 04.03.2020.
 */
public class task3 {
    public static void main(String[]avgs){
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int digit=(int)Math.random()*100;
        final int NUMBER_OF_DIGITS=100;
      try{  BufferedWriter writer=new BufferedWriter((new OutputStreamWriter(new FileOutputStream("src/result"))));
          for (int i=0; i<NUMBER_OF_DIGITS; i++)
          writer.write(digit+"\n");
          } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }
        try{FileInputStream fin=new FileInputStream("str/result");



    } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    }

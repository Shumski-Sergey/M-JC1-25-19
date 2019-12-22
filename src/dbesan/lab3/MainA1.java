package dbesan.lab3;
import java.io.*;
/**
 * Created by user on 21.12.2019.
 */
public class MainA1 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        int a = Integer.parseInt(reader.readLine());
       String b = Integer.toString(a);
       int result = 0;
       for(char character : b.toCharArray())
       {
           result += Integer.valueOf(Character.toString(character));
       }
                      System.out.println(result);

    }
}

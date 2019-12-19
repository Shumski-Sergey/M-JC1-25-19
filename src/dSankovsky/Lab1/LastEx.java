package dSankovsky.Lab1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LastEx {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numb = reader.readLine();
        int nNumb = Integer.parseInt(numb);
        if(nNumb%2 == 0 && nNumb !=0)
            System.out.println("Число " + nNumb + " четное");
        else if (nNumb%2 != 0)
            System.out.println("Число " + nNumb + " нечетное");
        else
            System.out.println("Введен ноль");

    }
}

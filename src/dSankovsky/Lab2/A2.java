package dSankovsky.Lab2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class A2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double fSqr, sSqr;

        System.out.println("Введите число А"); //ввод двух цифр с клавиатуры
        String first = reader.readLine();
        double numbA = Double.parseDouble(first);
        System.out.println("Введите число B");
        String second = reader.readLine();
        double numbB = Double.parseDouble(second);
        System.out.println("Введите число C");
        String third = reader.readLine();
        double numbC = Double.parseDouble(third);

        double D = numbB*numbB - 4*numbA*numbC;  //дискриминант квадратного корня по формуле b^2-4ac

        if(D<0)  //нахождение квадратных корней в зависимости от значения дискриминанта
            System.out.println("Нет корней");
        else if(D==0){
            double oneSqr = (-numbB)/(2*numbA);   // один корень по формуле -b/2a
            System.out.println("Единственный корень " + oneSqr);
        } else{
            fSqr = (-numbB + Math.sqrt(D))/(2*numbA);    //два корня по формуле (-b +- D^-2)/2a
            sSqr = (-numbB - Math.sqrt(D))/(2*numbA);
            System.out.println("Два кореня: " + fSqr + " и " + sSqr);
        }
    }
}

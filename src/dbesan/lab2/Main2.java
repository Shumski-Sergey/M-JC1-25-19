package dbesan.lab2;
import java.io.*;


import static java.lang.Math.*;
public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Введите треть число");
        int c = Integer.parseInt(reader.readLine());
        int d = (b*b)-4*a*c;

        if ( d > 0 )
        {
        double x1 = (-b + sqrt(d))/2*a;
        double x2 = (-b - sqrt(d))/2*a;
            System.out.println("Два корня:"+ ", " + x1 + " "  + x2);}
        else if (d ==0 ) {
            double x1 = (-b + sqrt(d))/2*a;
            System.out.println("Один корень:" + " " + x1);
            }
        else
        {System.out.println("Корней нет");}
        }



    }


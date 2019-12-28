package dSankovsky.Lab2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class A1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число");     //ввод двух цифр с клавиатуры
        String first = reader.readLine();
        System.out.println("Введите второе число");
        String second = reader.readLine();
        int fNumb = Integer.parseInt(first);    //перевод их из строки в число
        int sNumb = Integer.parseInt(second);

        int oneNumb, twoNumb;     //две переменные, содержащие расстояние до 10
        if(fNumb>10)
            oneNumb = fNumb-10;
        else
            oneNumb = 10-fNumb;
        if(sNumb>10)
            twoNumb = sNumb-10;
        else
            twoNumb = 10-sNumb;

        if(oneNumb>twoNumb)   //сравнение растояний до 10
            System.out.println("Число " + sNumb + " ближе к 10");
        else if (oneNumb<twoNumb)
            System.out.println("Число " + fNumb + " ближе к 10");
        else
            System.out.println("Числа на одном расстоянии от 10");
    }
}

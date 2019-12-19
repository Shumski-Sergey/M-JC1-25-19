package dSankovsky.Lab2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        String numb = reader.readLine();
        int nNumb = Integer.parseInt(numb);
        int sum = 0;
        if(nNumb<=0)
            System.out.println("Не положительное число. Но не волнуйся, в следующий раз попадешь по нужной кнопке");
        else{
            for(int i = 1; i <= nNumb; i++){
                    sum += i;
            }
            System.out.println("Сумма чисел от 1 до " + nNumb + " равна " + sum);
        }

    }
}

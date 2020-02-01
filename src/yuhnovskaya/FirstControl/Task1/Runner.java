package src.yuhnovskaya.FirstControl.Task1;
//В данной строке найти количество цифр. Вывести количество и сумму цифр.(С клавиатуры)

import java.util.Scanner;

import static src.yuhnovskaya.FirstControl.Task1.Digits_Num.DigitsNum;
import static src.yuhnovskaya.FirstControl.Task1.Digits_Sum.DigitsSum;

public class Runner {

    public static void main(String[]avgs){
        System.out.println("Enter string:");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();

        int num=DigitsNum(str);
        int sum=DigitsSum(str);

        System.out.println("Number of digits: "+num);
        System.out.println("Sum of digits: "+sum);
    }
}

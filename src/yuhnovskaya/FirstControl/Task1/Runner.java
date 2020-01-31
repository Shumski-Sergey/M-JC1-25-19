package src.yuhnovskaya.FirstControl.Task1;
//В данной строке найти количество цифр. Вывести количество и сумму цифр.(С клавиатуры)

import java.util.Scanner;

public class Runner {

    public static void main(String[]avgs){
        System.out.println("Enter string:");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        Digits_Num dn=new Digits_Num(str);
        Digits_Sum ds=new Digits_Sum(str);

        int num=dn.DigitsNum(str);
        int sum=ds.DigitsSum(str);

        System.out.println("Number of digits: "+num);
        System.out.println("Sum of digits: "+sum);
    }
}

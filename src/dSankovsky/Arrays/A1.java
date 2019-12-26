package dSankovsky.Arrays;

public class A1 {
    public static void main(String[] args) {
//вывести числа от 1000 до последнего четырехзначного с шагом в 3
        int n = 1;
        int d = 3;
        int second = 1000;
        int first = second;
        while (second < 9999) {
            second = first + d * (n - 1);   //универсальная формула арифметической прогрессии
            if(second>9999)
                break;
            System.out.println(second);
            n++;
        }
    }

}

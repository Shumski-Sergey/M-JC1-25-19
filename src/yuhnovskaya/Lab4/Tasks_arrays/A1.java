package yuhnovskaya.Lab4.Tasks_arrays;
//1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности
// 1000 1003 1006 1009 1012 1015 ….
public class A1 {
    public static void main(String[] args)
    {int length=(10000-1000)/3;
        int[] numbers = new int[length];
        numbers[0]=1000;
        for (int i = 1; i < numbers.length; i++){
            numbers[i] = numbers[i-1]+3;
        }
        for (int i=0; i<numbers.length;i++)
        {System.out.print(numbers[i]+" ");}
    }
}

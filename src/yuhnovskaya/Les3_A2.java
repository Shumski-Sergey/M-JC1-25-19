package yuhnovskaya;

public class Les3_A2 {
    public static void main(String[] args) {
        int i=11;
        for (int j=2; j<i; j++)
        {if (i%j==0)
        {System.out.println(i+"-составное число");
        break;}
              else  {System.out.println(i+"-простое число");
              break;}

    }
}}

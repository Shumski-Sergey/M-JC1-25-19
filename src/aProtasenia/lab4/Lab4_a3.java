package aProtasenia.lab4;
//меется целое число, следует вывести его в бухгалтерском формате.
//Т.е. начиная справа каждые три позиции отделяются пробелом. Например число
//20023143 должно быть выведено как 20 023 143

public class Lab4_a3 {
    public static void main(String[] args) {
        /* long num = 1876543210;
        long a1 = num % 1000;
        long b1 = num / 1000;
        long a2 = b1 % 1000;
        long b2 = num / 1000000;
        long a3 = b2 % 1000;
        long b3 = num / 1000000000;
        long a4 = b3 % 1000;
        System.out.println(a4 + " " + a3 + " " + a2 + " " + a1);*/

       //Можно проще через метод Printf
       long num = 1876543210678890333L;
        System.out.printf("%,d", num);
       }
}






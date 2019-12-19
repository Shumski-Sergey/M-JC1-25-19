package dSankovsky.Lab2;

public class B1 {
    public static void main(String[] args){
        int firstBorder = 5;
        int lastBorder = 150;   //диапазон чисел от 5 до 155, рандом дает значение от 0 до 1. при рандоме 0 будет 5, при 1 - 155
        int numb = firstBorder + (int) (Math.random()*lastBorder);
        //метод Math.random() выдает значения типа double.
        // (int) перед ним дает округление до целого числа (скорее всего, по правилам математики)
        if(numb>25 && numb<100)
            System.out.println("Число " + numb + " входит в диапазон от 25 до 100 (не включая границы)");
        else
            System.out.println("Число " + numb + " не входит в диапазон от 25 до 100 (не включая границы)");
    }

}

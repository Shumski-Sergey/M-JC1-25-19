package aantonovich.Lesson2;

public class Lesson2task3 {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        int c = 505;
        if (a > b && a > c && b > c) {
            System.out.println(c + " " + b + " " + a);}
        else if (a > b && a > c && c > b){
            System.out.println(b + " " + c + " " + a);}
        else if (b > c && b > a && c > a) {
            System.out.println(a + " " + c + " " + b);}
        else if (b > c && b > a && a > c){
            System.out.println(c + " " + a + " " + b);}
        else if (c > a && c > b && a > b) {
            System.out.println(b + " " + a + " " + c);}
        else if (c > a && c > b && b > a) {
            System.out.println(a + " " + b + " " + c);}
        else {  System.out.println("Введите числа, которые не равны");}
    }
    }


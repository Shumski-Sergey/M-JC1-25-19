package riliuchik.lab2;

public class Lab2_taskB1 {
    public static void main(String[] args) {
        int x=(int)(Math.random()*151+5);
        if (x>25 && x<100) {
            System.out.println("Случайно выбранное число x="+x+" из отрезка [5;155] входит в интервал (25;100)");
        }
        else {
            System.out.println("Случайно выбранное число x="+x+" из отрезка [5;155] не входит в интервал (25;100)");
        }
    }
}
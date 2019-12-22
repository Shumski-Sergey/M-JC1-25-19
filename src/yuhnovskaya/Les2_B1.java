package yuhnovskaya;

public class Les2_B1 {
    public static void main(String[] args) {
        int x=5+(int)(Math.random()*151);
        if (x>25 & x<100) {System.out.println(x+" попадает в интервал от 25 до 100");}
        else {System.out.println(x+" НЕ попадает в интервал от 25 до 100");}
    }
}


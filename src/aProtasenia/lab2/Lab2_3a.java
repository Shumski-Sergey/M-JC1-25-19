public class Lab2_3a {
    public static void main(String[] args) {
        int a = 3;
        int b = 45;
        int c = 12;
        if (a < b && a < c) {
            if (b < c)
                System.out.print(a + " " + b + " " + c);
            else System.out.print(a + " " + c + " " + b);
        }
        if (a > b && a < c) {
            System.out.print(b + " " + a + " " +c);
        }
        if (a > b && a > c) {
         if (b < c)
             System.out.print(b + " " + c + " " +a);
         else System.out.print(c + " " + b + " " +a);
        }
    }
}



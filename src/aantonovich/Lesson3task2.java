package aantonovich;

public class Lesson3task2 {
    public static void main(String[] args) {
        int a = 23;
        int b;
        for (b = 1; b <= a; b++ ) {
            if (a % b == 0 && b != 1 && a != b){
                System.out.println("Это число составное");
            break;}
           if (a == b )
                System.out.println("Это число простое");}
        }
    }
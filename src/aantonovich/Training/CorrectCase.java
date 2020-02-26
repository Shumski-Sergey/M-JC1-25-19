package aantonovich.Training;
// Вывести число, добавив к нему слово "рублей" в нужном падеже
import java.util.Scanner;

public class CorrectCase {
    public static void main(String[] args) {
        System.out.println("Введите число в рублях: ");
        Scanner scanner = new Scanner(System.in);
        Integer s = scanner.nextInt();
        int integer = s % 10;
        switch (integer){
            case 1:
                System.out.println(s + " рубль");
                break;
            case 2 :
                case 3:
            case 4:
                System.out.println(s + " рубля");
                break;
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(s + " рублей");
                break;
        }
    }
}

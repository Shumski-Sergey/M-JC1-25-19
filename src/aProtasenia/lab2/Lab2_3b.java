import java.util.Scanner; //Импорт метода Scanner из пакета java.util

public class Lab2_3b {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число");
        Scanner summator = new Scanner(System.in);
        int x = summator.nextInt();
        int y = 0;

        for (int z = 1; z <= x; z = z+1) {
            y = y + z;
        }
        System.out.print(y);
        }
    }


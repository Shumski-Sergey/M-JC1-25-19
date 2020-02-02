package src.pvetashkov.FirstControl;// заглючил .get(i), .set(I) в ArrayList, переделал в простом массиве. на лекции задам вопрос, почему?
import java.util.Random;
import java.util.ArrayList;
public class FirstControl_2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int temp;
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = rnd.nextInt(50);
            System.out.print(arr[i]+"_");
        }
        System.out.println();
        for (int i = 1; i < 19; i ++) {
            if (i % 2 == 0) {
                temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
            for (int i = 0; i < 20; i++) {
            System.out.print(arr[i] + "-");
            }
    }
}
package src.irusy;

/**
 * Created by user on 18.01.2020.
 */
public class PerevernMass {
    public static void main(String[] args) {
        int i;
        int n = 15;
        int arr[] = new int[n];

        for (i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 40);
            System.out.print(" " + arr[i]);
        }
        System.out.println("\n ");
        System.out.println("перевернутый массив: ");

        for (i = 0; i < n / 2; i++) {
            int z = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = z;

        }
        System.out.println("\n ");
        for (i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }

}

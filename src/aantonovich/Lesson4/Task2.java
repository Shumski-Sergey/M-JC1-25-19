package aantonovich.Lesson4; // найти сумму элементов массива между минимальным и максимальным значениями

public class Task2 {
    public static void main(String[] args) {
        int mass[] = {5, 6, 8, 24, 13, 45, 11, 28};
        int max = mass[0];
        int sum = 0;
        int min = mass[0];
        int indexmin = 0;
        int indexmax = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
                indexmax = i;
            }
            if (mass[i] < min) {
                min = mass[i];
                indexmin = i;

            }
            System.out.println("Минимальное значение " + min);
            System.out.println("Максимальное значение " + max);
            if (indexmax < indexmin) {
                for (int j = indexmax + 1; i < indexmin; i++)
                    sum += mass[i];
            } else if (indexmax > indexmin) {
                for (int j = indexmin + 1; i < indexmax; i++)
                    sum += mass[i];
            }
            System.out.println("Сумма элементов между минимумом и максимумом = " + sum);
        }
    }
}
package KKropa.Lab_4;

public class Lab_4_A2 {
    public static void main(String[] args) {
        int[] array = {2, 5, 6, 9, 7, 3, 6};
        int min = array[0];
        int max = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
                maxIndex = i;
            } else if (min >= array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("Min " + min);
        System.out.println("Max " + max);
        if (minIndex < maxIndex) {
            for (int i = minIndex; i < maxIndex; i++)
                sum += array[i];

        } else if (minIndex > maxIndex) {
            for (int i = maxIndex; i < minIndex; i++)
                sum += array[i];
        }
        System.out.println(sum);


    }
}

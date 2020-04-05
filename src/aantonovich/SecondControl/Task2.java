package aantonovich.SecondControl;

public class Task2 {
        static int number = 0;
        static int max = 0;
        static int count = 0;
        public static void main(String[] args) {

            int[] arr = {1,2,2,34,3,34,3,34,3,34,4,4,4,5,11,4,4,34,4,34,5,34,5,5,34,5,5};

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count > max) {
                    max = count;
                    number = arr[i];
                }
                count = 0;
            }

            System.out.println("The most common number is " + number);
            System.out.println("This number is repeats " + (max+1) + " times.");
        }
    }
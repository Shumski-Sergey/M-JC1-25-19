package aantonovich.Lesson4;// найти в массиве максимальную оценку и вывести ее номер

public class Task1 {
    public static void main(String[] args) {
        int[] marks = {5, 8, 3, 10, 6, 4, 10, 9};
        int max = marks[0];
        int index = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
                index = i+1;
            }
        }
            System.out.println("Максимальная оценка под номером: " + index);
    }
}
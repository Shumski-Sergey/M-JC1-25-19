import java.util.Scanner;

public class Lab4_1a_arrays {
    /*В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of student's  marks: ");
        int numb = in.nextInt(); //создаём размер массива в консоли (количество оценок)
        System.out.print("Enter student's marks (using space): ");
        int[] marks = new int[numb]; // заполняем массив элементами (оценками) через пробел
        for (int i = 0; i < marks.length; i++) {
            marks[i] = in.nextInt();
        }
        in.close();

        int maxMark = 0;
        int indexMax = 0;
        for (int i = 0; i < marks.length; i++) {
            maxMark = Math.max(maxMark, marks[i]); // определяется максимальная оценка
            if (marks[i] > marks[indexMax]) {
                indexMax = i; // отпределяется индекс максимальной оценки в массиве
            }
        }
        System.out.println("The highest mark of the student is mark with a serial number " + (indexMax+1) );
    }
}


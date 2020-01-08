package tmurashka.lab4.arrays;

//В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер

public class A1 {
    public static void main(String[] args) {
        int[] marks = {2,3,10,8,4,5,6,7,8,9};
        int maxIndex = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= marks[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println(maxIndex + 1);
    }
}

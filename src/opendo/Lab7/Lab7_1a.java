import java.util.ArrayList;

public class Lab7_1a {
    //Создать список оценок учеников с помощью ArrayList, заполнить
    //случайными оценками. Удалить неудовлетворительные оценки из списка.
    public static void main(String[] args) {
        int numbOfStud = 10;
        int negative = 4;
        ArrayList<Integer> mark = new ArrayList<>(numbOfStud);
        for (int i = 0; i < numbOfStud; i++) {
            int a = (int) (Math.random() * 10 + 1);
            mark.add(a);
        }
        System.out.println(mark);
        mark.removeIf(account -> account < negative);
        System.out.println(mark);
    }
}


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lab7_2a {
//Создать коллекцию, наполнить ее случайными числами. Удалить
//повторяющиеся числа.
public static void main(String[] args) {
    int numb = 30;
    ArrayList<Integer> rand = new ArrayList<>(numb);
    for (int i = 0; i < numb; i++) {
        int a = (int) (Math.random() * 10 + 1);
        rand.add(a);
    }
    System.out.println(rand);
    Set<Integer> newRand = new LinkedHashSet<>(rand);
    System.out.println(newRand);
}
}

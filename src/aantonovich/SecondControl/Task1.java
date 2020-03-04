package aantonovich.SecondControl;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        int MAX;
        int MIN;
int ELEMENT = 10;
int RANGE = 100; // диапозон чисел (0-100)
        ArrayList<Integer> collection = new ArrayList<>();
        for(int i = 0; i< ELEMENT; i++){
            collection.add(i, (int) (Math.random()*RANGE +1));
        }
        System.out.println(collection);
        MAX = collection.stream().max(Integer::compareTo).get();
        System.out.println("Максимальное число = " + MAX);
        MIN = collection.stream().min(Integer::compareTo).get();
        System.out.println("Минимальное число = "+ MIN);
        int sum = collection.stream().filter(a -> a != MAX ).filter(a -> a != MIN).reduce(0, Integer::sum);
        System.out.println("Сумма = " +  sum);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class FirstCont_2 {
    //Заменить каждый элемент списка с четным номером на соседний слева элемент.
    private static final int EVEN_NUMB_SEARCH = 2;
    private static final int UPPER_LIMIT = 1000;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов списка: ");
        int numbOfElem = in.nextInt();

        ArrayList<Integer> elem = new ArrayList<>(); //создание списка элементов

        fillingOutList(numbOfElem, elem);
        replacement(elem);
    }

    public static void fillingOutList (int numbOfElem, ArrayList<Integer> elem){
        for (int i = 0; i < numbOfElem; i++) { //заполнение списка рондомными числами
            int a = (int) (Math.random() * UPPER_LIMIT + 1);
            elem.add(a);
        }
        System.out.println("Исходный список элементов: " + elem);
    }

    public static void replacement (ArrayList<Integer> elem){

        for (int i = 0; i < elem.size(); i++) {
            if (i % EVEN_NUMB_SEARCH == 0 && i != 0) { //замена четного элемента на элемент, расположенный слева от него в списке
                elem.set(i, elem.get(i - 1));
            }
            if (i == 0) { //замена нулевого элемента на последний элемент списка
                elem.set(0, elem.get(elem.size() - 1));
            }
        }
        System.out.println("Список с замененными четными элементами: " + elem);
    }
}


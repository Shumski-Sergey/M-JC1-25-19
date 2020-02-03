package dSankovsky.Generics.A1;

import java.util.Arrays;
/**
 * create class with type T; create method that returns an element by index
 *
 * @author Dmitry Sankovsky
 */
public class Runner {
    public static void main(String[] args) {
        int NUMB_CONST = 5;

        A1<Integer> integerA1 = new A1<>();
        integerA1.setList(Arrays.asList(2, 4, 5, 6, 7, 23, 654, 23, 5));
        integerA1.GetListElement(NUMB_CONST);

        A1<String> stringA1 = new A1<>();
        stringA1.setList(Arrays.asList("I","don't","know","absolutely", "nothing", "really", "trust","me"));
        stringA1.GetListElement(NUMB_CONST);
    }
}

package dSankovsky.Generics.A2;

import java.util.Arrays;

/**
 * convert class A2 data to array and print first 5 elements
 *
 * @author Dmitry Sankovsky
 */

public class Runner {
    public static void main(String[] args) {
        A2<String> stringA2 = new A2<>();
        stringA2.setList(Arrays.asList("a","b","c","d","e","f","g"));
        stringA2.Convert(stringA2.getList());
        stringA2.PrintArray();

    }
}

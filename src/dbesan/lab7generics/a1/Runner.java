package dbesan.lab7generics.a1;

import static dbesan.lab7generics.a1.services.IandO.iando;

public class Runner {
    public static void main(String[] args) {
        String[] teststring = {"ttt", "aaa", "!"};
        iando("String", teststring, 2);

        Integer[] testnumbers = {1, 2, 3, 4, 5, 6, 7, 8};
        iando("Integer", testnumbers, 4);

        Double[] testdoubles = {1.2, 1.5, 6.7};
        iando("Double", testdoubles, 2);
    }
}

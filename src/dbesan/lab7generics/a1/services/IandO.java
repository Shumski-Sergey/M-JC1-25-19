package dbesan.lab7generics.a1.services;

public class IandO {
    private static int index;

    public static <E> void iando(String name, E[] arr, int index) {

        E[] array = arr;
        Ret<E> iando = new Ret<>();
        iando.setArr(array);

        System.out.println(name + "  " + iando.getArrIndex(index) + " ");

    }

}



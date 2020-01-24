package dbesan.lab7generics.a1.services;

public class Ret<E> {
    private E[] arr;

    public E getArrIndex(int i) {
        return arr[i];

    }

    public void setArr(E[] arr) {
        this.arr = arr;
    }

    public int getLength() {
        return arr.length;
    }


}

package dSankovsky.Generics.A2;

import java.util.LinkedList;
import java.util.List;

public class A2<T> {
    private List<T> list = new LinkedList<>();
    private T arr[];
    private int ARR_FIRST_5 = 5;

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void Convert(List<T> list) {
        setArr((T[]) list.toArray());
    }

    public void PrintArray() {
        if (getArr().length >= ARR_FIRST_5) {
            System.out.println("Your first 5 are: ");
            for (int i = 0; i < ARR_FIRST_5;i++) {
                System.out.println(getArr()[i]);
            }

        }

    }


}

package dSankovsky.Generics.A3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A3<T> {
    private T[] arr;
    private List<T> convertedList = new ArrayList<>();

    public List<T> getList() {
        return convertedList;
    }

    public void setList(List<T> list) {
        this.convertedList = list;
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public void Convert(T[] arr) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, getArr());
        setList(list);
    }
    public void PrintList(List<T> list){
        for (T x:list) {
            System.out.println(x);
        }
    }
}

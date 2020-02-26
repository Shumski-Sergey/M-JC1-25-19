package riliuchik.generics.taskA1;

import java.util.ArrayList;
import java.util.List;

public class Universal<T> {
    private List<T> list = new ArrayList<>();

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void getElementByIndex(int index) {
        System.out.println("Элемент с индексом " + index + " в списке " + getList() + ": " + getList().get(index));
    }
}
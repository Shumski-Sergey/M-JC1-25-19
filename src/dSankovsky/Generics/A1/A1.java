package dSankovsky.Generics.A1;

import java.util.ArrayList;
import java.util.List;

public class A1<T> {
    private List<T> list = new ArrayList<>();

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void GetListElement(int numb) {
        System.out.println("Your element: " + getList().get(numb));
    }
}

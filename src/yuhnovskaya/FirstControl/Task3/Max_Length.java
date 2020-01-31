package src.yuhnovskaya.FirstControl.Task3;

import java.util.List;

public class Max_Length {
    List<String> list;

    public Max_Length(List<String> list) {
        this.list = list;
    }
    /**The method int MaxLength(List</String>list) calculates lengths of strings, that are elements of list,
     defines the longest of them and returns its value.
     */
    public int MaxLength(List<String> list) {
        int max = 0;
        for (int i = max+1; i <list.size(); i++) {

            if ((list.get(i)).length()>list.get(max).length()) {
                max = i;
            }
        }
        return (list.get(max).length());
    }
}


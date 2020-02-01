package src.irusy.FirstControl.Task2;

import java.util.ArrayList;

public class CustomArrayList<T> extends ArrayList<T> {
    public void shift(){
        for(int i = 1; i < this.size(); i++)
            if (i % 2 == 0)
                this.set(i - 1, this.get(i));
    }
}

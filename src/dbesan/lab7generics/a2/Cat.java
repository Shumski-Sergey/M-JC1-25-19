package dbesan.lab7generics.a2;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.*;

public class Cat<T> {
    public static ArrayList catList() {
   ArrayList catlst = new ArrayList();
   for(int i = 0; i<25; i++){
       catlst.add(i, floor(20+ random()*20));
   }
        Collections.sort(catList());
   return catlst;
}
}
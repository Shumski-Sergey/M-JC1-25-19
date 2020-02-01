package tabukara.question2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> ms = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            System.out.print( "enter the element: ");
            ms.add(sc.nextInt());
        }
        int ind = 0;
        Integer af = ms.get(ind);
        for (int i = 1; i < ms.size();i++){
            if (ms.get(i)% 2 == 0){
               af = ms.get(i-1);


            }


        }
    }
}
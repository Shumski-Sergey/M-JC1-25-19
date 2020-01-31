package src.skarpen.first_control.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ServiceArray {
    public void ArrayFillings() {

        List<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");

        /*
         *** Determine the size of the array by water data or by default;
         ***   The default array is 15 (DEFAULTARRAYSIZE);
         */
        if (!scanner.hasNextInt()) {
            Variables.MASSIVEINPUTSIZE = Variables.DEFAULTARRAYSIZE;
            System.out.println("The default array is 15" + "\n");
        } else {
            Variables.MASSIVEINPUTSIZE = scanner.nextInt();
        }
        /*
         *** Fill the array with numbers in order;
         */
        for (int i = Variables.ZEROARRAYLENGTH; i < Variables.MASSIVEINPUTSIZE; i++) {
            arrayList.add((i));
        }
        System.out.println("This is an array that will be mutated: " + arrayList.toString());
        for (int i = Variables.ELEMENTMOVEMENTVALUE; i < arrayList.size(); i++) {
            if (arrayList.indexOf(i) % 2 == Variables.ZEROARRAYLENGTH) {
                arrayList.set(i, i - Variables.ELEMENTMOVEMENTVALUE);
            }
        }
        System.out.println("\n" + "Resulting array: " + arrayList.toString());
        System.out.println("The end");
        scanner.close();
    }
}


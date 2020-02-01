package KKropa.First_control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

//2. Заменить каждый элемент списка с четным номером на соседний слева элемент.
public class Task_2 {
    public static void main(String[] args) throws IOException {

        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        System.out.println("Enter numbers: ");
        ArrayList<String> numbers = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            numbers.add(s); //Enter lines from keyboard
        }
        System.out.println("Your line is: "+ numbers);

        for (int j = 1; j < numbers.size(); j++) {
            if (j%2==0){
                numbers.set(j, numbers.get(j-1)); //Change the elements
            }
        }
        System.out.println("Changed line: " + numbers);

    }

}


     /**   Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line (if you finish enter 'q' and click 'Enter'): ");
        ArrayList<Integer> numbers = new ArrayList<>(10);
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            numbers.add(i);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        for (int j = 1; j<numbers.size(); j++){
            if (j%2==0){
                numbers.set(j,j-1);
            }
        } System.out.println(numbers);





*/



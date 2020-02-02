package KKropa.First_control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

import static KKropa.First_control.Const.*;

//2. Заменить каждый элемент списка с четным номером на соседний слева элемент.
public class Task_2 {

    public static void main(String[] args) throws IOException {

        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        System.out.println("Enter numbers: ");

        ArrayList<String> numbers = new ArrayList<String>();

        for (int i = 0; i < LINE_LENGTH; i++) {
            String s = reader.readLine();
            numbers.add(s); //Enter lines from keyboard
        }
        System.out.println("Your line is: " + numbers);

        for (int j = COUNTING_ELEMENTS; j < numbers.size(); j++) {
            if (j % PRIME_SEARCH == 0) {
                numbers.set(j, numbers.get(j - ELEMENT_DECREASE)); //Change the elements
            }
        }
        System.out.println("Changed line: " + numbers);

    }

}
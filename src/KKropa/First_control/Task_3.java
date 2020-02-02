package KKropa.First_control;
//3. Cоздадим список строк, считаем с клавиатуры 5 штук и добавим их в список.
// Затем с помощью цикла найдем из списка самую длинную строку (или несколько, если она такая не одна).
// Cамые длинные строки будут выведены на экран.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

import static KKropa.First_control.Const.LINE_LENGTH;

public class Task_3 {
    public static void main(String[] args) throws IOException {

        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        System.out.println("Enter 5 lines: "); //Enter some line from the keyboard
        ArrayList<String> lines = new ArrayList<>();
        for (int i = 0; i < LINE_LENGTH; i++) {
            String s = reader.readLine();
            lines.add(s); //Add strings in array
        }

        int maxlength = lines.get(0).length(); //Add new variable for search longest line
        for (String s: lines) {
            if (s.length() > maxlength) {
                maxlength = s.length(); //assign a new value to the variable
            }
        }
        for (String s: lines){
            if (s.length()==maxlength){//assign an element the value of a variable
                System.out.println("The longest line is: " + s);
            }
        }


    }
}

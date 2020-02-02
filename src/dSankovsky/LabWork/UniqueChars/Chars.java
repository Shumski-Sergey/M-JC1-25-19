package dSankovsky.LabWork.UniqueChars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * find in line amount of every letter/number/letter in lower case/letter in higher case
 *
 * @author Dmitry Sankovsky
 */
public class Chars extends UniqueChars {
    public static void main(String[] args) throws IOException {

        UniqueChars uChars = new UniqueChars();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Text:");
        uChars.setText(reader.readLine());

        System.out.println("Choose mode (0 - only letters, 1 - only numbers, 2 - A-Z, 3 - a-z)");
        uChars.setMode(Integer.parseInt(reader.readLine()));

        uChars.calculate();
        uChars.toString();
        System.out.println(uChars.toString());
    }
}

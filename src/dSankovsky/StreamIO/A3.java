package dSankovsky.StreamIO;

import java.io.*;
import java.util.Scanner;
//enter lines until line with #ESC and write them in file
public class A3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src\\dSankovsky\\StreamIO\\enteredLines.txt");
        Scanner scanner = new Scanner(System.in);
        String oneLine;
        do {
            oneLine = scanner.nextLine();
            fw.write(oneLine + "\n");
        } while (!oneLine.matches(".*(#ESC).*"));
        fw.close();
    }


}

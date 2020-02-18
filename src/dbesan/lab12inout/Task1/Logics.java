package dbesan.lab12inout.Task1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Logics {
    static void fileread() throws IOException {
        Map<Integer, Integer> mapForCounting = new HashMap<Integer, Integer>();
        readerFileAndContinue(mapForCounting);
        int maxcount = 0;
        int maxchar = 0;
        for (Map.Entry<Integer, Integer> entry : mapForCounting.entrySet()) {
            if (entry.getValue() > maxcount) {
                maxcount = entry.getValue();
                maxchar = entry.getKey();
            }
        }
        System.out.println("Чаще всего встречается: " + (char) maxchar + " раз: " + maxcount);
    }

    private static void readerFileAndContinue(Map<Integer, Integer> mapForCounting) {
        try {
            BufferedInputStream myfile = new BufferedInputStream(new FileInputStream(getLocation()));
            fileToMap(mapForCounting, myfile);
            myfile.close();
        } catch (FileNotFoundException e) {

            System.out.println(e.getMessage());
            readerFileAndContinue(mapForCounting);
        } catch (IOException e) {

            System.out.println(e.getMessage());
            readerFileAndContinue(mapForCounting);
        }
    }

    private static void fileToMap(Map<Integer, Integer> mapForCounting, BufferedInputStream myfile) throws IOException {
        int i;
        while ((i = myfile.read()) != -1) {
            if (mapForCounting.containsKey(i)) {
                mapForCounting.put(i, mapForCounting.get(i) + 1);
            } else {
                mapForCounting.put(i, 1);
            }
        }
    }

    private static String getLocation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расположение файла");
        return scanner.nextLine();
    }
}

package dSankovsky.StreamIO;

import java.io.*;
import java.util.*;
//enter file name, find and print bite(s) with max repetition
public class A1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileStream = new FileInputStream(reader.readLine());
        Map<Integer, Integer> countList = new HashMap<>();
        int i;
        Set<Integer> list = new HashSet<>();
        while ((i = fileStream.read()) != -1) {
            if (countList.containsKey(i)) {
                countList.replace(i, countList.get(i) + 1);
            } else {
                countList.put(i, 1);
            }
            list.add(i);
        }
        fileStream.close();

        for (int x : list) {
            if (countList.get(x).equals(countList.values().stream().max(Integer::compareTo).get()))
                System.out.println("Byte:" + x + " Count:" + countList.get(x));
        }
    }
}

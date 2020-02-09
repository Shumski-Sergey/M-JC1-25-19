package riliuchik.lab7_collections.fileCollections.Lab7_1_taskA2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class RandomCreator {
    public static List<Integer> randomList(Integer range) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество случайных чисел: ");
        int amount = Integer.parseInt(in.readLine());
        List<Integer> tempList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < amount; i++)
            tempList.add(random.nextInt(range) + 1); //т.е. случайные числа будут подбираться не с 0, а с 1
        return tempList;
    }
}
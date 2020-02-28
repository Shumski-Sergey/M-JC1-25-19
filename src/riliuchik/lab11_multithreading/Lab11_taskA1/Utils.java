package riliuchik.lab11_multithreading.Lab11_taskA1;

import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Random;

public class Utils {
    public static int getRandomAmount(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static int getRandomBook(ArrayList<Library> books) {
        return new Random().nextInt(books.size());
    }
}
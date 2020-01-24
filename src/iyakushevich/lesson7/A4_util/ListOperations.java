package iyakushevich.lesson7.A4_util;

import java.util.List;

public interface ListOperations {

    static List<Integer> addToLost(List<Integer> someList) {
        for (int i = 0; i < 1000000; i++) {
            someList.add((int) (Math.random() * 1000000));
        }
        return someList;
    }

    static void getFromLost(List<Integer> someList) {
        for (int i = 0; i < 10000; i++) {
            someList.get((int) (Math.random() * 10000));
        }
    }

    static void listOperations(List<Integer> anyList) {
        addToLost(anyList);
        //System.out.println(anyList);
        long startTime = System.currentTimeMillis();
        getFromLost(anyList);
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("затрачено " + timeSpent + " миллисекунд");
    }
}

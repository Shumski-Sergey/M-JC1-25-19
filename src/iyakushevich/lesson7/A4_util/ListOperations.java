package iyakushevich.lesson7.A4_util;

import java.util.List;

public class ListOperations {

    private static int ARRAY_LENGTH = 1000000;
    private static int GET_NUMBER = 10000;

    private static List<Integer> addToLost(List<Integer> someList) {
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            someList.add((int) (Math.random() * ARRAY_LENGTH));
        }
        return someList;
    }

    private static void getFromLost(List<Integer> someList) {
        for (int i = 0; i < GET_NUMBER; i++) {
            someList.get((int) (Math.random() * GET_NUMBER));
        }
    }

    protected static void listOperations(List<Integer> anyList) {
        addToLost(anyList);
        //System.out.println(anyList);
        long startTime = System.currentTimeMillis();
        getFromLost(anyList);
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("затрачено " + timeSpent + " миллисекунд");
    }
}

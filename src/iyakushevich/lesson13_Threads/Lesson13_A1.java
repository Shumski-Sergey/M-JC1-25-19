package iyakushevich.lesson13_Threads;

import iyakushevich.lesson13_Threads.A1_util.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. Написать клиент для работы библиотеки. В библиотеке доступны к чтению несколько книг.
 * Некоторые из них можно выдавать на руки, некоторые только в читальный зал.
 * Посетители могут брать одновременно по несколько книг на руки и в читальный зал.
 */

public class Lesson13_A1 {
    public static void main(String[] args) {

        User anyUser = new User();

        Thread user1 = new Thread(anyUser);
        user1.setName("User 1");
        Thread user2 = new Thread(anyUser);
        user2.setName("User 2");
        Thread user3 = new Thread(anyUser);
        user3.setName("User 3");
        Thread user4 = new Thread(anyUser);
        user4.setName("User 4");
        Thread user5 = new Thread(anyUser);
        user5.setName("User 5");

        List<Thread> userList = new ArrayList<>(Arrays.asList(user1, user2, user3, user4, user5));

        for (Thread user : userList
        ) {
            try {
                user.start();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

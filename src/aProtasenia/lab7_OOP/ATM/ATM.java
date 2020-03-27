package aProtasenia.lab7_OOP.ATM;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ATM {
    private int balance;

    ATM(int hunredNote, int fiftyNote, int twentyNote) {
        balance += hunredNote * 100 + fiftyNote * 50 + twentyNote * 20;
    }

    void withdraw(int amount) {
        System.out.format("Вы запросили сумму в размере %d рублей.\n", amount);
        System.out.println("Ваш баланс: " + this.balance);
        if (amount % 10 != 0) {
            System.out.println("Неверная сумма, укажите сумму не меньше 20 рублей и кратная 20 или 50!");
            return;
        } else if (amount > this.balance) {
            System.out.format("Запрошенная сумма превышает ваш баланс %d рублей.\n", this.balance);
            return;
        } else {
            ArrayList<Integer> nominal = new ArrayList<>(Arrays.asList(20, 100, 50));
            int[] count = new int[nominal.size()]; //купюр выдать
            int index = nominal.size() - 1;

            if (amount % 100 == 10 || amount % 100 == 30) {
                amount -= nominal.get(2);
                count[2] += 1;
            }
            if (amount % 20 == 0 && amount < 100) {
                nominal = new ArrayList<>(Collections.singletonList(20));
                index = nominal.size() - 1;
            }
            if (amount > 100 && amount % 20 == 0) {
                nominal = new ArrayList<>(Arrays.asList(20, 100));
                index = nominal.size() - 1;
            }

            while (index != -1) {
                count[index] += amount / nominal.get(index);
                amount %= nominal.get(index);
                index--;
            }

            nominal = new ArrayList<>(Arrays.asList(20, 50, 100));
            int temp = count[1];
            count[1] = count[2];
            count[2] = temp;
            for (int i = 0; i < nominal.size(); i++) {
                System.out.printf("Номинал в %d руб. = %d шт.\n", nominal.get(i), count[i]);
                balance -= nominal.get(i) * count[i];
            }
        }
        System.out.println("Ваш баланс составляет: " + this.balance);
    }
    }


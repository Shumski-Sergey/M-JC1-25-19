package iyakushevich.lesson6;

import iyakushevich.lesson6.A2_util.BankCard;
import iyakushevich.lesson6.A2_util.Belcard;

/**
 * 4.Создать иерархию классов, описывающих банковские карточки.
 * Иерархия должна иметь хотя бы три уровня.
 */

public class Lesson6_A2 {
    public static void main(String[] args) {
        Belcard belcard1 = new Belcard("MasterCard", "1111222233334444", 9, 21,432);
        belcard1.printCard();

        System.out.println();

        BankCard bankCard1 = new BankCard("VISA", "9999888877776666", 12, 20,578);
        bankCard1.printCard();
    }
}

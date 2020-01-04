package tmurashka.lab4.tasksArrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        System.out.println("Введите количество игроков");
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int n = 0;
        do {
            if (n > 0) {
                System.out.println("Количество игроков не должно превышать 10");
            }
            n = scanner.nextInt();
        } while (n > 10);
        String[][] deck = { {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"},
                            {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"},
                            {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"},
                            {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"}};
        char[] suits = {'\u2666', '\u2665', '\u2663', '\u2660'};
        String[][] players = new String[n][5];
        int cardIndex = 0;
        int quantity = 52;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n && cardIndex < quantity; j++) {
                cardIndex = rand.nextInt(quantity);
                while (deck[cardIndex / 13][cardIndex % 13] == null)
                {
                    ++cardIndex;
                    cardIndex %= 52;
                }
                players[j][i] = deck[cardIndex / 13][cardIndex % 13] + suits[cardIndex / 13];
                deck[cardIndex / 13][cardIndex % 13] = null;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(players[i][j] + " ");
            }
            System.out.println();
        }
    }
}
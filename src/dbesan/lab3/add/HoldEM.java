package dbesan.lab3.add;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Playing holdem. 3 cards to player
 **/
public class HoldEM {
    public static void main(String[] args) throws IOException {
        System.out.println("Раздача карт");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество игроков");
        int playerCount = Integer.parseInt(reader.readLine());
        class Player {
        }
        String card1;
        String card2;
        String card3;
        String[] deck = {"DA", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "DJ", "DQ", "DK", "HA", "H2",
                "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "HJ", "HQ", "HK", "SA", "S2", "S3", "S4", "S5",
                "S6", "S7", "S8", "S9", "S10", "SJ", "SQ", "SK", "CA", "C2", "C3", "C4", "C5", "C6", "C7", "C8",
                "C9", "C10", "CJ", "CQ", "CK"};
        int playersCount = 1;

        if (playerCount > 10) {
            System.out.println("Максимум игроков - 10");

        } else if (playerCount < 0) {
            System.out.println("Минимум игроков - 1");
        } else {
            for (int i = 0; i < playerCount; i++) {
                Player player = new Player();
                card1 = deck[(int) (Math.random() * deck.length)];
                deck = delete_used_card(deck, card1);
                card2 = deck[(int) (Math.random() * deck.length)];
                deck = delete_used_card(deck, card2);
                card3 = deck[(int) (Math.random() * deck.length)];
                deck = delete_used_card(deck, card3);
                System.out.print("Игрок" + playersCount + " " + card1 + " " + card2 + " " + card3);
                System.out.println();
                playersCount++;


            }


        }


    }


    public static String[] delete_used_card(String[] deck, String card) {
        List<String> list = new ArrayList<>(Arrays.asList(deck));
        list.remove(card);
        deck = list.toArray(new String[list.size()]);
        return deck;
    }
}

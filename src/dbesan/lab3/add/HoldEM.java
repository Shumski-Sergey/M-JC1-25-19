package dbesan.lab3.add;

import java.io.*;
import java.lang.*;
import java.util.*;
public class HoldEM {
    public static void main(String[] args) throws IOException {
        System.out.println("Раздача карт");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество игроков");
        int playerCount = Integer.parseInt(reader.readLine());
        class Player {}
        String kard1;
        String kard2;
        String kard3;
        String[] coloda = {"DA", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "DJ", "DQ", "DK", "HA", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "HJ", "HQ",
                "HK", "SA", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "SJ", "SQ", "SK", "CA", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "CJ", "CQ", "CK"};
int playersCount = 1;

        if (playerCount > 10 || playerCount < 0) {
            System.out.println("Максимум игроков - 10");

        }

        else {
            for (int i = 0; i < playerCount; i++) {
                Player player = new Player();

                kard1 = coloda[(int)Math.floor(Math.random()*coloda.length)];
                kard2 = coloda[(int)Math.floor(Math.random()*coloda.length)];
                kard3 = coloda[(int)Math.floor(Math.random()*coloda.length)];

                System.out.print("Игрок"+ playersCount+" "+kard1+" "+kard2+" "+kard3);
                System.out.println();
                playersCount++;
                List <String> list = new ArrayList <> (Arrays.asList(coloda));
                list.remove(kard1);
                list.remove(kard2);
                list.remove(kard3);
                coloda = list.toArray(new String[list.size()]);

                            }


        }

    }
}


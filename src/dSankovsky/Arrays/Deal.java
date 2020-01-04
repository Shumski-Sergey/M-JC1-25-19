package dSankovsky.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Deal {

    public static void main(String[] args) throws IOException {
        int newPlayers;
        int row = 0;
        int col = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Введите количество игроков");   //может быть максимум 10 игроков, потому что карт всего 52
            String players = reader.readLine();
            newPlayers = Integer.parseInt(players);
        } while (newPlayers > 10);
        String playerCards[][] = new String[newPlayers][5];    //будет таблица вывода в n строк и 5 столбцов (каждый игрок - своя строка)
        String deck[][] = {//это будет колода. 13 карт и 4 масти
                {"2\u2666", "3\u2666", "4\u2666", "5\u2666", "6\u2666", "7\u2666", "8\u2666", "9\u2666", "10\u2666", "J\u2666", "Q\u2666", "K\u2666", "A\u2666"}, // 0 - diamond,
                {"2\u2665", "3\u2665", "4\u2665", "5\u2665", "6\u2665", "7\u2665", "8\u2665", "9\u2665", "10\u2665", "J\u2665", "Q\u2665", "K\u2665", "A\u2665"}, // 1- hearts,
                {"2\u2663", "3\u2663", "4\u2663", "5\u2663", "6\u2663", "7\u2663", "8\u2663", "9\u2663", "10\u2663", "J\u2663", "Q\u2663", "K\u2663", "A\u2663"}, // 2- clubs,
                {"2\u2660", "3\u2660", "4\u2660", "5\u2660", "6\u2660", "7\u2660", "8\u2660", "9\u2660", "10\u2660", "J\u2660", "Q\u2660", "K\u2660", "A\u2660"}}; // 3 - spades
        for (int j = 0; j < playerCards[0].length; j++) {  // начинаем заполнять массив игроков по столбцам (каждый столбец - +1 карта игроку)
            for (int i = 0; i < playerCards.length; i++) {
                while (deck[row][col] == null) {     //ниже будет строка с очищением элемента массива колоды. тут идет проверка на пустой элемент. таким образом карты не будут повторяться у игроков
                    row = (int) (Math.random() * 4);   //рандомная строка
                    col = (int) (Math.random() * 13);    // рандомный столбец
                }
                playerCards[i][j] = deck[row][col];    //"выдаем" игроку карту
                deck[row][col] = null;    //и ее теперь якобы нет в колоде
            }
        }

        for (int i = 0; i < playerCards.length; i++) {    //выводим по строкам карты (каждого игрока по очереди)
            for (int j = 0; j < playerCards[0].length; j++) {
                System.out.print(playerCards[i][j] + "|");
            }
            System.out.println();
            System.out.println();
        }
    }
}

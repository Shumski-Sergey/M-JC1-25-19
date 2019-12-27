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
                {"2♢", "3♢", "4♢", "5♢", "6♢", "7♢", "8♢", "9♢", "10♢", "J♢", "Q♢", "K♢", "A♢"}, // 0 - diamond,
                {"2♡", "3♡", "4♡", "5♡", "6♡", "7♡", "8♡", "9♡", "10♡", "J♡", "Q♡", "K♡", "A♡"}, // 1- hearts,
                {"2♧", "3♧", "4♧", "5♧", "6♧", "7♧", "8♧", "9♧", "10♧", "J♧", "Q♧", "K♧", "A♧"}, // 2- clubs,
                {"2♤", "3♤", "4♤", "5♤", "6♤", "7♤", "8♤", "9♤", "10♤", "J♤", "Q♤", "K♤", "A♤"}}; // 3 - spades
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

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
                {"2 of D", "3 of D", "4 of D", "5 of D", "6 of D", "7 of D", "8 of D", "9 of D", "10 of D", "Jack of D", "Queen of D", "King of D", "Ace of D"},   // 0 - diamond,
                {"2 of H", "3 of H", "4 of H", "5 of H", "6 of H", "7 of H", "8 of H", "9 of H", "10 of H", "Jack of H", "Queen of H", "King of H", "Ace of H"},   // 1- hearts,
                {"2 of C", "3 of C", "4 of C", "5 of C", "6 of C", "7 of C", "8 of C", "9 of C", "10 of C", "Jack of C", "Queen of C", "King of C", "Ace of C"},   // 2- clubs,
                {"2 of S", "3 of S", "4 of S", "5 of S", "6 of S", "7 of S", "8 of S", "9 of S", "10 of S", "Jack of S", "Queen of S", "King of S", "Ace of S"},}; // 3 - spades
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

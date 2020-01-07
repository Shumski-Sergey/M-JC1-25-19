package dSankovsky.StringsWithoutReg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//first line without repeat
public class A7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of lines");
        String numb = reader.readLine();
        int numbOfLines = Integer.parseInt(numb);
        String[] wordArr = new String[numbOfLines];
        char[] letterArr;
        for (int i = 0; i < wordArr.length; i++) {
            System.out.println("Enter the line");
            wordArr[i] = reader.readLine();
        }

        int count, wordNumb;
        for (int i = 0; i < wordArr.length; i++) {
            count = 0;
            wordNumb=i;
            letterArr = new char[wordArr[i].length()];
            for (int j = 0; j < letterArr.length; j++) {//заполнение второго массива буквами в отдельные ячейки
                letterArr[j] = wordArr[i].charAt(j);
            }

            for (int j = 0; j < letterArr.length-1; j++) {  //выбираем букву, с которой будем сравнивать остальные
                if (count != 0) {
                    break;
                }
                for (int k = j + 1; k < letterArr.length; k++) { //выбираем букву, с которой будем сравнивать выбранную выше + отсекаются буквы слева, которые уже проверили
                    if (letterArr[j] == letterArr[k]) { //суть в том, что циклы увеличивают счетчик только в том случае, если нашлось совпадение
                        count++;
                        break;    //то есть слово с повторениями будет иметь count > 0
                    }
                }
            }
            if (count == 0) {
                System.out.println("The Word is: " + wordArr[wordNumb]); //после первого совпадения нет смысла проверять дальше
                break;
            }
        }
    }
}

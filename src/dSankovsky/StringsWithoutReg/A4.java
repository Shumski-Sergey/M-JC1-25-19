package dSankovsky.StringsWithoutReg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//find word with minimum unique symbols
public class A4 {
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
        int count = 0, memoryCount=0, wordNumb = 0;
        char letter;

        for (int i = 0; i < wordArr.length; i++) {
            letterArr = new char[wordArr[i].length()];
            for (int j = 0; j < letterArr.length; j++) {//заполнение второго массива буквами в отдельные ячейки
                letterArr[j] = wordArr[i].charAt(j);
            }
            for (int j = 0; j < letterArr.length; j++) {  //выбираем букву, с которой будем сравнивать остальные
                for (int k = j+1; k < letterArr.length; k++) { //выбираем букву, с которой будем сравнивать выбранную выше + отсекаются буквы слева, которые уже проверили
                    if (letterArr[j] == letterArr[k]) {
                        count++;
                        break;
                    }
                }
            }
            if(memoryCount<count){
                wordNumb=i;
                memoryCount=count;
            }
            count=0;
        }
        System.out.println("The Word is: " + wordArr[wordNumb]);
    }
}

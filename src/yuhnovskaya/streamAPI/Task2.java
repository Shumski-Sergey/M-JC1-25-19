package src.yuhnovskaya.streamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Optional;


//2. Считать с консоли данные(массив слов). Записать в другую переменную String строку(через запятую слова),
// длина которых строго больше 6. В конце запятой не должно быть.
public class Task2 {
    public  static void main(String[] avgs) throws IOException {
        ArrayList<String>list=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String str=reader.readLine();
            if (str.isEmpty())break;
            list.add(str);
        }
        Optional<String> result = list.stream().filter(x->x.toString().length()>6).reduce((x1, x2)->x1+","+x2);
        System.out.print(result);
    }
}

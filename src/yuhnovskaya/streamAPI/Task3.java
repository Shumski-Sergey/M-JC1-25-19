package src.yuhnovskaya.streamAPI;
//Считать с консоли данные. Вывести во вторую переменную все числа, которые есть в первом файле.
// Числа выводить через пробел. Пример - 12 text var2 14 8v 1 Результат: 12 14 1

import com.sun.jdi.IntegerValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;


public class Task3 {
    public static void main(String[] avgs) throws IOException {
        System.out.println("Enter '12 text var2 14 8v 1':");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        List<String> list=new ArrayList<>();
        while(true){
            String str=reader.readLine();
            if (str.isEmpty())break;
            list.add(str);
        }
        Pattern pattern=Pattern.compile("^[0-9]+$");
     Optional<String> result=list.stream().filter(pattern.asPredicate()).reduce((x1, x2)->x1+" "+x2);
     System.out.print("Result: "+result);
    }
}

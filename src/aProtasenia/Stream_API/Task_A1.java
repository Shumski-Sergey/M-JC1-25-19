package src.aProtasenia.Stream_API;
/*
Сформируй часть запроса WHERE используя StringBuilder(не обязательно).
Если значение null, то параметр не должен попадать в запрос. Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат: "name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_A1 {
    public static void main(String[] args) {
        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("name", "Akira");
        stringHashMap.put("country", "Japan");
        stringHashMap.put("city", "Osaka");
        stringHashMap.put("age", null);

        System.out.println(Where(stringHashMap));
    }
    public static String Where(HashMap<String, String> list) {
        return list.entrySet().stream().filter(x -> x.getValue() != null).flatMap(x -> Stream.of(x.getKey() + " = " + "'" + x.getValue() + "'")).collect(Collectors.joining(" / "));
    }
    }




package iyakushevich.lesson10StreamAPI;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1*. Сформируй часть запроса WHERE используя StringBuilder(не обязательно).
 * Если значение null, то параметр не должен попадать в запрос.
 * Пример: {"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
 * Результат: "name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
 */

public class Lesson10_A1 {
    public static void main(String[] args) {
        HashMap<String, String> stringMap = new HashMap<>() {{
            put("name", "Ivanov");
            put("country", "Ukraine");
            put("city", "Kiev");
            put("age", null);
        }};
        System.out.println(where(stringMap));
    }

    public static String where(HashMap<String, String> whereMap) {
        return whereMap.entrySet().stream()
                .filter(e -> e.getValue() != null)
                .flatMap(e -> Stream.of(e.getKey() + " = \'" + e.getValue() + "\'"))
                .collect(Collectors.joining(" and "));
    }
}

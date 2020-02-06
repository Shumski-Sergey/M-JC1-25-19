package riliuchik.lab8_StreamAPI;

import java.util.LinkedHashMap;
import java.util.stream.Stream;
import java.util.stream.Collectors;

/**
 * Сформируй часть запроса WHERE используя StringBuilder(не обязательно).
 * Если значение null, то параметр не должен попадать в запрос.
 * Пример: {"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}.
 * Результат: "name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'".
 */

public class Lab8_taskA1 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> person = new LinkedHashMap<>();
        person.put("name", "Ivanov");
        person.put("country", "Ukraine");
        person.put("city", "Kiev");
        person.put("age", null);
        System.out.print(where(person));
    }

    private static String where(LinkedHashMap<String, String> map) {
        return map.entrySet().stream()
                .filter(x -> x.getValue() != null)
                .flatMap(x -> Stream.of(x.getKey() + " = '" + x.getValue() + "'"))
                .collect(Collectors.joining(" and "));
    }
}
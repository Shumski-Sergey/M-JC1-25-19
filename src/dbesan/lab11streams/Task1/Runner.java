package dbesan.lab11streams.Task1;

import static dbesan.lab11streams.Task1.Logics.wherereqest;

/* Сформируй часть запроса WHERE используя StringBuilder(не обязательно).
Если значение null, то параметр не должен попадать в запрос.
Пример: {"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат: "name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"*/
public class Runner {
    public static void main(String[] args) {
        wherereqest();
    }
}

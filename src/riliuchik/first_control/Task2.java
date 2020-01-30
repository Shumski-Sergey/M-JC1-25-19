package riliuchik.first_control;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Заменить каждый элемент списка с четным номером на соседний слева элемент.
 */

public class Task2 {
    private static final int PARITYCHECK = 2;

    private BufferedReader reader;

    public Task2(BufferedReader reader) {
        this.reader = reader;
    }

    public void Replacement() throws IOException {
        System.out.print("Введите количество элементов списка: ");
        int size;
        while (true) {
            try {
                size = Integer.parseInt(reader.readLine());
                if (size<1) throw new ExceptionWithMessage();
                break;
            } catch (NumberFormatException ex) {
                System.out.print("Неправильный формат ввода, введите целое число: ");
            }
            catch(ExceptionWithMessage e) {
                System.out.print("Количество элементов должно быть больше нуля, попробуйте ещё раз: ");
            }
        }

        //Создаем список элементов
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент (целое число) c индексом " + i + " в списке: ");
            while (true) {
                try {
                    int number = Integer.parseInt(reader.readLine());
                    list.add(Integer.parseInt(String.valueOf(number)));
                    break;
                } catch (NumberFormatException ex) {
                    System.out.print("Неправильный формат ввода, введите целое число: ");
                }
            }
        }
        System.out.println("Первоначальный список: " + list);

        //Замена каждого элемента списка с четным номером на соседний слева элемент
        for (int i = 1; i < size; i++) if (i % PARITYCHECK == 0) list.set(i, list.get(i - 1));
        System.out.print("Список после замены каждого элемента списка с четным номером на соседний слева элемент: " + list);
    }
}
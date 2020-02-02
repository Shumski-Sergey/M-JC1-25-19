package dmitrypolyakov.FirstControl;

/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 01.02.2020
 *
 * Заменить каждый элемент списка с четным номером на соседний слева элемент
 */

import java.util.Arrays;

public class Loops2 {
    public static void main(String[] args) {
        int[] mas = new int[10]; //Создаем массив из 10 элементов
        for (int i = 0; i < mas.length; i++) { //Генерируем элементы массива
            mas[i] = (int) (Math.random() * 10) + 1; //Число от 1 до 10 в случайном порядке
        }
        System.out.println(Arrays.toString(mas)); //Выводим заданный массив на экран
        int[] masCopy = new int[10];
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) { //Находим в массиве четные элементы
                masCopy[i] = mas[i + 1]; //Вставляем найденные элементы в новый массив
                if (i % 2 == 1); //Находим в массиве нечетные элементы
                masCopy[i + 1] = mas[i]; //Вставляем найденные элементы в новый массив
            }
        }
        System.out.println(Arrays.toString(masCopy)); //Выводим на экран результат
    }
}

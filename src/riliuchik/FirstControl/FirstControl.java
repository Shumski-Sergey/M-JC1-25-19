package riliuchik.FirstControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstControl {
    public static void main(String[] args) throws IOException {
        boolean flag = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (flag) {
            System.out.println();
            System.out.println("\nВыберите номер задачи:"
                    + "\n\t1. \"В данной строке найти количество цифр. Вывести количество и сумму цифр.\""
                    + "\n\t2. \"Заменить каждый элемент списка с четным номером на соседний слева элемент.\""
                    + "\n\t3. \"Cоздадим список строк, считаем с клавиатуры 5 штук и добавим их в список. " +
                    "Затем с помощью цикла найдем из списка самую длинную строку (или несколько, если она такая не одна). " +
                    "Cамые длинные строки будут выведены на экран.\""
                    + "\nДля выхода нажмите \"0\".");
            System.out.print("Номер задачи или \"0\" для выхода: ");
            int number;
            while (true) {
                try {
                    number = Integer.parseInt(reader.readLine());
                    if (number<0||number>3) throw new ExceptionWithMessage();
                    break;
                } catch (NumberFormatException ex) {
                    System.out.print("Неправильный формат ввода. Введите номер задачи или \"0\" для выхода: ");
                }
                catch(ExceptionWithMessage e) {
                    System.out.print("Необходимо ввести номер задачи (1, 2 или 3) или \"0\" для выхода: ");
                }
            }
            switch (number) {
                case 1:
                    Task1 task1 = new Task1(reader);
                    task1.QuantityAndSum();
                    break;
                case 2:
                    Task2 task2 = new Task2(reader);
                    task2.Replacement();
                    break;
                case 3:
                    Task3 task3 = new Task3(reader);
                    task3.FindMaxStrings();
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }
        System.out.println("Программа завершена.");
    }
}
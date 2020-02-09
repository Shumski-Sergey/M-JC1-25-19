package riliuchik.lab6_OOP.fileOOPinheritace.Lab6_1_taskA2;

//Создать иерархию классов, описывающих банковские карточки.
//Иерархия должна иметь хотя бы три уровня.

public class Lab6_1_taskA2 {
    public static void main(String[] args) {
        Personal first = new Personal("01/19", "Ильючик Р.А.", 1000, "BYN", "01/22");
        CreditCard second = new CreditCard("05/19", "Петров А.В.", -300, "BYN", "до 05.03.2020", "05/22");
        System.out.println("Краткая информация о запрашиваемых лицах:");
        first.shortInfo();
        second.shortInfo();
    }
}
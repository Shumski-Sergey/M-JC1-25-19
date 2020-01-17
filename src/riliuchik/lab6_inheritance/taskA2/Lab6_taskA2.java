package riliuchik.lab6_inheritance.taskA2;

//Создать иерархию классов, описывающих банковские карточки.
//Иерархия должна иметь хотя бы три уровня.

public class Lab6_taskA2 {
    public static void main(String[] args) {
        Personal first = new Personal("01/19", "Ильючик Р.А.", 1000, "01/22");
        CreditCard second = new CreditCard("05/19", "Петров А.В.", -300, "до 05.03.2020", "05/22");
        System.out.println("Краткая информация о запрашиваемых лицах:");
        System.out.println("Владелец карты по договору #" + first.getContractNumber() + ": " + first.getCardHolder() + " Баланс в рублях: " + first.getBalance() + " Дата окончания договора: " + first.getExpirationDate());
        System.out.print("Владелец карты по договору #" + second.getContractNumber() + ": " + second.getCardHolder() + " Баланс в рублях: " + second.getBalance() + " Срок погашения задолженности: " + second.getDateOfRepayment() + " Дата окончания договора: " + second.getExpirationDate());
    }
}
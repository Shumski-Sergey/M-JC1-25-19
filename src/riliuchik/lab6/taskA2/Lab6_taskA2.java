package riliuchik.lab6.taskA2;

public class Lab6_taskA2 {
    public static void main(String[] args) {
        Personal first = new Personal("Ильючик Р.А.", 1000, "01/22");
        CreditCard second = new CreditCard("Петров А.В.", -300, "до 05.03.2020", "03/23");
        System.out.println("Краткая информация о запрашиваемых лицах:");
        System.out.println("Клиент 1: " + first.getCardHolder() + " Баланс в рублях: " + first.getBalance() + " Дата окончания договора: " + first.getExpirationDate());
        System.out.print("Клиент 2: " + second.getCardHolder() + " Баланс в рублях: " + second.getBalance() + " Срок погашения задолженности: " + second.getDate() + " Дата окончания договора: " + second.getExpirationDate());
    }
}
package Lab6_2a_OOP;
//Создать иерархию классов, описывающих банковские карточки.
//Иерархия должна иметь хотя бы три уровня. 

public class Runner {
    public static void main(String[] args) {
        ProshcheProstogo proshcheProstogo = new ProshcheProstogo("МТБанк", "кредитная",
                "Visa Classic/Visa Gold", "4564 8654 2589 1235","Ivan Ivanov",
                "05/22", 599, true, "Проще простого",
                500, "зависит от кредитоспособности получателя",
                15, 40, 54, false, false);
        HalvaPlus halvaPlus = new HalvaPlus("МТБанк", "дебетовая", "MasterCard",
                "5687 4689 4158 7456", "Ivan Ivanov","08/23", 665,
                true, "Халва Плюс", "BYN", 20,
                10, true, true);
        PayOkay payOkay = new PayOkay("МТБанк", "дебетовая", "MasterCard",
                "5981 5632 5874 5665", "Ivan Ivanov","01/22", 541,
                true, "PayOkay", "BYN", 20, 5,
                true, true);

        System.out.println("Наименование банка: " + proshcheProstogo.getNameOfBank() +"\n" +
                "тип карты: " + proshcheProstogo.getTypeOfCard()+ "\n" +
                "система оплаты: " + proshcheProstogo.getPaymentSystem() + "\n" +
                "номер карты: " + proshcheProstogo.getNumbOfCard() + "\n" +
                "владелец карты: " + proshcheProstogo.getCardOwner() + "\n" +
                "срок действия карты: "+ proshcheProstogo.getCardExpityDate() + "\n" +
                "CVV: "+ proshcheProstogo.getCvv() + "\n" +
                "бесконтактная оплата: " + proshcheProstogo.isContactlessPayment() + "\n" +
                "наименование тарифного плана: " + proshcheProstogo.getNameOfTariff() + "\n" +
                "минимальная сумма кредитной линии, бел. руб: " + proshcheProstogo.getMinAmountOfCreditLine() + "\n" +
                "максимальная сумма кредитной линии, бел. руб.: " + proshcheProstogo.getMaxAmountOgCreditCard()  + "\n" +
                "процентная ставка, годовых: " + proshcheProstogo.getInterestRate() + "\n" +
                "грейс-период: " + proshcheProstogo.getGracePeriod()  + "\n" +
                "срок кредитования: " + proshcheProstogo.getLoanTerms() + "\n" +
                "наличие справки о доходах: " + proshcheProstogo.isIncomeStatement() + "\n" +
                "наличие поручителей: " + proshcheProstogo.isSurety());
        System.out.println();
        System.out.println("Наименование банка: " + halvaPlus.getNameOfBank() +"\n" +
                "тип карты: " + halvaPlus.getTypeOfCard()+ "\n" +
                "система оплаты: " + halvaPlus.getPaymentSystem() + "\n" +
                "номер карты: " +halvaPlus.getNumbOfCard() + "\n" +
                "владелец карты: " + halvaPlus.getCardOwner() + "\n" +
                "срок действия карты: "+ halvaPlus.getCardExpityDate() + "\n" +
                "CVV: "+halvaPlus.getCvv() + "\n" +
                "бесконтактная оплата: " + halvaPlus.isContactlessPayment() + "\n" +
                "наименование тарифного плана: " + halvaPlus.getNameOfTariff() + "\n" +
                "валюта счета: " + halvaPlus.getAccountCurrency() + "\n" +
                "плата за сервисное обслуживание, BYN: " + halvaPlus.getPaymentForUse()  + "\n" +
                "бонусные баллы по операциям в магазинах-партнерах: " + halvaPlus.getBonusesForPurchases() + "\n" +
                "оплата покупок баллами: " + halvaPlus.isBonusPayment()  + "\n" +
                "доставка карты после изготовления: " + halvaPlus.isCardDelivery() );
        System.out.println();
        System.out.println("Наименование банка: " + payOkay.getNameOfBank() +"\n" +
                "тип карты: " + payOkay.getTypeOfCard()+ "\n" +
                "система оплаты: " + payOkay.getPaymentSystem() + "\n" +
                "номер карты: " +payOkay.getNumbOfCard() + "\n" +
                "владелец карты: " + payOkay.getCardOwner() + "\n" +
                "срок действия карты: "+ payOkay.getCardExpityDate() + "\n" +
                "CVV: "+payOkay.getCvv() + "\n" +
                "бесконтактная оплата: " + payOkay.isContactlessPayment() + "\n" +
                "наименование тарифного плана: " + payOkay.getNameOfTariff() + "\n" +
                "валюта счета: " + payOkay.getAccountCurrency() + "\n" +
                "плата за сервисное обслуживание, BYN: " + payOkay.getPaymentForUse()  + "\n" +
                "кэшбэк, %: " + payOkay.getCashback() + "\n" +
                "специальный курс для расчетов в валютеи: " + payOkay.isSpecialExchangeRate()  + "\n" +
                "cтраховка на 1 год в подарок: " + payOkay.isInsurance() );
    }
}

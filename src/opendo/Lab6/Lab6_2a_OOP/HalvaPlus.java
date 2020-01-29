package Lab6_2a_OOP;

public class HalvaPlus extends DebitCard {
    private int bonusesForPurchases; //баллы за покупки
    private boolean bonusPayment; //оплата баллами
    private boolean cardDelivery; //доставка карты после изготовления

    public HalvaPlus(String nameOfBank, String typeOfCard, String paymentSystem, String numbOfCard, String cardOwner, String cardExpityDate, int cvv, boolean contactlessPayment, String nameOfTariff, String accountCurrency, int paymentForUse, int bonusesForPurchases, boolean bonusPayment, boolean cardDelivery) {
        super(nameOfBank, typeOfCard, paymentSystem, numbOfCard, cardOwner, cardExpityDate, cvv, contactlessPayment, nameOfTariff, accountCurrency, paymentForUse);
        this.bonusesForPurchases = bonusesForPurchases;
        this.bonusPayment = bonusPayment;
        this.cardDelivery = cardDelivery;
    }

    public int getBonusesForPurchases() {
        return bonusesForPurchases;
    }

    public boolean isBonusPayment() {
        return bonusPayment;
    }

    public boolean isCardDelivery() {
        return cardDelivery;
    }

   }

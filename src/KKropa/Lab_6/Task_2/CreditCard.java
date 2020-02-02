package KKropa.Lab_6.Task_2;

public class CreditCard extends BanksCard {
     private String CreditType;

    public CreditCard(String type, String number, String cardHolder, String creditType) {
        super(type, number, cardHolder);
        CreditType = creditType;
    }

    public String getCreditType() {
        return CreditType;
    }

    public void setCreditType(String creditType) {
        CreditType = creditType;
    }
}

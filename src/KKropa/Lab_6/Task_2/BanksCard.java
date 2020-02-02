package KKropa.Lab_6.Task_2;

public class BanksCard {
    private String Type;
    private String Number;
    private String CardHolder;

    public BanksCard(String type, String number, String cardHolder) {
        Type = type;
        Number = number;
        CardHolder = cardHolder;



    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getCardHolder() {
        return CardHolder;
    }

    public void setCardHolder(String cardHolder) {
        CardHolder = cardHolder;
    }
}

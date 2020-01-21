package KKropa.Lab_6.Task_2;

public class DebetCard extends BanksCard {
    private String DebetType;

    public DebetCard(String type, String number, String cardHolder, String debetType) {
        super(type, number, cardHolder);
        DebetType = debetType;
    }

    public String getDebetType() {
        return DebetType;
    }

    public void setDebetType(String debetType) {
        DebetType = debetType;
    }
}

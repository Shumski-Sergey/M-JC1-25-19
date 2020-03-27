package aProtasenia.lab7_OOP.BankCards;

class MasterCard extends International {
public MasterCard(String cardName, String cardNumber, String cardDate, String cardHolder, int cardCVS) {
        this.setCardName(cardName); this.setCardNumber(cardNumber); this.setDate(cardDate);
        this.setCardHolder(cardHolder); this.setCVS(cardCVS);
        }
        }
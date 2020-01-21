package dSankovsky.Inheritance.BankCards;

public class Runner {
    public static void main(String[] args) {
        VIsaCC visa = new VIsaCC("Visa Gold", "1234 1234 1234 1234", "01/22", "Jason Born", 999);
        MasterCardDC masterCard = new MasterCardDC("MasterCard Platinum", "3521 5854 8966 6323", "09/25", "Ozzy Osbourne", 666);
        System.out.println(visa.getCardName()+" "+visa.getCardNumber()+" "+visa.getDate()+" "+visa.getCardHolder()+" "+visa.getCVS()+" "+visa.addMoney());
        System.out.println(masterCard.getCardName()+" "+masterCard.getCardNumber()+" "+masterCard.getDate()+" "+masterCard.getCardHolder()+" "+masterCard.getCVS()+" "+masterCard.addMoney());
    }
}

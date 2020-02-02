package src.aProtasenia.lab7_oop.A1.Task_2;

class TestBankCards {
    public static void main(String[] args) {
        belcard belcard = new belcard("BelCard Schodraia", "9113 3245 4566 1456", "10/22", "Andrei Pratasenia", 345);
        international mastercard = new mastercard("MasterCard Standart", "5466 5678 1265 6788", "03/23", "Andrei Pratasenia", 777);
        System.out.println(belcard.getCardName()+" "+belcard.getCardNumber()+" "+belcard.getDate()+" "+belcard.getCardHolder()+" "+belcard.getCVS());
        System.out.println(mastercard.getCardName()+" "+mastercard.getCardNumber()+" "+mastercard.getDate()+" "+mastercard.getCardHolder()+" "+mastercard.getCVS());
    }
}

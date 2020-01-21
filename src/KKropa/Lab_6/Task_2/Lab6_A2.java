package KKropa.Lab_6.Task_2;

public class Lab6_A2 {
    public static void main (String [] args){
        DebetCard dc = new DebetCard("Visa", "4321 5432 6543 7654", "Johny White", "salary card");
        CreditCard cc = new CreditCard("Mastercard", "1234 5678 9012 3456", "Billy Black", "installment card");

        System.out.println(dc.getCardHolder() + " has a " + dc.getDebetType() + " with type " + dc.getType() + " and its number: " + dc.getNumber() + ".");
        System.out.println(cc.getCardHolder() + " has an " + cc.getCreditType() + " with type " + cc.getType() + " and its number: " + cc.getNumber() + ".");



    }
}

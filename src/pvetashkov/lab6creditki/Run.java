package src.pvetashkov.lab6creditki;

public class Run  {
    public static void main(String []args){
        VisaGold visa=new VisaGold ("Happy","Ivan","debet","PriorBank");
        System.out.println("название карточки -  " +visa.getTitle());
        //System.out.println("имя владельца - "+visa.getName());
        System.out.println("поле для количества - "+visa.getNumber());
        System.out.println("тип начисления - "+visa.getType());

        Belcard bl=new Belcard("Nat card", "Piotr Petrov", "secondary", "BBank");
        System.out.println("название карточки "+bl.getTitle());
        //System.out.println("имя владельца "+bl.getName());
        System.out.println("какое-то поле "+bl.getNumber());
        System.out.println("тип начисления "+bl.getType());
    }
}

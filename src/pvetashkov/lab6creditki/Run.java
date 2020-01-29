package src.pvetashkov.lab6creditki; //Сергей, выручай! никак не проходят values или как их там?... Нулл выдает.

public class Run  {
    public static void main(String []args){
        VisaGold visa=new VisaGold ("Happy","debet","primary","PriorBank");
        System.out.println("название карточки -  " +visa.getTitle());
        System.out.println("имя владельца - "+visa.getName());
        System.out.println("поле для количества - "+visa.getNumber());
        System.out.println("тип начисления - "+visa.getType());

        Belcard bel=new Belcard ("National card", "secondary", "credit", "BBank");
        System.out.println("название карточки "+bel.getTitle());
        System.out.println("имя владельца "+bel.getName());
        System.out.println("какое-то поле "+bel.getNumber());
        }
}

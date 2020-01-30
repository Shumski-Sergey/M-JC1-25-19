package src.pvetashkov.lab6creditki;

public class Run  {
    public static void main(String []args){
        VisaGold visa=new VisaGold ("Happy card","1234.2345.3456.4567","euro","Austria Bank","credit",12,"Ivan");
        System.out.println("название карточки -  " +visa.getTitle());
        System.out.println("номер карты - "+visa.getNumber());
        System.out.println("валюта "+visa.getSyspay());
        System.out.println("карта является собственностью "+visa.getOwner());
        System.out.println("дебет/кредит - "+visa.getType());
        System.out.println("срок кредитования "+visa.getMonth()+" мес");
        System.out.println("имя владельца - "+visa.getName());
        System.out.println();

        Belcard bel=new Belcard ("National card", "9876.8765.7654.6660", "byn", "Blr only",2023, "Piotr");
        System.out.println("название карточки "+bel.getTitle());
        System.out.println("номер карты "+bel.getNumber());
        System.out.println("валюта "+bel.getSyspay());
        System.out.println("транзакции в странах ЕС "+bel.getCountry());
        System.out.println("срок годности "+bel.getSrok());
        System.out.println("имя владельца "+bel.getName());

        }
}

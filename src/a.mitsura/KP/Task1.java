package a.mitsura.KP;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        //Asking for user to enter the number of month
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите номер месяца");
        //Reading his number and reminding it into the "a"
        String a=sc.nextLine();
        //Using Switch to print the name of month  under his number
        switch(a){
            case "1":
                System.out.println("Январь");
                break;
            case "2":
                System.out.println("Февраль");
                break;
            case "3":
                System.out.println("Март");
                break;
            case "4":
                System.out.println("Апрель");
                break;
            case "5":
                System.out.println("Май");
                break;
            case "6":
                System.out.println("Июнь");
                break;
            case "7":
                System.out.println("Июль");
                break;
            case "8":
                System.out.println("Август");
                break;
            case "9":
                System.out.println("Сентябрь");
                break;
            case "10":
                System.out.println("Октябрь");
                break;
            case "11":
                System.out.println("Ноябрь");
                break;
            case "12":
                System.out.println("Декабрь");
                break;
                //Check if the number of month is wrong
            default:
                System.out.println("Неверный номер месяца");
                break;
        }
    }
}

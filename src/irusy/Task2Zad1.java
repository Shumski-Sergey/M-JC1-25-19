package src.irusy;


public class Task2Zad1{
    public static void main (String[] args){
        double m = 8.5;
        double n = 10.45;
        double c = 10.0;
        if ((c-m)<(n-c)){
            System.out.println("Ближайщее число" + m);
        }else{
            System.out.println("Ближайшее число" + n);
        }
    }
}

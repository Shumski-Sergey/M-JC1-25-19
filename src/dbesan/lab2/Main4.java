package dbesan.lab2;
import static java.lang.Math.*;
public class Main4 {
    public static void main(String[] args){
        int randomNumber = 5+(int)(random()*155);
        if ((randomNumber >= 5)&&(randomNumber <= 155))
        {System.out.println("В интервале");}
        else
        {System.out.println("Не в интервале");}
    }
}

package src.skarpen.hierarchy;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<TechniquesSmall> techniquesSmall = new ArrayList<>();

        TechniquesSmall techniquesSmallFirst = new TechniquesSmall("Kettle", 2018, 1.5);
        TechniquesSmall techniquesSmallSecond = new TechniquesSmall("Microwave", 2020, 2.1);
        TechniquesSmall techniquesSmallThird = new TechniquesSmall("Toaster", 2018, 0.5);

        techniquesSmall.add(techniquesSmallFirst);
        techniquesSmall.add(techniquesSmallSecond);
        techniquesSmall.add(techniquesSmallThird);

        ArrayList<TechniquesBig> techniquesBig = new ArrayList<>();
        TechniquesBig techniquesBigFirst = new TechniquesBig("Refrigerator", 2019, 50.5);
        TechniquesBig techniquesBigSecond = new TechniquesBig("Washer", 2015, 25.0);
        TechniquesBig techniquesBigThird = new TechniquesBig("Stove", 2010, 32.2);

        techniquesBig.add(techniquesBigFirst);
        techniquesBig.add(techniquesBigSecond);
        techniquesBig.add(techniquesBigThird);

        /*   for (TechniquesSmall product:techniquesSmall) {
            System.out.println(product.Info());
            System.out.println(product.countDate());
            System.out.println(product.needDelivery());
        }

       System.out.println(techniquesBig.get(0).Info() +"\n" + techniquesBig.get(0).countDate()+ "\n" + techniquesBig.get(0).needDelivery());*/

        Scanner scanner = new Scanner(System.in);

        int a = (int) (Math.random() * 3);
        System.out.println("You must select a class:  Big techniques or automatically select a class of small equipment: B." + "\n" + "And we will turn it on!" );
        if (scanner.nextLine().equalsIgnoreCase("B")) {
                    System.out.println(a + " " + "Random number from the list of BIG equipment" + "\n" + techniquesBig.get(a).Info() + "\n" + techniquesBig.get(a).countDate() + "\n" + techniquesBig.get(a).needDelivery());

        } else {
            System.out.println(a +" "+ "Random number from the list of SMALL equipment" + "\n"+ techniquesSmall.get(a).Info() + "\n" + techniquesSmall.get(a).countDate() + "\n" + techniquesSmall.get(a).needDelivery());

        }
    }
}


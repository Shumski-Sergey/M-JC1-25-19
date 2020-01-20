package src.skarpen.hierarchy;

import java.util.ArrayList;

public class Test  {
    public static void main(String[] args) {

        ArrayList <TechniquesSmall> techniquesSmall = new ArrayList<>();

        TechniquesSmall techniquesSmallFirst = new TechniquesSmall("Kettle", 2018, 1.5);
        TechniquesSmall techniquesSmallSecond = new TechniquesSmall("Microwave", 2020, 2.1);
        TechniquesSmall techniquesSmallThird = new TechniquesSmall("Toaster", 2018, 0.5);

        techniquesSmall.add(techniquesSmallFirst);
        techniquesSmall.add(techniquesSmallSecond);
        techniquesSmall.add(techniquesSmallThird);

        for (TechniquesSmall product:techniquesSmall) {
            System.out.println(product.Info());
            System.out.println(product.countDate());
            System.out.println(product.needDelivery());
        }

        ArrayList <TechniquesBig> techniquesBig = new ArrayList<>();
        TechniquesBig techniquesBigFirst = new TechniquesBig("Refrigerator", 2019, 50.5);
        TechniquesBig techniquesBigSecond = new TechniquesBig("Washer", 2015, 25.0);
        TechniquesBig techniquesBigThird = new TechniquesBig("Stove", 2010, 32.2);

        techniquesBig.add(techniquesBigFirst);
        techniquesBig.add(techniquesBigSecond);
        techniquesBig.add(techniquesBigThird);

        System.out.println(techniquesBig.get(0).Info() +"\n" + techniquesBig.get(0).countDate()+ "\n" + techniquesBig.get(0).needDelivery());

    }
}

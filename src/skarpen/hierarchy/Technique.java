package src.skarpen.hierarchy;

public class Technique {
    private String name;
    private int saleYear;
    private double weight;

    public Technique(String name, int saleYear, double weight) {
        this.name = name;
        this.saleYear = saleYear;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSaleYear() {
        return saleYear;
    }

    public void setSaleYear(int saleYear) {
        this.saleYear = saleYear;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // This method displays information about a specific technique.

    public String Info() {return name +": " + "Date of sale: " + saleYear + " The total mass of the product: " + weight;}

    //This method warranty service time

    public int count() {return saleYear + 3;}

    public String countDate() {return "End of service " + count();}

    //This method specifies whether the delivery of goods

    public String needDelivery() {return " Will you need home delivery of this item?";
    }

}




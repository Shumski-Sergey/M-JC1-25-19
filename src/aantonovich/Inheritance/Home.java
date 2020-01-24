package aantonovich.Inheritance;

public class Home extends Tehnology {
     Home(String name, String brand, double weight){
         super(name, brand);
         this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private double weight;


}

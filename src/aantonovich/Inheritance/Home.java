package aantonovich.Inheritance;

public class Home extends Tehnology {
     Home(String name, String brand, int weight){
         super(name, brand);
         this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private  int weight;


}

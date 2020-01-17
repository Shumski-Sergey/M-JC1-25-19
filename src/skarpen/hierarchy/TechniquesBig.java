package src.skarpen.hierarchy;

public class TechniquesBig extends InfoTechnique {

    public TechniquesBig(String name, int saleYear, double weight) {
        super(name, saleYear, weight);
    }

    @Override
    public String needDelivery() {return "You will need home delivery of this item. Because it is very hard";}

}

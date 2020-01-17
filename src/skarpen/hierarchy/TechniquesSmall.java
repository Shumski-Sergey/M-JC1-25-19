package src.skarpen.hierarchy;

public class TechniquesSmall extends Technique {

    public TechniquesSmall(String name, int saleYear, double weight) {
        super(name, saleYear, weight);
    }

    @Override
    public int count() {
        return getSaleYear() + 1;
    }
}


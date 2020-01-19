package src.skarpen.hierarchy;

public class TechniquesSmall extends InfoTechnique {

    public TechniquesSmall(String name, int saleYear, double weight) {
        super(name, saleYear, weight);
    }

    private static final int ONE = 1;

    @Override
    public int count() {
        return getSaleYear() + ONE;
    }
}


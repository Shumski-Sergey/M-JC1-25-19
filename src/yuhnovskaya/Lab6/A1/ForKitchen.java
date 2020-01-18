package yuhnovskaya.Lab6.A1;

public class ForKitchen extends LargeEquipment {
    private String model;

    public ForKitchen(String maker, int wattege, String state, String type, String model) {
        super(maker, wattege, state, type);
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
}

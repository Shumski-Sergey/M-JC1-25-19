package dSankovsky.Inheritance.Technic;

public class WirelessHeadphone extends PortableTechnic {

    private boolean withCase;
    private String headphoneType;

    public WirelessHeadphone(String model, String color, String material, int battery, int weight, boolean withCase, String headphoneType){
        this.setColor(color);
        this.setModel(model);
        this.setMaterial(material);
        this.setBattery(battery);
        this.setWeight(weight);
        this.setWithCase(withCase);
        this.setHeadphoneType(headphoneType);
    }
    public boolean isWithCase() {
        return withCase;
    }

    public void setWithCase(boolean withCase) {
        this.withCase = withCase;
    }

    public String getHeadphoneType() {
        return headphoneType;
    }

    public void setHeadphoneType(String headphoneType) {
        this.headphoneType = headphoneType;
    }
}

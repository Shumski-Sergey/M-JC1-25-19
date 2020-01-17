package dSankovsky.Inheritance.Technic;

public class Runner {
    public static void main(String[] args) {

        Oven oven = new Oven("Gefest","white","steel",false,220,true);
        Refrigerator frige = new Refrigerator("LG","black", "steel", true, 3, 1.90);
        Smartphone phone = new Smartphone("iPhone","gold","aluminium", 128,1800,"iOS", 4.7);
        WirelessHeadphone headphone = new WirelessHeadphone("Sony MDR1000A", "royal blue", "plastiс", 760, 215, false,"Monitor");

        System.out.println("Model: " + oven.getModel() + "; color " + oven.getColor() + "; material " + oven.getMaterial()+"; power ("+oven.getPowerOutlet()+"); Max Temperature "+oven.getMaxTemperature()+" C; Convection Mod ("+oven.getConvectionMode()+")");
        System.out.println("Model: " + frige.getModel() + "; color " + frige.getColor() + "; material " + frige.getMaterial()+"; power ("+frige.getPowerOutlet()+"); storage amount "+frige.getStorage()+"; tall "+frige.getTall()+" cm");
        System.out.println("Model: " + phone.getModel() + "; color " + phone.getColor() + "; material " + phone.getMaterial()+"; weight "+phone.getWeight()+" g; battery "+phone.getBattery()+" mA/h; OS "+phone.getOS()+"; display size " + phone.getDisplaySize()+"'");
        System.out.println("Model: " + headphone.getModel() + "; color " + headphone.getColor() + "; material " + headphone.getMaterial()+"; weight "+headphone.getWeight()+" g; battery "+headphone.getBattery()+" mA/h; with charger case ("+headphone.isWithCase()+"); headphone type " + headphone.getHeadphoneType());
    }
}

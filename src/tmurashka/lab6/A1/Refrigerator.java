package tmurashka.lab6.A1;

public class Refrigerator extends ElectronicEquipment {
    public Refrigerator() {
        super(10);
    }

    @Override
    public void On(){
        System.out.println("Refrigerator spent electricity: " + getCost());
    }
}

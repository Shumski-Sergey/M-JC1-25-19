package tmurashka.lab6.A1;

public class Owen extends ElectronicEquipment {
    public Owen() {
        super(5);
    }

    @Override
    public void On(){
        System.out.println("Owen spent electricity: " + getCost());
    }
}

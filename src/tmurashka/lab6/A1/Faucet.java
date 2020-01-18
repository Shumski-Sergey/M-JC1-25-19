package tmurashka.lab6.A1;

public class Faucet extends BathEquipment {
    public Faucet() {
        super(2);
    }

    @Override
    public void TurnOn() {
        System.out.println("water spent: " + getCost());
    }

}

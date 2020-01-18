package tmurashka.lab6.A1;

public class Technics {
    public static void main(String[] args) {
        Charger ref = new Refrigerator();
        Charger own = new Owen();
        Pipes faucet = new Faucet();

        ref.On();
        own.On();
        faucet.TurnOn();
    }
}

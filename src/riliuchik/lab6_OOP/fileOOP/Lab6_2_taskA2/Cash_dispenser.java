package riliuchik.lab6_OOP.fileOOP.Lab6_2_taskA2;

public class Cash_dispenser {
    private final int banknote20 = 20;
    private final int banknote50 = 50;
    private final int banknote100 = 100;
    private int quantityOf20;
    private int quantityOf50;
    private int quantityOf100;
    private int[] nominal;
    private int budget_of_ATM;
    private int amount;
    private int temp;

    public int getBanknote20() {
        return banknote20;
    }

    public int getBanknote50() {
        return banknote50;
    }

    public int getBanknote100() {
        return banknote100;
    }

    public int getQuantityOf20() {
        return quantityOf20;
    }

    public int getQuantityOf50() {
        return quantityOf50;
    }

    public int getQuantityOf100() {
        return quantityOf100;
    }

    public int getBudget_of_ATM() {
        return budget_of_ATM;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTemp() {
        return temp;
    }

    public Cash_dispenser(int quantityOf20, int quantityOf50, int quantityOf100) {
        this.quantityOf20 = quantityOf20;
        this.quantityOf50 = quantityOf50;
        this.quantityOf100 = quantityOf100;
        nominal = new int[]{banknote20, banknote50, banknote100};
        budget_of_ATM = quantityOf20 * banknote20 + quantityOf50 * banknote50 + quantityOf100 * banknote100;
    }

    public boolean budget_after_withdrawal(int amount) {
        boolean check;
        temp = budget_of_ATM;
        budget_of_ATM -= amount;
        if (budget_of_ATM < 0) {
            check = false;
            System.out.println("В устройстве недостаточно средств");
            budget_of_ATM += amount;
        } else {
            int[] required_quantity = new int[nominal.length];
            budget_of_ATM += amount;
            for (int i = nominal.length - 1; i >= 0; i--) {
                required_quantity[i] = amount / nominal[i];
                amount %= nominal[i];
            }
            if (amount == 0) {
                check = true;
                System.out.println("Будет выдано банкнот:");
                for (int i = 0; i < required_quantity.length; i++) {
                    System.out.println("номиналом " + nominal[i] + " руб.: " + required_quantity[i]);
                }
                System.out.print("Заберите деньги");
            } else {
                check = false;
            }
        }
        return check;
    }

    public void budget_after_refill() {
        budget_of_ATM += amount;
    }
}
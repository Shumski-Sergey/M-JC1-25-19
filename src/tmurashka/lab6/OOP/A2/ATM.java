package tmurashka.lab6.OOP.A2;

public class ATM {
    private int c20;
    private int c50;
    private int c100;

    public ATM(int c20, int c50, int c100) {
        this.c20 = c20;
        this.c50 = c50;
        this.c100 = c100;
    }

    public void addMoney(int c20, int c50, int c100) {
        this.c20 += c20;
        this.c50 += c50;
        this.c100 += c100;
    }

    public boolean getMoney(int sum) {
        int moneyCount[] = {c20, c50, c100};
        int moneyValue[] = {20, 50, 100};
        int currentMoney = moneyCount.length - 1;
        while (sum > 0 && currentMoney >=0) {
            if (sum >= moneyValue[currentMoney] && moneyCount[currentMoney] != 0) {
                sum -= moneyValue[currentMoney];
                moneyCount[currentMoney]--;
            }
            else {
                currentMoney--;
            }
        }
        if (sum == 0) {
            System.out.println((c100 - moneyCount[2]) + " сотки " + (c50 - moneyCount[1]) + " 50-ки " + (c20 - moneyCount[0]) + " 20-ки ");

            c20 = moneyCount[0];
            c50 = moneyCount[1];
            c100 = moneyCount[2];
            return true;
        }
        return false;
    }
}

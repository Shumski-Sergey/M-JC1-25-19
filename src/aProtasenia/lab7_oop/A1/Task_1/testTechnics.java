package src.aProtasenia.lab7_oop.A1.Task_1;

class testTechnics {
    public static void main(String[] args) {
        projector projector = new projector("Canon LX-MU500", 370, 5, true);
        television television = new television("Xiaomi MiTV4C,", 150,18,false);
        loanMower loanMower = new loanMower("Husqvarna LC 3531 VX,", 900, 28, false);
        cultivator cultivator = new cultivator("Belarus 09H", 6600, 176,true);

        System.out.println("Model: " + projector.getModel() + "; Rated power " + projector.getPower() + " watt ; weight " + projector.getWeight()+"; connected?: " + projector.getPowerON());
        System.out.println("Model: " + television.getModel() + "; Rated power " + television.getPower() + " watt ; weight " + television.getWeight()+"; connected?: " + television.getPowerON());
        System.out.println("Model: " + loanMower.getModel() + "; Rated power " + loanMower.getPower() + "; watt ; weight " + loanMower.getWeight()+"; connected?: " + loanMower.getPowerON());
        System.out.println("Model: " + cultivator.getModel() + "; Rated power " + cultivator.getPower() + "; watt ; weight " + cultivator.getWeight()+"; connected?: " + cultivator.getPowerON());
    }
}

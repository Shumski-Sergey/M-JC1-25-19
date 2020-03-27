package aProtasenia.lab7_OOP.Technics;

class TestTechnics {
    public static void main(String[] args) {
        Projector projector = new Projector("Canon LX-MU500", 370, 5, true);
        Television television = new Television("Xiaomi MiTV4C,", 150,18,false);
        LoanMower loanMower = new LoanMower("Husqvarna LC 3531 VX,", 900, 28, false);
        Cultivator cultivator = new Cultivator("Belarus 09H", 6600, 176,true);

        System.out.println("Model: " + projector.getModel() + "; Rated power " + projector.getPower() + " watt ; weight " + projector.getWeight()+"; connected?: " + projector.getPowerON());
        System.out.println("Model: " + television.getModel() + "; Rated power " + television.getPower() + " watt ; weight " + television.getWeight()+"; connected?: " + television.getPowerON());
        System.out.println("Model: " + loanMower.getModel() + "; Rated power " + loanMower.getPower() + "; watt ; weight " + loanMower.getWeight()+"; connected?: " + loanMower.getPowerON());
        System.out.println("Model: " + cultivator.getModel() + "; Rated power " + cultivator.getPower() + "; watt ; weight " + cultivator.getWeight()+"; connected?: " + cultivator.getPowerON());
    }
}

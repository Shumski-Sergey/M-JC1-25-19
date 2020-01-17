package aantonovich.Inheritance;

public class Main {
    public static void main(String[] args) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner("пылесос","Thomas", 3700, 400);
        System.out.println("Бытовая техника: " + vacuumCleaner.getName() +" " + vacuumCleaner.getBrand());
        System.out.println("Вес: " + vacuumCleaner.getWeight() + " грамм");
        System.out.println("Мощность: " + vacuumCleaner.getPower() + " Вт");
    }
}

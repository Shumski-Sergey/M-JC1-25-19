package aantonovich.Inheritance;

public class Main {
    public static void main(String[] args) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner("пылесос","Thomas", 3.7, 400);
        System.out.println("Бытовая техника: " + vacuumCleaner.getName() +" " + vacuumCleaner.getBrand());
        System.out.println("Вес: " + vacuumCleaner.getWeight() + " килограмм");
        System.out.println("Мощность: " + vacuumCleaner.getPower() + " Вт");
        System.out.println();
        Washer washer = new Washer("стиральная машина", "Atlant", 22, 4);
        System.out.println("Бытовая техника: " + washer.getName()+ " " + washer.getBrand());
        System.out.println("Вес: " + washer.getWeight() + " килограмм");
        System.out.println("Загрузка: " + washer.getVolume() + " килограмм");
    }
}

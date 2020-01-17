package sshumski.dogs;

import sshumski.dogs.service.impl.DogServiceImpl;

public class Runner {
    public static void main(String[] args) {
        DogServiceImpl service = new DogServiceImpl();
        Dog dogOne = new Dog("Bob", 11, 50, 40);
        Dog dogSecond = new Dog("God", 7, 70, 40);
        String winner = service.fight(dogOne, dogSecond);
        System.out.println(winner);
    }
}

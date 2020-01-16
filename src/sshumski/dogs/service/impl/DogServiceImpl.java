package sshumski.dogs.service.impl;

import sshumski.dogs.Dog;
import sshumski.dogs.service.DogService;

public class DogServiceImpl implements DogService {

    private int KPD(Dog dog) {
        return dog.getWeight() * dog.getPower() - dog.getAge();
    }

    @Override
    public String fight(Dog dogOne, Dog dogSecond) {
        return KPD(dogOne) > KPD(dogSecond) ? dogOne.getName() : dogSecond.getName();
    }
}

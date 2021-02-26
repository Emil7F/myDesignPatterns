package pl.emil7f.factory.method.animal;

import pl.emil7f.factory.method.LandAnimalConcreteFactory;
import pl.emil7f.factory.method.OceanAnimalFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println(new LandAnimalConcreteFactory().getAnimal());

        OceanAnimalFactory oceanAnimalFactory = new OceanAnimalFactory();
        String oceanAnimals = oceanAnimalFactory.getAnimal();

        System.out.println(oceanAnimals);
    }
}

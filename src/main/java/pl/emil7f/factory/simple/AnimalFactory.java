package pl.emil7f.factory.simple;

import pl.emil7f.factory.simple.animal.Animal;
import pl.emil7f.factory.simple.animal.land.Cat;
import pl.emil7f.factory.simple.animal.land.Dog;
import pl.emil7f.factory.simple.animal.ocean.Salmon;
import pl.emil7f.factory.simple.animal.ocean.Tuna;

public class AnimalFactory {

    public String createAnimal(AnimalType animalType) {

        switch (animalType) {
            case LAND:
                return createLandAnimals();
            case OCEAN:
                return createOceanAnimals();

            default:
                throw new IllegalArgumentException("There is no such Animal");
        }
    }

    private String createLandAnimals() {
        return "Land animals:\n" +
                new Dog().getName() + "\n" +
                new Cat().getName() + "\"" +
                "\n";
    }

    private String createOceanAnimals() {
        return "Ocean animals:\n" +
                new Tuna().getName() + "\n" +
                new Salmon().getName() + "\"" +
                "\n";
    }


}

package pl.emil7f.factory.method;

import pl.emil7f.factory.method.animal.land.Bear;
import pl.emil7f.factory.method.animal.land.Fox;

public class LandAnimalConcreteFactory implements AnimalFactory {
    @Override
    public String getAnimal() {
        return "Land Animals:\n" +
                new Fox().getName() + " \n" +
                new Bear().getName();
    }
}

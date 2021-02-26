package pl.emil7f.factory.method;

import pl.emil7f.factory.method.animal.ocean.Orca;
import pl.emil7f.factory.method.animal.ocean.Shark;

public class OceanAnimalFactory implements AnimalFactory {
    @Override
    public String getAnimal() {
        return "Ocean Animals:\n" +
                new Orca().getName() + "\n" +
                new Shark().getName();
    }
}

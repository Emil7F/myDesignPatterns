package pl.emil7f.factory.simple;

public class App {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        System.out.println(animalFactory.createAnimal(AnimalType.LAND));


        System.out.println(animalFactory.createAnimal(AnimalType.OCEAN));

    }
}

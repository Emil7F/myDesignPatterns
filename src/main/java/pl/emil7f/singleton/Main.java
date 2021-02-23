package pl.emil7f.singleton;

/*
Może być tylko jedna instancja obiektu, dostępna z każdego miejsca w aplikacji
Lamie zasade S z solid

Singleton ma prywatny konstruktor

W zwykłej klasie do stworzenia obiektu używamy konstruktora, a w singletonie używamy statycznej met. getInstance()

Singleton lazy
Nie jest bezpieczny wielowątkowo.
 */
public class Main {

    public static void main(String[] args) {


        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        x.singletonString = (x.singletonString).toUpperCase();

        System.out.println(x.singletonString);
        System.out.println(y.singletonString);
        System.out.println(z.singletonString);
        System.out.println("\n\n");

        z.singletonString = z.singletonString.toLowerCase();

        System.out.println(x.singletonString);
        System.out.println(y.singletonString);
        System.out.println(z.singletonString);

    }


}

package pl.emil7f.singleton;

public class Singleton {

    private static Singleton singleInstance = null;

    public String singletonString;

    private Singleton() {
        singletonString = "String from Singleton class ";
    }

    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}

package pl.emil7f.observer;

public class Client implements Observer {

    @Override
    public void update() {
        System.out.println("End of work");
    }
}

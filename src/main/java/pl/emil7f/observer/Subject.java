package pl.emil7f.observer;

public class Subject {

    public Subject(Observer observer){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                    try {

                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                observer.update();
            }
        });

        thread.start();
    }
}

package observer.firstExample;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void subscribe(Observer observers) {
        this.observers.add(observers);
    }

    public void removeSubscribe(Observer observers) {
        this.observers.remove(observers);
    }

    public void startWork() {
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
                for (Observer observer : observers) {
                    observer.update();
                }
            }
        });
        thread.start();
    }
}

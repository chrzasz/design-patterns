package observer;

public interface Publisher {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyAllObservers();

}

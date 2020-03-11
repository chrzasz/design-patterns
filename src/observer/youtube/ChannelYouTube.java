package observer.youtube;

import observer.Observer;
import observer.Publisher;

import java.util.ArrayList;
import java.util.List;

class ChannelYouTube implements Publisher {

    private int id;
    private String name;
    private List<Observer> observerList;

    ChannelYouTube(int id, String name) {
        this.id = id;
        this.name = name;
        this.observerList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer o : observerList) {
            o.update(name);
        }
    }
}

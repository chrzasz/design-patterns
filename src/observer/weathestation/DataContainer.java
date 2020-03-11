package observer.weathestation;

import observer.Observer;
import observer.Publisher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class DataContainer implements Publisher {

    private List<Observer> displays;
    int value;

    DataContainer() {
        displays = new ArrayList<>();
    }


    @Override
    public void register(Observer observer) {
        displays.add(observer);

    }

    @Override
    public void unregister(Observer observer) {
        displays.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        Iterator<Observer> it = displays.iterator();
        while(it.hasNext()) {
            Observer observer = it.next();
            observer.update(value);
        }
    }


    void setValue(int value) {
        this.value = value;
        System.out.println("New value:" + value);
        notifyAllObservers();
    }
}

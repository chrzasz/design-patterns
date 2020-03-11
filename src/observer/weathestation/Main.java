package observer.weathestation;

class Main {
    public static void main(String[] args) {

        DataContainer dataContainer = new DataContainer();
        Display display1 = new Display(1);
        dataContainer.register(display1);
        dataContainer.setValue(22);

        Display display2 = new Display(2);
        Display display3 = new Display(3);

        dataContainer.register(display2);
        dataContainer.register(display3);

        dataContainer.setValue(23);

    }
}

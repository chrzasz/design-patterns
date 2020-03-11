package observer.weathestation;


import observer.Observer;

class Display implements Observer {

    private int id;
    private Integer value;

    Display(int id) {
        this.id = id;
    }

    @Override
    public void update(Object o) {
        this.value = Integer.valueOf(o.toString());
        System.out.println("Display id=" + id + " value=" + value);

    }

}

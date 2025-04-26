package part2;
public class Helicopter extends Aircraft {
    public Helicopter(String id, TowerMediator m, int fuel) {
        super(id, m, fuel);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Helicopter " + id + " received: " + msg);
    }
}


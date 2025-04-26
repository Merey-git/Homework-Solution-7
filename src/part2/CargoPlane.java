package part2;

public class CargoPlane extends Aircraft {
    public CargoPlane(String id, TowerMediator m, int fuel) {
        super(id, m, fuel);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Cargo plane " + id + " received: " + msg);
    }
}


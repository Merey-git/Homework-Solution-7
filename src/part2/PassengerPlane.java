package part2;

public class PassengerPlane extends Aircraft {
    public PassengerPlane(String id, TowerMediator m, int fuel) {
        super(id, m, fuel);
    }

    @Override
    public void receive(String msg) {
        System.out.println("PassengerPlane " + id + " received: " + msg);
    }
}



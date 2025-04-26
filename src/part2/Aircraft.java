package part2;

public abstract class Aircraft {
    protected String id;
    protected TowerMediator mediator;
    protected int fuelLevel;

    public Aircraft(String id, TowerMediator mediator, int fuelLevel) {
        this.id = id;
        this.mediator = mediator;
        this.fuelLevel = fuelLevel;
    }

    public void send(String msg) {
        mediator.broadcast(msg, this);
    }

    public abstract void receive(String msg);

    public String getId() {
        return id;
    }
    public int getFuelLevel() {
        return fuelLevel;
    }
}

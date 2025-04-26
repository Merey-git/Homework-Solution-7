package part2;

public class Main {
    public static void main(String[] args) {
        ControlTower tower = new ControlTower();

        PassengerPlane passengerPlane = new PassengerPlane("FlyPlane-1", tower, 150);
        CargoPlane cargoPlane = new CargoPlane("AirCargo-70", tower, 70);
        Helicopter helicopter = new Helicopter("KazAir-Heli", tower, 180);

        passengerPlane.send("Requesting permission to land");
        cargoPlane.send("Ready for cargo takeoff");
        helicopter.send("Helicopter requesting landing");

        passengerPlane.receive("Permission granted to land");
        cargoPlane.receive("Cleared for cargo flight");
        helicopter.receive("Permission granted to land");
    }
}

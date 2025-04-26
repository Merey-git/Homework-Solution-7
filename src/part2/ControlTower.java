package part2;

import java.util.LinkedList;
import java.util.Queue;

public class ControlTower implements TowerMediator {
    private Queue<Aircraft> landingQueue = new LinkedList<>();
    private Queue<Aircraft> takeoffQueue = new LinkedList<>();

    @Override
    public void broadcast(String msg, Aircraft sender) {
        System.out.println("Control Tower received message from " + sender.getId() + ": " + msg);
    }

    @Override
    public boolean requestRunway(Aircraft a) {
        if (a.getFuelLevel() < 70) {
            System.out.println(a.getId() + " granted emergency landing!");
            return true;
        } else {
            System.out.println(a.getId() + " is queued for takeoff.");
            return false;
        }
    }
}

package State;

import java.util.ArrayList;
import java.util.List;

public class Delivery {
    private State state;
    private boolean delivery = false;
    private List<String> deliveryList = new ArrayList<>();
    private int CurrentLocation = 0;

    public Delivery() {
        this.state = new ReadyState(this);
        setCurrentLocation(true);
        for (int i = 1; i <= 100; i++) {
            deliveryList.add("Item with id " + i);
        }
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setCurrentLocation(boolean delivery) {
        this.delivery = delivery;
    }

    public boolean isPlaying() {
        return delivery;
    }

    public String startPlayback() {
        return "Your delivery in " + deliveryList.get(CurrentLocation);
    }

    public String nextLocation() {
        CurrentLocation++;
        if (CurrentLocation > deliveryList.size() - 1) {
            CurrentLocation = 0;
        }
        return "Your delivery sending " + deliveryList.get(CurrentLocation);
    }

    public String previousLocation() {
        CurrentLocation--;
        if (CurrentLocation < 0) {
            CurrentLocation = deliveryList.size() - 1;
        }
        return "Your delivery sending " + deliveryList.get(CurrentLocation);
    }

    public void setCurrentLocation() {
        this.CurrentLocation=0  ;
    }
}

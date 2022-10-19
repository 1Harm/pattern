package State;

public class DeliveringState extends State {
    DeliveringState(Delivery player) {
        super(player);
    }

    @Override
    public String Cancel() {
        delivery.changeState(new CancelState(delivery));
        delivery.setCurrentLocation();
        return "Cancel delivery";
    }

    @Override
    public String currentDelivery() {
        delivery.changeState(new ReadyState(delivery));
        return "Paused...";
    }

    @Override
    public String nextDelivery() {
        return delivery.nextLocation();
    }

    @Override
    public String previousDelivery() {
        return delivery.previousLocation();
    }
}
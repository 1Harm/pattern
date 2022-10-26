package State;

public class ReadyState extends State {
    public ReadyState(Delivery delivery) {
        super(delivery);
    }

    @Override
    public String Cancel() {
        delivery.changeState(new CancelState(delivery));
        return "Canceled...";
    }

    @Override
    public String currentDelivery() {
        String action = delivery.startPlayback();
        delivery.changeState(new DeliveringState(delivery));
        return action;
    }

    @Override
    public String nextDelivery() {
        return "Canceled...";
    }

    @Override
    public String previousDelivery() {
        return "Canceled...";
    }
}
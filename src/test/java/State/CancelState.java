package State;

public class CancelState extends State {
    CancelState(Delivery delivery) {
        super(delivery);
        delivery.setCurrentLocation(false);
    }

    @Override
    public String Cancel() {
        if (delivery.isPlaying()) {
            delivery.changeState(new ReadyState(delivery));
            return "Cancel delivery";
        } else {
            return "Cancel delivery...";
        }
    }

    @Override
    public String currentDelivery() {
        delivery.changeState(new ReadyState(delivery));
        return "Ready for delivering";
    }

    @Override
    public String nextDelivery() {
        return "Locked...";
    }

    @Override
    public String previousDelivery() {
        return "Locked...";
    }
}


package State;

public abstract class State {
    Delivery delivery;

    State(Delivery delivery) {
        this.delivery = delivery;
    }

    public abstract String Cancel();
    public abstract String currentDelivery();
    public abstract String nextDelivery();
    public abstract String previousDelivery();
}

package State;

import javax.swing.*;
import java.awt.*;

public class UI {
    private Delivery delivery;
    private static JTextField textField = new JTextField();

    public UI(Delivery delivery) {
        this.delivery = delivery;
    }

    public void init() {
        JFrame frame = new JFrame("Delivery of collection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        frame.getContentPane().add(context);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(textField);
        context.add(buttons);

        JButton current = new JButton("Current");
        current.addActionListener(e -> textField.setText(delivery.getState().currentDelivery()));
        JButton Cancel = new JButton("Cancel delivery");
        Cancel.addActionListener(e -> textField.setText(delivery.getState().Cancel()));
        JButton next = new JButton("Next order");
        next.addActionListener(e -> textField.setText(delivery.getState().nextDelivery()));
        JButton prev = new JButton("Previous order");
        prev.addActionListener(e -> textField.setText(delivery.getState().previousDelivery()));
        frame.setVisible(true);
        frame.setSize(900, 200);
        buttons.add(current);
        buttons.add(Cancel);
        buttons.add(next);
        buttons.add(prev);
    }
}

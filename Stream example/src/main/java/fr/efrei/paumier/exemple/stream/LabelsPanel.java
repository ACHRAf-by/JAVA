package fr.efrei.paumier.exemple.stream;

import javax.swing.*;

public class LabelsPanel extends JPanel {
    private String greeting;
    private final JLabel[] greetingLabels;

    public LabelsPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        greetingLabels = new JLabel[3];
        for (int i = 0; i < 3; i++) {
            greetingLabels[i] = new JLabel();
            greetingLabels[i].setHorizontalAlignment(SwingConstants.CENTER);
            add(greetingLabels[i]);
        }
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
        String[] parts = greeting.split(" ");

        for (int i = 0; i < 3; i++) {
            greetingLabels[i].setText(parts[i]);
        }
    }
}

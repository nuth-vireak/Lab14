package view;

import javax.swing.*;

public class StopEngine extends JFrame {

    StopEnginePanel panel;

    public StopEngine() throws InterruptedException {

        panel = new StopEnginePanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

}

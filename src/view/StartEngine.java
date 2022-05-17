package view;

import javax.swing.*;
import java.awt.*;

public class StartEngine extends JFrame {

    StartEnginePanel panel;

    public StartEngine() throws InterruptedException {

        panel = new StartEnginePanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }

}

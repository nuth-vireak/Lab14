package view;

import javax.swing.*;
import java.awt.*;

public class StartEngine extends JFrame {

    StartEnginePanel panel;

    public StartEngine() {

        panel = new StartEnginePanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }

}

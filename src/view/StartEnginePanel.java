package view;

import javax.swing.*;
import java.awt.*;

public class StartEnginePanel extends JPanel {

    public StartEnginePanel() {
        this.setPreferredSize(new Dimension(600, 600));
        this.setBackground(Color.RED);
    }

    @Override
    public void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        g2d.setStroke(new BasicStroke(5));

        g2d.setPaint(Color.BLACK);
        g2d.drawOval(150, 150, 300, 300);
    }
}

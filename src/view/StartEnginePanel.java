package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartEnginePanel extends JPanel {
    private JLabel speedLabel;
    private int gear = 0;
    private String gearParameter;
    public StartEnginePanel() throws InterruptedException {

        speedLabel = new JLabel();
        speedLabel.setFont(new Font("Nunito Sans", Font.PLAIN, 94));
        speedLabel.setHorizontalAlignment(SwingConstants.CENTER);
        speedLabel.setVerticalAlignment(SwingConstants.CENTER);
        speedLabel.setBounds(175, 250, 250, 100);
        speedLabel.setOpaque(true);
        add(speedLabel);

        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gear != 125)
                    gear++;
                gearParameter = String.format("%03d", gear);
                speedLabel.setText(gearParameter);
            }
        });

        timer.start();

        this.setPreferredSize(new Dimension(600, 600));
        this.setBackground(Color.RED);
        setLayout(null);
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

package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopEnginePanel extends JPanel {
    private JLabel speedLabel;
    private JLabel mphLabel;
    private int gear = 250;
    private String gearParameter;
    public StopEnginePanel() throws InterruptedException {

        speedLabel = new JLabel();
        speedLabel.setFont(new Font("JetBrains Mono", Font.PLAIN, 94));
        speedLabel.setHorizontalAlignment(SwingConstants.CENTER);
        speedLabel.setVerticalAlignment(SwingConstants.CENTER);
        speedLabel.setBounds(170, 250, 250, 100);
        speedLabel.setOpaque(true);
        add(speedLabel);

        Timer timer = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gear != 0)
                    gear--;
                gearParameter = String.format("%03d", gear);
                speedLabel.setText(gearParameter);
            }
        });

        timer.start();

        mphLabel = new JLabel("MPH");
        mphLabel.setForeground(Color.BLACK);
        mphLabel.setFont(new Font("Inter", Font.PLAIN, 20));
        mphLabel.setBounds(273, 360, 250, 30);
        add(mphLabel);

        this.setPreferredSize(new Dimension(600, 600));
        this.setBackground(Color.RED);
        setLayout(null);
    }

    @Override
    public void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        g2d.setStroke(new BasicStroke(7));

        g2d.setPaint(Color.BLACK);
        g2d.drawOval(150, 150, 300, 300);

    }
}

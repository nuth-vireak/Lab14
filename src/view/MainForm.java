package view;

import model.Honda;
import model.Suzuki;
import model.Yamaha;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame implements ActionListener {

    Honda honda = new Honda(1, "Honda", "T-500", 2019, 200000);
    Suzuki suzuki = new Suzuki(2, "Suzuki", "GH", 2020, 100000);
    Yamaha yamaha = new Yamaha(3, "Yamaha", "RX", 2022, 200000);

    JFrame frame = new JFrame();

    private JLabel textSmall;
    private JButton startEngineButton;
    private JButton stopEngineButton;
    private JButton driveButton;

    public MainForm() {

        JPanel titlePanel = new JPanel();
        titlePanel.setBounds(0, 0 ,465, 100);
        titlePanel.setLayout(null);

        textSmall = new JLabel("Motorbike");
        textSmall.setFont(new Font("Arial", Font.PLAIN, 30));
        textSmall.setSize(300, 30);
        textSmall.setLocation(170, 30);
        titlePanel.add(textSmall);

        JPanel tablePanel = new JPanel();
        tablePanel.setBounds(0, 100 ,465, 250);

        String[][] data = {
                {String.valueOf(honda.getId()), honda.getBrand(), honda.getModel(), String.valueOf(honda.getYear()), String.valueOf(honda.getPrice())},
                {String.valueOf(suzuki.getId()), suzuki.getBrand(), suzuki.getModel(), String.valueOf(suzuki.getYear()), String.valueOf(suzuki.getPrice())},
                {String.valueOf(yamaha.getId()), yamaha.getBrand(), yamaha.getModel(), String.valueOf(yamaha.getYear()), String.valueOf(yamaha.getPrice())},
        };
        String[] header = { "ID", "Brand", "Model", "Year", "Price" };
        JTable table = new JTable(data, header);
        tablePanel.add(new JScrollPane(table));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(500, 100 ,465, 250);

        startEngineButton = new JButton("Start Engine");
        startEngineButton.setFont(new Font("Arial", Font.PLAIN, 15));
        startEngineButton.setSize(100, 20);
        startEngineButton.setLocation(270, 450);
        startEngineButton.addActionListener(this);
        buttonPanel.add(startEngineButton);

        stopEngineButton = new JButton("Stop Engine");
        stopEngineButton.setFont(new Font("Arial", Font.PLAIN, 15));
        stopEngineButton.setSize(100, 20);
        stopEngineButton.setLocation(270, 450);
        buttonPanel.add(stopEngineButton);

        driveButton = new JButton("Drive");
        driveButton.setFont(new Font("Arial", Font.PLAIN, 15));
        driveButton.setSize(100, 20);
        driveButton.setLocation(270, 450);
        buttonPanel.add(driveButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        //frame.setSize(950, 500);
        frame.setBounds(500, 200, 950, 500);
        frame.setVisible(true);
        frame.add(tablePanel);
        frame.add(titlePanel);
        frame.add(buttonPanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == startEngineButton) {
            //frame.dispose();
            try {
                StartEngine startEngine = new StartEngine();
                System.out.println("Clicked");
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }

        if (e.getSource() == stopEngineButton) {
            //frame.dispose();
            try {
                System.out.println("Clicked");
                StopEngine stopEngine = new StopEngine();
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}

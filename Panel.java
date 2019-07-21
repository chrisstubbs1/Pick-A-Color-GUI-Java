package com.chrisstubbs;

import javax.swing.*;
import java.awt.*;

public class Panel extends JFrame {

    private JButton button;
    private JPanel panel;
    private Color color = Color.BLACK;

    public Panel() {
        super("Color Chooser");

        panel = new JPanel();
        panel.setBackground(color);
        setSize(new Dimension(400, 300));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Choose Color");
        button.addActionListener(
                e -> {
                    color = JColorChooser.showDialog(null, "Pick your color", color);
                    if (color == null)
                        color = Color.black;
                    panel.setBackground(color);
                }
        );

        add(panel, BorderLayout.CENTER);
        add(button, BorderLayout.PAGE_END);
        setVisible(true);
    }

}

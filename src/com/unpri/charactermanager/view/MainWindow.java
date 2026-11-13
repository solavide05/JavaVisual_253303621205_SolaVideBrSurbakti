
package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

    private final ArrayList<Character> characterList;
    private final double averageLevel;

    public MainWindow(
        ArrayList<Character> characterList,
        double averageLevel
    ) {
        super("Character Manager v0.3");

        this.characterList = characterList;
        this.averageLevel = averageLevel;

        initComponents();

        setSize(550, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        JPanel mainPanel =
            new JPanel(new GridLayout(0, 1, 5, 5));

        JLabel titleLabel = new JLabel(
            "Daftar Karakter (" + characterList.size() + ")"
        );

        mainPanel.add(titleLabel);

        for (Character c : characterList) {

            String info =
                c.getName()
                + " | " + c.getType()
                + " | Level: " + c.getLevel();

            mainPanel.add(new JLabel(info));
        }

        JLabel averageLabel = new JLabel(
            "Rata-rata Level: "
            + String.format("%.1f", averageLevel)
        );

        mainPanel.add(averageLabel);

        add(mainPanel);
    }
}

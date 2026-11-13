
package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainWindow extends JFrame {

    private final ArrayList<Character> characterList;
    private final double averageLevel;

    public MainWindow(
            ArrayList<Character> characterList,
            double averageLevel) {

        super("Character Manager v0.4");

        this.characterList = characterList;
        this.averageLevel = averageLevel;

        initComponents();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setMinimumSize(new Dimension(450, 350));
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        JPanel mainPanel = new JPanel(
                new GridLayout(0, 1, 0, 8));

        mainPanel.setBackground(AppTheme.BG_MAIN);
        mainPanel.setBorder(AppTheme.MAIN_PANEL_BORDER);

        // Judul aplikasi
        JLabel titleLabel = new JLabel(
                "DAFTAR KARAKTER (" + characterList.size() + ")",
                SwingConstants.CENTER);

        titleLabel.setFont(AppTheme.FONT_TITLE);
        titleLabel.setForeground(AppTheme.TEXT_MAIN);
        titleLabel.setOpaque(false);

        mainPanel.add(titleLabel);

        // Kartu karakter
        for (Character c : characterList) {
            mainPanel.add(createCharacterLabel(c));
        }

        // Rata-rata level
        JLabel averageLabel = new JLabel(
                "Rata-rata Level: "
                        + String.format("%.1f", averageLevel),
                SwingConstants.CENTER);

        averageLabel.setFont(AppTheme.FONT_MONO);
        averageLabel.setForeground(AppTheme.TEXT_MAIN);

        mainPanel.add(averageLabel);

        add(mainPanel);
    }

    private JLabel createCharacterLabel(Character c) {

        String info = c.getName()
                + " | " + c.getType()
                + " | Level: " + c.getLevel()
                + " | HP: " + c.getHitPoints()
                + " | ATK: " + c.getAttackPower();

        JLabel label = new JLabel(info);

        // Warna kartu sesuai role
        label.setBackground(AppTheme.colorFor(c.getType()));

        // Level tinggi mendapatkan warna emas
        if (c.getLevel() >= AppTheme.HIGH_LEVEL_THRESHOLD) {

            label.setForeground(AppTheme.GOLD);
            label.setFont(AppTheme.FONT_BODY.deriveFont(Font.BOLD));

        } else {

            label.setForeground(AppTheme.TEXT_LIGHT);
            label.setFont(AppTheme.FONT_BODY);
        }

        label.setOpaque(true);
        label.setBorder(AppTheme.CARD_BORDER);

        // Properti tambahan 1: Tooltip
        label.setToolTipText(
                AppTheme.describe(c.getType())
                        + " | HP: " + c.getHitPoints()
                        + " | ATK: " + c.getAttackPower());

        // Properti tambahan 2: Cursor
        label.setCursor(
                Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        return label;
    }
}

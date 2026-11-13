
package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainWindow extends JFrame {

    private final ArrayList<Character> characterList;

    public MainWindow(ArrayList<Character> characterList) {

        super("Character Manager v0.5");

        this.characterList = characterList;

        initComponents();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setMinimumSize(new Dimension(560, 380));
        setLocationRelativeTo(null);
    }

    // =====================================
    // KOMPONEN UTAMA
    // =====================================

    private void initComponents() {

        setLayout(new BorderLayout(12, 12));

        getContentPane().setBackground(AppTheme.BG_MAIN);

        JPanel contentPanel = new JPanel(new BorderLayout(12, 12));
        contentPanel.setBackground(AppTheme.BG_MAIN);
        contentPanel.setBorder(AppTheme.MAIN_PANEL_BORDER);

        contentPanel.add(createHeaderPanel(), BorderLayout.NORTH);
        contentPanel.add(createListArea(), BorderLayout.CENTER);
        contentPanel.add(createLegendPanel(), BorderLayout.EAST);
        contentPanel.add(createStatusPanel(), BorderLayout.SOUTH);

        add(contentPanel, BorderLayout.CENTER);
    }

    // =====================================
    // HEADER DAN PANEL STATISTIK
    // =====================================

    private JPanel createHeaderPanel() {

        JPanel header = new JPanel(new BorderLayout(8, 10));
        header.setBackground(AppTheme.BG_MAIN);

        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.setBackground(AppTheme.BG_MAIN);

        JLabel titleLabel = new JLabel("DAFTAR KARAKTER");
        titleLabel.setFont(AppTheme.FONT_TITLE);
        titleLabel.setForeground(AppTheme.TEXT_MAIN);

        JLabel countLabel = new JLabel(
                "Total: " + characterList.size() + " karakter");

        countLabel.setFont(AppTheme.FONT_BODY);
        countLabel.setForeground(AppTheme.GOLD);

        titlePanel.add(titleLabel, BorderLayout.WEST);
        titlePanel.add(countLabel, BorderLayout.EAST);

        header.add(titlePanel, BorderLayout.NORTH);
        header.add(createStatisticsPanel(), BorderLayout.CENTER);

        return header;
    }

    private JPanel createStatisticsPanel() {

        JPanel stats = new JPanel(new GridLayout(2, 2, 8, 6));
        stats.setBackground(AppTheme.BG_MAIN);
        stats.setBorder(
                BorderFactory.createEmptyBorder(8, 0, 4, 0));

        int highestLevel = 0;
        int totalLevel = 0;

        for (Character c : characterList) {
            totalLevel += c.getLevel();

            if (c.getLevel() > highestLevel) {
                highestLevel = c.getLevel();
            }
        }

        double averageLevel = characterList.isEmpty()
                ? 0.0
                : (double) totalLevel / characterList.size();

        stats.add(createStatLabel(
                "Jumlah karakter: " + characterList.size()));

        stats.add(createStatLabel(
                "Jumlah role: " + CharacterType.values().length));

        stats.add(createStatLabel(
                "Level tertinggi: " + highestLevel));

        stats.add(createStatLabel(
                "Rata-rata level: "
                        + String.format("%.1f", averageLevel)));

        return stats;
    }

    private JLabel createStatLabel(String text) {

        JLabel label = new JLabel(text);
        label.setFont(AppTheme.FONT_MONO);
        label.setForeground(AppTheme.TEXT_MAIN);
        label.setOpaque(true);
        label.setBackground(AppTheme.BG_STATUS);
        label.setBorder(
                BorderFactory.createEmptyBorder(6, 8, 6, 8));

        return label;
    }

    // =====================================
    // DAFTAR KARAKTER DAN SCROLL
    // =====================================

    private JScrollPane createListArea() {

        JPanel cardsPanel = new JPanel(
                new GridLayout(0, 1, 0, 8));

        cardsPanel.setBackground(AppTheme.BG_MAIN);

        for (Character c : characterList) {
            cardsPanel.add(createCharacterLabel(c));
        }

        JPanel holder = new JPanel(new BorderLayout());
        holder.setBackground(AppTheme.BG_MAIN);
        holder.add(cardsPanel, BorderLayout.NORTH);

        JScrollPane scroll = new JScrollPane(holder);

        scroll.setBorder(null);
        scroll.setPreferredSize(new Dimension(420, 280));

        scroll.getViewport().setBackground(AppTheme.BG_MAIN);

        return scroll;
    }

    // =====================================
    // KARTU KARAKTER
    // =====================================

    private JLabel createCharacterLabel(Character c) {

        String info = c.getName()
                + " | " + c.getType()
                + " | Level: " + c.getLevel()
                + " | HP: " + c.getHitPoints()
                + " | ATK: " + c.getAttackPower();

        JLabel label = new JLabel(info);

        label.setBackground(AppTheme.colorFor(c.getType()));

        if (c.getLevel() >= AppTheme.HIGH_LEVEL_THRESHOLD) {

            label.setForeground(AppTheme.GOLD);
            label.setFont(
                    AppTheme.FONT_BODY.deriveFont(Font.BOLD));

        } else {

            label.setForeground(AppTheme.TEXT_LIGHT);
            label.setFont(AppTheme.FONT_BODY);
        }

        label.setOpaque(true);
        label.setBorder(AppTheme.CARD_BORDER);

        label.setToolTipText(
                AppTheme.describe(c.getType())
                        + " | HP: " + c.getHitPoints()
                        + " | ATK: " + c.getAttackPower());

        label.setCursor(
                Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        return label;
    }

    // =====================================
    // LEGENDA ROLE
    // =====================================

    private JPanel createLegendPanel() {

        JPanel legend = new JPanel();

        legend.setLayout(
                new BoxLayout(legend, BoxLayout.Y_AXIS));

        legend.setBackground(AppTheme.BG_STATUS);
        legend.setBorder(
                BorderFactory.createEmptyBorder(12, 12, 12, 12));

        JLabel title = new JLabel("LEGENDA ROLE");
        title.setFont(AppTheme.FONT_BODY.deriveFont(Font.BOLD));
        title.setForeground(AppTheme.GOLD);
        title.setAlignmentX(Component.LEFT_ALIGNMENT);

        legend.add(title);
        legend.add(Box.createVerticalStrut(12));

        for (CharacterType type : CharacterType.values()) {

            JLabel roleLabel = new JLabel(type.toString());

            roleLabel.setFont(AppTheme.FONT_BODY);
            roleLabel.setForeground(AppTheme.TEXT_LIGHT);
            roleLabel.setBackground(AppTheme.colorFor(type));
            roleLabel.setOpaque(true);
            roleLabel.setBorder(
                    BorderFactory.createEmptyBorder(6, 10, 6, 10));

            roleLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

            legend.add(roleLabel);
            legend.add(Box.createVerticalStrut(8));
        }

        legend.add(Box.createVerticalGlue());

        legend.setPreferredSize(new Dimension(150, 200));

        return legend;
    }

    // =====================================
    // STATUS BAR
    // =====================================

    private JPanel createStatusPanel() {

        JPanel status = new JPanel(new BorderLayout());

        status.setBackground(AppTheme.BG_STATUS);
        status.setBorder(
                BorderFactory.createEmptyBorder(8, 12, 8, 12));

        JLabel statusLabel = new JLabel(
                "Total: " + characterList.size()
                        + " karakter | Siap");

        statusLabel.setFont(AppTheme.FONT_MONO);
        statusLabel.setForeground(AppTheme.TEXT_MUTED);

        JLabel versionLabel = new JLabel("v0.5");

        versionLabel.setFont(AppTheme.FONT_MONO);
        versionLabel.setForeground(AppTheme.TEXT_MUTED);

        status.add(statusLabel, BorderLayout.WEST);
        status.add(versionLabel, BorderLayout.EAST);

        return status;
    }
}

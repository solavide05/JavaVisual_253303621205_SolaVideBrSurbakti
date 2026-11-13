
package com.unpri.charactermanager.model;

public class Character {

    private int id;
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;
    private int mana;

    private static int totalCharacterCreated = 0;

    // Constructor karakter baru
    public Character(String name, CharacterType type, int level) {
        if (level < 1) {
            throw new IllegalArgumentException("Level minimal 1.");
        }

        this.id = 0;
        this.name = name;
        this.type = type;
        this.level = level;
        this.hitPoints = 100 + (level * 10);
        this.attackPower = 10 + (level * 5);
        this.mana = 0;

        totalCharacterCreated++;
    }

    // Constructor untuk data dari database
    public Character(int id, String name, CharacterType type,
                     int level, int hitPoints, int attackPower) {
        if (level < 1) {
            throw new IllegalArgumentException("Level minimal 1.");
        }

        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;
        this.hitPoints = hitPoints;
        this.attackPower = attackPower;
        this.mana = 0;

        totalCharacterCreated++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException("Level minimal 1.");
        }

        this.level = level;
        this.hitPoints = 100 + (level * 10);
        this.attackPower = 10 + (level * 5);
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException("Mana tidak boleh negatif.");
        }
        this.mana = mana;
    }

    public boolean isAlive() {
        return hitPoints > 0;
    }

    public static int getTotalCharacterCreated() {
        return totalCharacterCreated;
    }

    // Membandingkan karakter berdasarkan nama
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Character)) {
            return false;
        }

        Character other = (Character) obj;

        if (name == null) {
            return other.name == null;
        }

        return name.equals(other.name);
    }

    // hashCode konsisten dengan equals
    @Override
    public int hashCode() {
        return name == null ? 0 : name.hashCode();
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", level=" + level +
                ", hitPoints=" + hitPoints +
                ", attackPower=" + attackPower +
                ", mana=" + mana +
                '}';
    }
}

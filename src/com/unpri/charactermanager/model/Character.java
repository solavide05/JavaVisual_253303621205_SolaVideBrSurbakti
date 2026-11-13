
package com.unpri.charactermanager.model;

public class Character {

    // Atribut karakter
    private int id;
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;

    // Atribut tambahan Mini-Challenge
    private int mana;

    // Constructor pertama
    public Character(String name, CharacterType type, int level) {
        this.id = 0;
        this.name = name;
        this.type = type;
        setLevel(level);
        this.mana = 0;
    }

    // Constructor kedua
    public Character(int id, String name, CharacterType type,
                     int level, int hitPoints, int attackPower) {

        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;
        this.hitPoints = hitPoints;
        this.attackPower = attackPower;
        this.mana = 0;

        if (level < 1) {
            throw new IllegalArgumentException(
                "Level harus minimal 1."
            );
        }
    }

    // Menghitung HP berdasarkan level
    private int calculateBaseHP() {
        return 100 + (level * 10);
    }

    // Menghitung attack berdasarkan level
    private int calculateBaseAttack() {
        return 10 + (level * 5);
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CharacterType getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getMana() {
        return mana;
    }

    // Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Nama tidak boleh kosong."
            );
        }
        this.name = name;
    }

    public void setType(CharacterType type) {
        if (type == null) {
            throw new IllegalArgumentException(
                "Tipe karakter tidak boleh kosong."
            );
        }
        this.type = type;
    }

    public void setLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException(
                "Level harus minimal 1."
            );
        }

        this.level = level;
        this.hitPoints = calculateBaseHP();
        this.attackPower = calculateBaseAttack();
    }

    public void setHitPoints(int hitPoints) {
        if (hitPoints < 0) {
            throw new IllegalArgumentException(
                "HP tidak boleh negatif."
            );
        }
        this.hitPoints = hitPoints;
    }

    public void setAttackPower(int attackPower) {
        if (attackPower < 0) {
            throw new IllegalArgumentException(
                "Attack Power tidak boleh negatif."
            );
        }
        this.attackPower = attackPower;
    }

    // Setter Mini-Challenge
    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException(
                "Mana tidak boleh negatif."
            );
        }
        this.mana = mana;
    }

    // Memeriksa apakah karakter masih hidup
    public boolean isAlive() {
        return hitPoints > 0;
    }

    // Menampilkan informasi karakter
    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", level=" + level +
                ", hp=" + hitPoints +
                ", atk=" + attackPower +
                ", mana=" + mana +
                '}';
    }
}

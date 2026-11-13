
package com.unpri.charactermanager.model;

import java.util.Objects;

public class Character {

    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;

    public Character(String name, CharacterType type, int level) {
        if (level < 1) {
            throw new IllegalArgumentException("Level minimal 1");
        }

        this.name = name;
        this.type = type;
        this.level = level;
        this.hitPoints = 100 + (level * 10);
        this.attackPower = 10 + (level * 2);
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Character)) return false;

        Character other = (Character) obj;
        return Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

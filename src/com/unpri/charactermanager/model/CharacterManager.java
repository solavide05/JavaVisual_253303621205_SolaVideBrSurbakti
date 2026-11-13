
package com.unpri.charactermanager.model;

import java.util.ArrayList;

public class CharacterManager {

    private final ArrayList<Character> characterList;

    public CharacterManager() {
        characterList = new ArrayList<>();
    }

    // Menambahkan karakter tanpa nama duplikat
    public boolean addCharacter(Character character) {
        if (character == null) {
            return false;
        }

        if (findByName(character.getName()) != null) {
            return false;
        }

        characterList.add(character);
        return true;
    }

    // Mencari karakter berdasarkan nama
    public Character findByName(String name) {
        if (name == null) {
            return null;
        }

        for (Character character : characterList) {
            if (name.equals(character.getName())) {
                return character;
            }
        }

        return null;
    }

    // Menghapus karakter
    public boolean removeCharacter(String name) {
        Character character = findByName(name);

        if (character == null) {
            return false;
        }

        return characterList.remove(character);
    }

    // Menghitung total karakter
    public int getTotalCharacters() {
        return characterList.size();
    }

    // Mengembalikan defensive copy
    public ArrayList<Character> getAllCharacters() {
        return new ArrayList<>(characterList);
    }

    // Mini challenge: rata-rata level
    public double getAverageLevel() {
        if (characterList.isEmpty()) {
            return 0;
        }

        int total = 0;

        for (Character character : characterList) {
            total += character.getLevel();
        }

        return (double) total / characterList.size();
    }

    // Mini challenge: mencari berdasarkan tipe
    public ArrayList<Character> findByType(CharacterType type) {
        ArrayList<Character> result = new ArrayList<>();

        for (Character character : characterList) {
            if (character.getType() == type) {
                result.add(character);
            }
        }

        return result;
    }

    /**
     * Menghitung jumlah karakter berdasarkan tipe.
     * Fitur tambahan untuk membantu analisis karakter.
     *
     * @param type tipe karakter yang akan dihitung
     * @return jumlah karakter dengan tipe tersebut
     */
    public int countByType(CharacterType type) {
        int count = 0;

        for (Character character : characterList) {
            if (character.getType() == type) {
                count++;
            }
        }

        return count;
    }
}

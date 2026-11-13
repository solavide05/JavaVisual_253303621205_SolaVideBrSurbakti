
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("       CHARACTER MANAGER TP3");
        System.out.println("==================================");

        // Membuat tiga karakter sesuai materi AP3
        Character hero = new Character(
            "Arjuna", CharacterType.WARRIOR, 5
        );

        Character mage = new Character(
            "Merlin", CharacterType.MAGE, 3
        );

        Character archer = new Character(
            "Athena", CharacterType.ARCHER, 4
        );

        // Menampilkan data awal
        System.out.println("\n--- DATA KARAKTER AWAL ---");
        System.out.println(hero);
        System.out.println(mage);
        System.out.println(archer);

        // Menaikkan level karakter
        System.out.println("\n--- LEVEL UP ---");

        hero.setLevel(hero.getLevel() + 1);

        System.out.println("Nama       : " + hero.getName());
        System.out.println("Level Baru : " + hero.getLevel());
        System.out.println("HP Baru    : " + hero.getHitPoints());
        System.out.println("Attack     : " + hero.getAttackPower());

        // MINI-CHALLENGE: MANA DAN ISALIVE
        System.out.println("\n--- MINI-CHALLENGE ---");

        Character newCharacter = new Character(
            "Gandalf", CharacterType.MAGE, 7
        );

        newCharacter.setMana(150);

        System.out.println("Karakter       : " + newCharacter);
        System.out.println("Mana           : " + newCharacter.getMana());
        System.out.println("Apakah hidup?  " + newCharacter.isAlive());

        // Menguji kondisi HP nol
        newCharacter.setHitPoints(0);

        System.out.println(
            "Hidup setelah HP menjadi 0? "
            + newCharacter.isAlive()
        );

        System.out.println("\n==================================");
        System.out.println("       PROGRAM SELESAI");
        System.out.println("==================================");
    }
}

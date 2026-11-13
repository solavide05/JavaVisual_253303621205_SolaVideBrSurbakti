
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        System.out.println("=== CHARACTER MANAGER TP5 ===");

        // Menambahkan karakter
        System.out.println("\n--- Tambah Karakter ---");

        System.out.println(manager.addCharacter(
                new Character("Arjuna", CharacterType.WARRIOR, 5)));

        System.out.println(manager.addCharacter(
                new Character("Merlin", CharacterType.MAGE, 3)));

        System.out.println(manager.addCharacter(
                new Character("Athena", CharacterType.ARCHER, 4)));

        // Menguji nama duplikat
        System.out.println("\n--- Uji Duplikat ---");

        System.out.println(manager.addCharacter(
                new Character("Arjuna", CharacterType.HEALER, 1)));

        // Mencari karakter
        System.out.println("\n--- Pencarian ---");

        System.out.println("Merlin: " + manager.findByName("Merlin"));
        System.out.println("Zeus: " + manager.findByName("Zeus"));

        // Menghapus karakter
        System.out.println("\n--- Hapus Karakter ---");

        System.out.println("Athena dihapus: "
                + manager.removeCharacter("Athena"));

        // Menampilkan karakter
        System.out.println("\n--- Daftar Karakter ---");

        for (Character character : manager.getAllCharacters()) {
            System.out.println(character);
        }

        // Total karakter dan rata-rata level
        System.out.println("\nTotal karakter: "
                + manager.getTotalCharacters());

        System.out.println("Rata-rata level: "
                + manager.getAverageLevel());

        // Mini challenge: findByType
        System.out.println("\n--- Karakter WARRIOR ---");

        ArrayList<Character> warriors =
                manager.findByType(CharacterType.WARRIOR);

        for (Character character : warriors) {
            System.out.println(character.getName());
        }

        // Fitur tambahan countByType
        System.out.println("\nJumlah WARRIOR: "
                + manager.countByType(CharacterType.WARRIOR));

        // Uji reference
        System.out.println("\n--- Uji Reference ---");

        Character asli = manager.findByName("Arjuna");
        Character referensi = asli;

        referensi.setLevel(99);

        System.out.println("Level asli: " + asli.getLevel());
        System.out.println("Apakah referensinya sama? "
                + (asli == referensi));

        // Uji defensive copy
        System.out.println("\n--- Uji Defensive Copy ---");

        ArrayList<Character> salinan = manager.getAllCharacters();

        salinan.add(new Character(
                "Hantu", CharacterType.MAGE, 1));

        System.out.println("Jumlah manager: "
                + manager.getTotalCharacters());

        System.out.println("Jumlah salinan: "
                + salinan.size());

        // Uji static
        System.out.println("\nTotal objek yang dibuat: "
                + Character.getTotalCharacterCreated());

        // Uji equals
        System.out.println("\n--- Uji Equals ---");

        Character a = new Character(
                "Arjuna", CharacterType.WARRIOR, 5);

        Character b = new Character(
                "Arjuna", CharacterType.MAGE, 2);

        System.out.println("Apakah a.equals(b)? " + a.equals(b));
    }
}

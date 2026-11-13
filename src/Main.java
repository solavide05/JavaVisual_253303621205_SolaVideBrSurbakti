
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        // Tiga karakter dari tugas sebelumnya
        manager.addCharacter(
            new Character("Arjuna", CharacterType.WARRIOR, 5)
        );

        manager.addCharacter(
            new Character("Merlin", CharacterType.MAGE, 3)
        );

        manager.addCharacter(
            new Character("Athena", CharacterType.ARCHER, 4)
        );

        // Dua karakter tambahan untuk TP8
        manager.addCharacter(
            new Character("Lancelot", CharacterType.WARRIOR, 7)
        );

        manager.addCharacter(
            new Character("Freya", CharacterType.HEALER, 6)
        );

        // Mengambil data dari Model
        ArrayList<Character> characterList =
            manager.getAllCharacters();

        double averageLevel =
            manager.getAverageLevel();

        // Menjalankan GUI melalui Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {

            MainWindow window =
                new MainWindow(characterList, averageLevel);

            window.setVisible(true);
        });
    }
}

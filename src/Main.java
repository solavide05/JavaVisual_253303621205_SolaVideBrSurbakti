
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        // Delapan karakter untuk TP12 AP16

        manager.addCharacter(
                new Character("Arjuna", CharacterType.WARRIOR, 5)
        );

        manager.addCharacter(
                new Character("Merlin", CharacterType.MAGE, 3)
        );

        manager.addCharacter(
                new Character("Athena", CharacterType.ARCHER, 4)
        );

        manager.addCharacter(
                new Character("Lancelot", CharacterType.WARRIOR, 7)
        );

        manager.addCharacter(
                new Character("Freya", CharacterType.HEALER, 6)
        );

        manager.addCharacter(
                new Character("Gandalf", CharacterType.MAGE, 9)
        );

        manager.addCharacter(
                new Character("Robin", CharacterType.ARCHER, 2)
        );

        manager.addCharacter(
                new Character("Leonidas", CharacterType.WARRIOR, 10)
        );

        // Mengambil data karakter dari Model
        ArrayList<Character> characterList =
                manager.getAllCharacters();

        // Menjalankan GUI melalui Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {

            MainWindow window =
                    new MainWindow(characterList);

            window.setVisible(true);
        });
    }
}

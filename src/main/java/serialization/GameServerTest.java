package serialization;

import java.io.*;

public class GameServerTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Elf", new String[]{"bow", "sword", "brass knuckles"});
        GameCharacter two = new GameCharacter(200, "Dwarf", new String[]{"bare hands", "big ax"});
        GameCharacter three = new GameCharacter(120, "Wizard", new String[]{"spells", "invisibility"});

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        one = null;
        two = null;
        three = null;

        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter) os.readObject();
            GameCharacter twoRestore = (GameCharacter) os.readObject();
            GameCharacter threeRestore = (GameCharacter) os.readObject();

            System.out.println("Type of first:" + oneRestore.getType());
            System.out.println("Type of second:" + twoRestore.getType());
            System.out.println("Type of third:" + threeRestore.getType());
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}

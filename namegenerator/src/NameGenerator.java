/*
Soundcloud Rapper Name Generator
Returns complete name
 */

import java.util.Random;

public class NameGenerator {

    private static String[] Beginning = { "Lil " , "lil ", "Gang ", "White ", "Old ",
            "Yung ", "XXX", "Smoke" , "Ugly ", "Nasty ", "Big ", "21", "Lean ", "Polo"};
    private static String[] Middle = { "Air", "Tril", "Gang", "Ghost", "Sip", "Clo",
            "Red", "Mask", "Pump", "Gat", "Murder", "Lock", "Cree", "Mur", "Zed", "Slime",
            "Kid", "Boy", "Skee", "Purp", "Daddy", " Rich" };
    private static String[] End = { "D", "baby", "trigger", "juice",
            "tron", "med", "jay", "sticky", "mane", "mur", "weed", "candy", " Choppa"," WRLD", " Jesus" };

    private static Random rand = new Random();

    public static String generateName(int totalNames) {
        String names = "";
        for (int i = 0; i < totalNames; i++){
            names += Beginning[rand.nextInt(Beginning.length)] +
                    Middle[rand.nextInt(Middle.length)]+
                    End[rand.nextInt(End.length)];
            names += "\n";
        }

        return names;
    }

}
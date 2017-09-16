import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Michael Hailemariam on 9/15/2017.
 */
public class Demo {
    /**
     * display data types
     * @param args
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a boolean value");
        boolean booleanVar = keyboard.nextBoolean();
        System.out.println("Enter a character");
        char charVar = keyboard.next().charAt(0);
        JOptionPane.showMessageDialog(null, "You have just enetered a boolean value of " + booleanVar + "\n"
                + "You have just enetered a character value of " + charVar);
    }
}
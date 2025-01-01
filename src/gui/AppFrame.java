package gui;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {

    public AppFrame() {
        super();
        setSize(420,600); // sets x and y dimension respectively
        setTitle("Contact Manager"); // sets window title
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // by default, it is HIDE_ON_CLOSE
        setResizable(false); // prevents this from being resized
        setVisible(true); // make this visible
        setLayout(null);
        ImageIcon image = new ImageIcon("logo.png");
        setIconImage(image.getImage()); // sets window icon
        getContentPane().setBackground(new Color(13,17,23)); // sets frame bg color

        // Test
        System.out.println("(i) Main Frame displayed!");
    }
}

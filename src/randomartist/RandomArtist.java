package randomartist;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RandomArtist {
    JFrame frame;
    Cara cara;
    JButton button;
    
    RandomArtist(){
        SwingUtilities.invokeLater(new Runnable(){
        @Override
            public void run(){
                cara = new Cara();
                frame = new JFrame("Computer Assisted Random Artist");
                frame.add(cara, BorderLayout.CENTER);
                button = new JButton("regenerate");
                button.addActionListener(cara);
                frame.add(button, BorderLayout.SOUTH);
                frame.pack();
                cara.regenerate();
                frame.setVisible(true);
            }
        });
    }
    
    public static void main(String[] args) {
        new RandomArtist();
    }

}

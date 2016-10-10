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
                cara = new Cara();                                              //creating the panel
                frame = new JFrame("Computer Assisted Random Artist");          //creating the frame header
                frame.add(cara, BorderLayout.CENTER);
                button = new JButton("regenerate");                             //regenerate button
                button.addActionListener(cara);                                 //Action listener of button
                frame.add(button, BorderLayout.SOUTH);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

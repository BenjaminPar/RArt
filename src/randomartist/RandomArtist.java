package randomartist;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javax.swing.*;


public class RandomArtist {
    JFrame frame;
    Cara cara;
    JButton button;
    Graphics g;
   // MyHandler handler = new MyHandler();
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
               
                frame.setVisible(true);
            }  
        });
    }
    
    public static void main(String[] args) {
        new RandomArtist();
    }

}

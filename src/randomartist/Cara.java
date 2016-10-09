package randomartist;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;



public class Cara extends JPanel implements ActionListener{
    
    
    
    ArrayList shapeList = new ArrayList();                //Adding the different shape classes
    
    
    
    public Cara(){                                        //Creating the dimensions
        setPreferredSize(new Dimension(400, 300));        //of the panel
    }
    
    
    protected void paintComponent(Graphics g, int n){
        super.paintComponent(g);                    //Clears the background
        for(int i = 0; i < n; i++){
            add(new RandomShape());
        }
           
        
    }


    public void actionPerformed(ActionEvent e){
        //int n = random.nextInt(2);                      //random int is generated which will
        //switch(n){                                      //set the number of shapes generated once
        //    case 0: RandomCircle;                      //regerenate button is pressed
        //    case 1: RandomSquare;
        //}
        
        
        
        regenerate();
        repaint();
    }
    
    public void regenerate(){
        //this.paintComponent(g, WIDTH);                               //clear the shapes list
                                        //create new random shapes
                                       //should call method draw and RandomShape from the separate class
    }
    
    public void repaint(){              //regenerates a new colour by calling RandomShape
    
    }

}

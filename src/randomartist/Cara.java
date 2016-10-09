package randomartist;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.Graphics2D; 


public class Cara extends JPanel implements ActionListener{
    static Random random = new Random();
    
    
    ArrayList shapeList = new ArrayList();                //Adding the different shape classes
    
    
    
    public Cara(){                                        //Creating the dimensions                                 
                                                          //of the panel
        setPreferredSize(new Dimension(400, 300));    
    }
    
    
    protected void paintComponent(Graphics g, int n){
        super.paintComponent(g);                    //Clears the background
        Graphics2D g2 = (Graphics2D) g;
        for(int i = 0; i < n; i++){
            //g2.draw(shapeList<i>);
        }
           
        
    }

    @Override
    public void actionPerformed(ActionEvent e){
        int n = random.nextInt(2);                      //random int is generated which will
        switch(n){                                      //set the number of shapes generated once
            case 0: RandomCircle;                      //regerenate button is pressed
            case 1: RandomSquare;
            
            
        }
        
        
        
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

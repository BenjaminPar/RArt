package randomartist;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.util.ArrayList;
        

public class Cara extends JPanel implements ActionListener{
    Random random = new Random();
    priavte List<RandomShape> shapes;
    
    public Cara(){                                  //Creating the dimensions
        setPreferredSize(new Dimension(400, 300));  //of the panel
        
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);                    //Clears the background
        for (int i = 0; i < shapeList.size(); i++) {//loop that will generate shapes by calling each functions
            
        }
           
        
    }

    @Override
    public void actionPerformed(ActionEvent e){
        regenerate();
        repaint();
    }

    public void regenerate(){
                                        //clear the shapes list
                                        //create new random shapes
    }


}

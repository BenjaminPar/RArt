package randomartist;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import javax.swing.*;
        

public class Cara extends JPanel implements ActionListener{
    Random random = new Random();
    private List<RandomShape> shapeList;
    
    public Cara(){                                  //Creating the dimensions
        setPreferredSize(new Dimension(400, 300));  //of the panel
        
    }
    
    @Override
    protected void paintComponent(Graphics g, int n){
        super.paintComponent(g);                    //Clears the background
        if  (n < shapeList.size()){
            shapeList.get(n).actionPerformed(n);
            paintComponent(g, n+1);  
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
                                        //should call method draw and RandomShape from the separate class
    }


}

package randomartist;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.util.ArrayList;
        

public class Cara extends JPanel implements ActionListener{
    Random random = new Random();
    ArrayList shapeList = new ArrayList();
    
    public Cara(){
        setPreferredSize(new Dimension(400, 300));
        
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);                    //Clears the background
        for (int i = 0; i < shapeList.size(); i++) {
            actionPerformed();
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

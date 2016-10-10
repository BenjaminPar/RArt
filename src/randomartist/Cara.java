package randomartist;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Cara extends JPanel implements ActionListener{
    
    private static ArrayList<RandomShape> shapeList;                //Adding the different shape classes
    
    public Cara(){                                        //Creating the dimensions
        setPreferredSize(new Dimension(400, 300));        //of the panel
        shapeList = new ArrayList<RandomShape>();
    }
    
    
    protected void paintComponent(Graphics g, int n){
        shapeList.clear();                      //clear the initaly created shapes
        Random number = new Random();
        
        
        RandomShape shape = null;
        int generatedShape;
        
        for (int i = 0; i < shapeList.size(); i++) {
            generatedShape = number.nextInt(shapeList.size());
            
            switch (generatedShape){
                case 0: shape = new RandomCircle(300,400);
                break;
            
                case 1: shape = new RandomSquare(300, 400);
                break;
            
            }                    
        }
           
        
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.equals(true)){
            regenerate();
        }
    }
    
    public void regenerate(){
        paintComponent();
    }
    
    public void repaint(){              //regenerates a new colour by calling RandomShape
        
    }


}

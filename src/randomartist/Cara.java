package randomartist;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.*;
import javax.swing.*;

public class Cara extends JPanel implements ActionListener{
    
    private static ArrayList<RandomShape> shapeList;                //Adding the different shape classes
    public RandomShape firstshape;
    public RandomShape secondshape;
    public Cara(){                                        //Creating the dimensions
        setPreferredSize(new Dimension(400, 300));        //of the panel
        shapeList = new ArrayList<RandomShape>();
        firstshape = new RandomCircle(400,300);
        secondshape = new RandomSquare(400,300);
        shapeList.add(firstshape);
        shapeList.add(secondshape);
//        shapeList.add(new RandomTriangle(400, 300));
    }
    
    
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);                      //clear the initaly created shapes
        Random number = new Random();
        
        
        RandomShape shape = null;
        int generatedShape;
        
        for (int i = 0; i < shapeList.size(); i++) {
            
            switch (i){
                case 0: shape = shapeList.get(i);
                   // shape = new RandomCircle(300,400);
                shape.draw(g);
                break;
            
                case 1: shape = shapeList.get(i);
                   // shape = new RandomSquare(300, 400);
                shape.draw(g);
                break;
            
            }                    
        }
           
        
    }

    @Override
    public void actionPerformed(ActionEvent e){
        regenerate();
        repaint();
    }
    
    public void regenerate(){
        shapeList.clear();
        shapeList.add(new RandomCircle(300,400));
        shapeList.add(new RandomSquare(300,400));
        
        
    }
    
    


}

package randomartist;

import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

abstract class RandomShape extends Cara{
    static Random randomD = new Random();
    ArrayList shapeList = new ArrayList();
    
    
    
    
    
    
    protected Color color;              //color used for the shape
    
    protected int x, y;                 //position of shape
    
    public RandomShape(int maxX, int maxY){
        x = randomD.nextInt(maxX);
        y = randomD.nextInt(maxY);
                                        //initialize to a random color
        
        
        
    }
    
    abstract void draw(Graphics g);
        
        
}

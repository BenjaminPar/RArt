package randomartist;

import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;

abstract class RandomShape{
    static Random randomD = new Random();   //randomizer for dimensions

    protected Color color;                  //color used for the shape
    float r = randomD.nextFloat();
    float g = randomD.nextFloat();
    float b = randomD.nextFloat();
    
    
    
    protected int x, y;                     //position of shape
    
    public RandomShape(int maxX, int maxY){
        x = randomD.nextInt(maxX);
        y = randomD.nextInt(maxY);
        color = new Color(r,g,b);                                  //initialize to a random color
        
        
        
    }
    
    abstract void draw(Graphics g);
        this.RandomShape(this.color, this.maxX, this.maxY, <random> );
        
    }
.
        
   }

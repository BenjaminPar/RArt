package randomartist;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

abstract class RandomShape{
    
    static Random random = new Random();

                                            //randomizer for dimensions
    protected Color color;                  //color used for the shape
    int r = random.nextInt(255);
    int g = random.nextInt(255);
    int b = random.nextInt(255);
    
    protected int x, y;                     //position of shape

    public RandomShape(int maxX, int maxY){
        x = random.nextInt(maxX);
        y = random.nextInt(maxY);
        color = new Color(r,g,b);           //initialize to a random color   
    }
   
    abstract public void draw(Graphics g);   
}

        
   

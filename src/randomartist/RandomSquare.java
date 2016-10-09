package randomartist;

import java.awt.Graphics;
import java.util.Random;

class RandomSquare extends RandomShape {
    protected int lineLength;
    protected boolean fill;
    
    Random randomS = new Random();
    
    
    public RandomSquare (int maxX, int maxY) {
        super(maxX, maxY);
        lineLength = randomS.nextInt(maxX);
        fill = randomS.nextBoolean();
    }
    
    void draw(Graphics g) {
        g.setColor(color);
        if(fill){
            g.fillRect(x, y, lineLength, lineLength);
        }
        else{
            g.drawRect(x, y, lineLength, lineLength);
        }
        
    }
    
    
}

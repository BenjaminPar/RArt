package randomartist;

import java.awt.Graphics;
import java.util.Random;

class RandomCircle extends RandomShape {
    protected int radius;
    protected boolean fill;
    
    Random randomC = new Random();
    
    
    public RandomCircle (int maxX, int maxY){
        super(maxX, maxY);
        radius = randomC.nextInt(maxX/4);
        fill = randomC.nextBoolean();
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        if(fill){
            g.fillArc(x, y, radius, radius, 0, 360);
        }
        else{
            g.drawArc(x, y, radius, radius, 0, 360);
        }
    }  
}

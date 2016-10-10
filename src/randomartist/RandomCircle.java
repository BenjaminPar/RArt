package randomartist;

import java.awt.Graphics;

class RandomCircle extends RandomShape {
    protected int radius;
    protected boolean fill;
    
    
    
    
    public RandomCircle (int maxX, int maxY){
        super(maxX, maxY);
        radius = random.nextInt(maxX/4);
        fill = random.nextBoolean();
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        if(fill){
            g.fillArc(x, y, radius, radius, 0, 360);
        }
        else{
            g.drawArc(x, y, radius, radius, 0, 360);
        }
    }  
}

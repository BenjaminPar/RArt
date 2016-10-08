package randomartist;

import java.awt.Graphics;


class RandomSquare extends RandomShape {
    protected int lineLength;
    protected boolean fill;
    
    
    public randomSquare (int maxX, int maxY) {
        super(maxX, maxY);
        lineLength = random.nextInt(maxX);
        fill = random.nextBoolean();
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

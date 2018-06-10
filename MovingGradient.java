//Dongho Lim, dlim057, this is the MovingGradient class.

import java.awt.*;

public class MovingGradient extends MovingRectangle {

    public MovingGradient(){
        super();
    }

    public MovingGradient(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, int pt){
        super(x, y, w, h, mw, mh, bc, fc, pt);
    }

    public void draw(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        Color startColor = borderColor;
        Color endColor = fillColor;
        GradientPaint gradient = new GradientPaint(topLeft.x, topLeft.y, startColor, topLeft.x + width, topLeft.y +height, endColor);
        g2d.setPaint(gradient);
        g2d.drawRect(topLeft.x,topLeft.y,width,height);
        g2d.fillRect(topLeft.x,topLeft.y,width,height);

        drawHandles(g);

    }
}

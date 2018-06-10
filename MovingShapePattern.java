//Dongho Lim, dlim057, this is the MovingShapePattern class.

import java.awt.*;

import static java.awt.Color.black;
import static java.awt.Color.red;
import static java.awt.Color.white;

public class MovingShapePattern extends MovingShape {

    public MovingShapePattern(){
        super();
    }

    public MovingShapePattern(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, int pt){
        super(x, y, w ,h, mw, mh, bc, fc, pt);
    }

    public void draw(Graphics g){
        int xdiff;
        int ydiff;
        xdiff = width / 8;
        ydiff = height / 8;
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.magenta);
        g2d.fillArc(topLeft.x, topLeft.y, width, height, 0, 180);
        g2d.setColor(Color.blue);
        g2d.fillArc(topLeft.x + xdiff/2, topLeft.y + ydiff/2, width - xdiff, height - ydiff, 0, 180);
        g2d.setColor(Color.cyan);
        g2d.fillArc(topLeft.x + xdiff, topLeft.y + ydiff, width - xdiff *2, height - ydiff *2, 0, 180);
        g2d.setColor(Color.green);
        g2d.fillArc(topLeft.x + xdiff *3/2, topLeft.y + ydiff * 3/2, width - xdiff *3, height - ydiff *3, 0, 180);
        g2d.setColor(Color.yellow);
        g2d.fillArc(topLeft.x + xdiff *2, topLeft.y + ydiff * 2, width - xdiff *4, height - ydiff *4, 0, 180);
        g2d.setColor(Color.orange);
        g2d.fillArc(topLeft.x + xdiff *5/2, topLeft.y + ydiff * 5/2, width - xdiff *5, height - ydiff *5, 0, 180);
        g2d.setColor(Color.red);
        g2d.fillArc(topLeft.x + xdiff *3, topLeft.y + ydiff * 3, width - xdiff *6, height - ydiff *6, 0, 180);
        g2d.setColor(Color.white);
        g2d.fillArc(topLeft.x + xdiff *7/2, topLeft.y + ydiff * 7/2, width - xdiff *7, height - ydiff *7, 0, 180);

        drawHandles(g);

    }

    public boolean contains(Point mousePt){
        double dx;
        double dy;
        Point EndPt = new Point(topLeft.x + width, topLeft.y + height);
        dx = (2 * mousePt.x - topLeft.x - EndPt.x) / (double) width;
        dy = (2* mousePt.y - topLeft.y - EndPt.y) / (double) height;
        return dx * dx + dy * dy < 1.0;
    }

    public void drawHandles(Graphics g) {
        // if the shape is selected, then draw the handles
        if (isSelected()) {
            g.setColor(Color.black);
            g.fillRect(topLeft.x -2, topLeft.y-2, 4, 4);
            g.fillRect(topLeft.x + width -2, topLeft.y + height/2 -2, 4, 4);
            g.fillRect(topLeft.x -2, topLeft.y + height/2 -2, 4, 4);
            g.fillRect(topLeft.x + width -2, topLeft.y-2, 4, 4);
        }
    }

}

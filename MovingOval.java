//Dongho Lim, dlim057, this is the MovingOval class.

import java.awt.*;

public class MovingOval extends MovingShape {

    public MovingOval(){
        super();
    }

    public MovingOval(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, int pt){
        super(x, y, w, h, mw, mh, bc, fc, pt);
    }

    public void draw(Graphics g){

        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(fillColor);
        g2d.fillOval(topLeft.x,topLeft.y,width,height);
        g2d.setPaint(borderColor);
        g2d.drawOval(topLeft.x,topLeft.y,width,height);

        drawHandles(g);
    }

    public boolean contains(Point mousePt){
        double dx;
        double dy;
        Point EndPt = new Point(topLeft.x + width, topLeft.y + height);
        dx = (2 * mousePt.x - topLeft.x - EndPt.x) / (double) width;
        dy = (2 * mousePt.y - topLeft.y - EndPt.y) / (double) height;
        return dx * dx + dy * dy < 1.0;
    }
}

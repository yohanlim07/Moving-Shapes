//Dongho Lim, dlim057, this is the MovingRectangle class.

import java.awt.*;

public class MovingRectangle extends MovingShape {

    public MovingRectangle() {
        super();
    }

    public MovingRectangle(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, int pt) {
        super(x, y, w, h, mw, mh, bc, fc, pt);
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(fillColor);
        g2d.fillRect(topLeft.x, topLeft.y, width, height);
        g2d.setPaint(borderColor);
        g2d.drawRect(topLeft.x, topLeft.y, width, height);

        drawHandles(g);

    }

    public boolean contains(Point mousePt) {
        return(topLeft.x <= mousePt.x && topLeft.y <= mousePt.y && topLeft.y + height >= mousePt.y && topLeft.x + width >= mousePt.x);
    }
}
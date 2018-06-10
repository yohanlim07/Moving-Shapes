//Dongho Lim, dlim057, this is the MovingChecker class.

import java.awt.*;
import java.util.Random;

public class MovingChecker extends MovingRectangle{
    Random rand = new Random();
    int xNumBlock = rand.nextInt(6) + 2;
    int yNumBlock = rand. nextInt(6) + 2;
    int wPerCheck = width/xNumBlock;
    int hPerCheck = height / yNumBlock;

    public MovingChecker(){
        super();
    }

    public MovingChecker(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, int pt){
        super(x, y, w ,h, mw, mh, bc, fc, pt);
    }

    public void draw(Graphics g){

        boolean firstIsFilled;
        boolean isFilled;
        firstIsFilled = true;

        Graphics2D g2d = (Graphics2D) g;

        Point checkPt = new Point(topLeft.x, topLeft.y);

        for(int n = 0; n < yNumBlock; n++){
            checkPt.x = topLeft.x;
            isFilled = firstIsFilled;
            for(int m = 0; m < xNumBlock; m++){
                if(isFilled){
                    g2d.setPaint(fillColor);
                    g2d.fillRect(checkPt.x,checkPt.y,wPerCheck,hPerCheck);
                }
                else{
                    g2d.setPaint(borderColor);
                    g2d.fillRect(checkPt.x,checkPt.y,wPerCheck,hPerCheck);
                }
                checkPt.x += wPerCheck;
                isFilled = !isFilled;
            }
            checkPt.y += hPerCheck;
            firstIsFilled = !firstIsFilled;
        }

        drawHandles(g);

    }
}

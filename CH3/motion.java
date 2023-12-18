import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//<applet code ="motion" height = 500 width = 500></applet>
public class motion extends Applet implements MouseMotionListener{
    String Str = "MOUSE_IS_RESTING";
    int x = 50,y =50;
    Graphics g;
    public void init(){
            addMouseMotionListener(this);
    }
    public void mouseDragged(MouseEvent me){
           Str = "MOUSE_DRAGGED";
           repaint();
        }
        public void mouseMoved(MouseEvent me){
            Str = "MOUSE_MOVED";
            
            x = getX();
            y = getY();
            repaint();

    }
    public void paint(Graphics g){
         g.drawString(Str,50,50);
         g.fillOval(x,y,50,50);
    }
}

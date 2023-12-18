import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//<applet code = 'mouse' height = 500 width = 500></applet>
public class mouse extends Applet implements MouseListener{
    int x = 50,y = 50,mouse_x,mouse_y;
    String str;
    public void init(){
        addMouseListener(this);
    }
    public void mouseEntered(MouseEvent me){
      str = "Entered";    
      mouse_x = me.getX();
      mouse_y = me.getY();
 
        if (mouse_y < y ){
        y= y-50;
        }
        if (mouse_x > x){
         x =  x+50;   
        }
        if (mouse_y > y){
         y =  y+50;   
        }
        if (mouse_x < x ){
        x= x-50;
        }
      repaint();
    }
    public void mouseClicked(MouseEvent me){
    str = "Clicked";     
    repaint();
    }
    public void mouseExited(MouseEvent me){
      str = "Exited";
      repaint();
    }
    public void mousePressed(MouseEvent me){
      str = "Pressed";
        repaint();
    }
    public void mouseReleased(MouseEvent me){
      str = "Realeased";
      repaint();

    }
    public void paint(Graphics g){
    g.drawString(str,10,10);
    Color c1 = new Color(255,000,000);
    g.fillOval(x,y,70,70);
    g.setColor(c1);
    g.fillOval(x,y,70,70);
    g.fillOval(x,y,70,70);
    }
    }
//baaaakaaa

import java.awt.*;
import java.applet.*;

/*
<applet code= "Colordemo" height = "1000" width = "1000" >
</applet>
*/

public class Colordemo extends Applet{
    public void init(){
         Font f1 = new Font("Bell MT",Font.BOLD,25);
         setFont(f1);
                 Label l1 = new Label("HELLO");

        add(l1);
    }
     public void paint(Graphics g){
        Color c1 = new Color(255,000,000);
        Color c2 = new Color(000,255,000);
        Color c3 = new Color(000,000,255);
        Label l1 = new Label("HELLO");
        
        g.setColor(c1);
        g.fillRect(50,0,110,220);
        g.setColor(c2);
        g.fillOval(300,0,100,160);
        g.setColor(Color.red);
        g.drawLine(500,500,500,00);
        g.setColor(c3);
        g.fillRoundRect(700,0,160,150,15,15);       
       
     }
     
}
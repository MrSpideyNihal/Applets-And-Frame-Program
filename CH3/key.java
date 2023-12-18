import java.awt.event.*;
import java.applet.*;
import java.awt.*;
//<applet code = "key" width = 500 height = 500></applet>
public class key extends Applet implements KeyListener{
    
    public void init(){
        
    addKeyListener(this);
    }
public void keyPressed(KeyEvent ke){
   showStatus("Key pressed");
}
public void keyReleased(KeyEvent ke){
   showStatus("Key Released");
}
public void keyTyped(KeyEvent ke){
   String ST = "KEY :"+ke.getKeyChar();
   Label n1 = new Label(ST);
   add(n1);
}
    
}

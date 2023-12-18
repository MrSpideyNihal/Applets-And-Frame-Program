import java.awt.*;
import java.awt.event.*;
public class Game extends Frame implements KeyListener{
     int x=50;
     int y = 100;
     String Str;
     Button phew;
    public Game(){
     setLayout(null);
     
    
    addKeyListener(this);

}
public void keyPressed(KeyEvent ke){

}
public void keyReleased(KeyEvent ke){
    
}
public void keyTyped(KeyEvent ke){
if(ke.getKeyChar()=='d'){x=x+30;
System.out.println(ke.getKeyChar());
repaint();
}
else if(ke.getKeyChar()=='w'){y=y-30;
System.out.println(ke.getKeyChar());
repaint();
}
else if(ke.getKeyChar()=='s'){y=y+30;
System.out.println(ke.getKeyChar());
repaint();
} 
else if(ke.getKeyChar()=='a'){x=x-30;
System.out.println(ke.getKeyChar());
repaint();
} 
}
public void paint(Graphics g){
    Color c1 = new Color(255,000,000);
    
    g.setColor(c1);
    g.fillRect(x,y,70,70);

 }
    public static void main(String[] args) {
        Game newgame = new Game();
        newgame.setSize(700,500);
        newgame.setTitle("SUPER_MARIIIIOO");
        newgame.setVisible(true);
    }
    
}

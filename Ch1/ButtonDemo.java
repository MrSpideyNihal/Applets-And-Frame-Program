import java.awt.*;
import java.applet.*;

/*
<applet code= "ButtonDemo" height = "300" width = "300" >
</applet>
*/

public class ButtonDemo extends Applet{
     public void init(){
        Button b1 = new Button();
        Button b2 = new Button("Mrspidey");
        
        add (b1);
        add (b2);

     }
}
import java.awt.*;
import java.applet.*;

/*
<applet code= "LabelDemo" height = "300" width = "300" >
</applet>
*/

public class LabelDemo extends Applet{
     public void init(){
        Label l1 = new Label("Pushpak");
        Label l2 = new Label("VINAYAK");
        
        add (l1);
        add (l2);

     }
}
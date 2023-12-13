import java.awt.*;
import java.applet.*;

/*
<applet code= "CheckboxDemo" height = "300" width = "300" >
</applet>
*/

public class CheckboxDemo extends Applet{
     public void init(){
        Checkbox ch1 = new Checkbox();
        Checkbox ch2 = new Checkbox("cold");
        
        add (ch1);
        add (ch2);

     }
}
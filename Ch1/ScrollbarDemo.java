
import java.awt.*;
import java.applet.*;

/*
<applet code= "ScrollbarDemo" height = "300" width = "300" >
</applet>
*/

public class ScrollbarDemo extends Applet{
     public void init(){
        
        Scrollbar sb1 = new Scrollbar(Scrollbar.VERTICAL,0,1,0,50);
        Scrollbar sb2 = new Scrollbar(Scrollbar.VERTICAL,0,1,0,50);

        add(sb1);
        add(sb2);

     

     }
}
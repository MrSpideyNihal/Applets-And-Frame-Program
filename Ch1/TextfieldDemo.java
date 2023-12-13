
import java.awt.*;
import java.applet.*;

/*
<applet code= "TextfieldDemo" height = "300" width = "300" >
</applet>
*/

public class TextfieldDemo extends Applet{
     public void init(){
       
        TextField Tf1 = new TextField("EMAIL KY HAI?");
        TextField Tf2 = new TextField("PASS BHI BATA DE?");
        Tf2.setEchoChar('*');
        add (Tf1);
        add (Tf2);

     }
}
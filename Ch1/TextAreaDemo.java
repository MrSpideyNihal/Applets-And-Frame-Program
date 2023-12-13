
import java.awt.*;
import java.applet.*;

/*
<applet code= "TextAreaDemo" height = "300" width = "300" >
</applet>
*/

public class TextAreaDemo extends Applet{
     public void init(){
       
        TextArea Ta1 = new TextArea("HI MY NAME IS PUSHPAK , HOW ARE YOU ?",10,10);
        TextArea Ta2 = new TextArea("PASS BHI BATA DE?",10,15);
        
        add (Ta1);
        add (Ta2);

     }
}
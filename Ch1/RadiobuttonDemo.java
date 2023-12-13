
import java.awt.*;
import java.applet.*;

/*
<applet code= "RadiobuttonDemo" height = "300" width = "300" >
</applet>
*/

public class RadiobuttonDemo extends Applet{
     public void init(){
        CheckboxGroup ch1 = new CheckboxGroup();
        Checkbox rb1 = new Checkbox("hot",ch1,true);
        Checkbox rb2 = new Checkbox("cold",ch1,false);
        
        add (rb1);
        add (rb2);

     }
}
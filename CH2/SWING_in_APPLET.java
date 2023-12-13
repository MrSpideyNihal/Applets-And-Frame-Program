import javax.swing.*;
import java.awt.*;
/*
<applet code= "SWING_in_APPLET" height = "300" width = "300" >
</applet>
*/

public class SWING_in_APPLET extends  JApplet
{
    public void start()
    {
        Container ct = getContentPane();
        JLabel j1 = new JLabel("Demonstrating swing components in JApplet");
        ct.add(j1);
    }
}

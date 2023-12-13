import javax.swing.*;
import java.awt.*;
/*
<applet code= "IMAGEINSWING" height = "300" width = "300" >
</applet>
*/

public class IMAGEINSWING extends  JApplet
{
    public void start()
    {
        Container ct = getContentPane();

        String str = "iamge.jpg";

        ImageIcon ii = new ImageIcon(str);
       
        JLabel jii = new JLabel("HELLO",ii,JLabel.CENTER);
        ct.add(jii);
    }
}

import java.awt.*;
import javax.swing.*;

/*
<applet code  ="ScrollDemo" width =400 height=100>
</applet>
*/

public class ScrollDemo extends JApplet
{
    public void start(){
        setLayout(new BorderLayout());
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(10,10));
        int b = 0;
     
    int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
    int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
    JScrollPane jsp = new JScrollPane(jp ,v,h);
add(jsp,BorderLayout.CENTER);
    }
}
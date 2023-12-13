import java.awt.*;
import javax.swing.*;
/*
<applet code  ="Scroll2" width =400 height=100>
</applet>
*/
 public class Scroll2 extends JApplet
{
    public void start(){
    Container ct = getContentPane();
    String a = "text ><"+"Horizontal style \n"+"Vertical style";
    int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
    int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
    int b=0;
      JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(10,10));
       for (int i = 0;i <10; i++){
            for(int j = 0;j<10;j++){
              
            jp.add(new JButton("Button "+ b));
            ++b;
            }
        }
    JScrollPane sp = new JScrollPane(jp,v,h);
    ct.add(sp);
}
}
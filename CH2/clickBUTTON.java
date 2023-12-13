import java.awt.*;
import javax.swing.*;
/*
<applet code = "clickBUTTON" height = "300" width = "300">
</applet>
*/
public class clickBUTTON extends JApplet{

    public void init(){
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        
        String str = "iamge.jpg";
        ImageIcon ii = new ImageIcon(str);
        // JLabel jii = new JLabel("HELLO",ii,JLabel.CENTER);
        JButton jb1 = new JButton("CLICK ME PLEASE!");
        JButton jb2 = new JButton("PHOTO>VIRUS!",ii);
        
        add(jb1);
        add(jb2);
        
    }
}


import javax.swing.*;
import java.awt.*;

public class Jradiodemo extends JFrame{
    public Jradiodemo(){
        setLayout(new FlowLayout());
        setSize (400,500);
        setVisible(true);
        JRadioButton jr1 = new JRadioButton("JAVA");
        JRadioButton jr2 = new JRadioButton("Python",true);
        JRadioButton jr3 = new JRadioButton("C++");
        JRadioButton jr4 = new JRadioButton("ODD");
        add(jr1);
        add(jr2);
        add(jr3);
        add(jr4);
        
    }
    
}
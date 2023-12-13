import javax.swing.*;
import java.awt.*;

public class Checkbox extends JFrame{
    public Checkbox(){
        setLayout(new FlowLayout());
        setSize (400,500);
        setVisible(true);
        JCheckBox jr1 = new JCheckBox("JAVA");
        JCheckBox jr2 = new JCheckBox("Python",true);
   
        add(jr1);
        add(jr2);
       

    }
public static void iamtree(String args[]){
        new Checkbox();
}
}
import javax.swing.*;
import java.awt.*;


public class JComboBOX extends JFrame{
    public JComboBOX(){
        setLayout(new FlowLayout());
        JLabel jl1 = new JLabel("Select your age!");
        String str[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};

        JComboBox jc1 = new JComboBox(str);
        
        
        add(jl1);
        add(jc1);

        setSize(300,300);
        setVisible(true);
    }

    public static void iamtree(String[] args) {
        new JComboBOX();
    }
}
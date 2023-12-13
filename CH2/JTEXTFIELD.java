import javax.swing.*;
import java.awt.*;


public class JTEXTFIELD extends JFrame{
    public JTEXTFIELD(){
        setLayout(new FlowLayout());
        
        JLabel jl1 = new JLabel("WRITE HERE!");

        JTextField jtf1 = new JTextField(30);
        JTextArea jta1 = new JTextArea("TYPE HERE :     ",20,20);

        add(jl1);
        add(jtf1);
        add(jta1);

        setSize(300,300);
        setVisible(true);
    }

    public static void iamtree(String[] args) {
        new JTEXTFIELD();
    }
}
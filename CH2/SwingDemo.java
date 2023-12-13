// swing //
import java.awt.*;
import javax.swing.*;
class SwingDemo extends JFrame
{
    public SwingDemo()
    {
        Container ct = getContentPane();
        JLabel j1 = new JLabel("SWINGG ");
        ct.add(j1);
    }

    public static void iamtree(String[] args) {
        SwingDemo fd = new SwingDemo();
        fd.setTitle("demo");
        fd.setSize(300,300);
        fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fd.setVisible(true);
    }
}

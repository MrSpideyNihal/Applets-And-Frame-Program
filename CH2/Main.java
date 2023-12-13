import java.awt.*;
import java.util.*;
import javax.swing.*;
public class Main extends JFrame
{
    public Main(){
        GridLayout gb = new GridLayout(3,3);
        setLayout(gb);
        // JButton jb1 = new JButton("CLICK ME!");
        // JLabel j1 = new JLabel("SWINGG ");
        int i = 1;
        List<JButton> lists = new ArrayList<JButton>();
        String a = "io"+i;
        for(i = 1; i <= 9; i++){
           JButton s = new JButton(""+i);
           add(s);
        }
        // add(j1);
        // add(jb1);

    }

    public static void main(String[] args) {
        Main f = new Main();
        f.setTitle("demo");
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
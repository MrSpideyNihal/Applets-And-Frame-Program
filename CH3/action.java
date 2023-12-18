import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class action extends JFrame implements ActionListener {
    
    Container ct = getContentPane();
    public action(){
    ct.setLayout(new FlowLayout());
    JButton btn = new JButton("Click me!");
    ct.add(btn);

    btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
    JLabel lb = new JLabel("BUTTON_WAS_CLICKED");
    ct.add(lb);
    }
    public static void main(String[] args) {
        action an = new action();
        an.setSize(700,500);
        an.setVisible(true);
        an.setTitle("ACTIONLISTNER");
    }
}

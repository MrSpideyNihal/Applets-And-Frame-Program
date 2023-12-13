import javax.swing.*;
public class tooltip{
    public static void main(String[] args){
        JFrame f=new JFrame("password Field Example");
       
        JPasswordField value =new JPasswordField();
        value.setBounds(100,100,100,50) ;
        value.setToolTipText("enter your password");
        JLabel l1= new JLabel("password");
        l1.setBounds(20,100,80,30);
        f.add(value);
        f.add(l1);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    }

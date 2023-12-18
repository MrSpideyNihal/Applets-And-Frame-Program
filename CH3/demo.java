import java.awt.event.*;
import java.awt.*;

public class demo extends Frame implements ActionListener{
    Button btn;
    TextField Tf1;
    TextField Tf2;

      public void start(){
        setLayout(null);
        btn = new Button("CLICK ME");
        btn.setBounds(200,200,70,40);

        Label lb  = new Label("Enter no 1");
        Label lb2  = new Label("Enter no 2");

        lb.setBounds(50,50,80,50);
        lb2.setBounds(50,150,80,50);

        Tf1 = new TextField();
        Tf1.setBounds(150,70,50,25);
        Tf2 = new TextField();
        Tf2.setBounds(150,170,50,25);
        

        add(lb);
        add(lb2);
        add(Tf1);
        add(Tf2);
        add(btn);

        btn.addActionListener(this);
     
      }
      public void actionPerformed(ActionEvent ae){
          System.out.println("Button was Clicked!");
         int num1 =  Integer.parseInt(Tf1.getText());
         int num2 =  Integer.parseInt(Tf2.getText());

        String str = "ans:"+Integer.toString(num1+num2);
  
        Label ans = new Label(str);
        add(ans);
        System.out.println(str);
                ans.setBounds(350,200,70,40);

      }
      public static void main(String[] args) {
        demo d = new demo();
        d.setSize(500,500);
        d.setVisible(true);
        d.setTitle("Button");
        d.start();
      }
}
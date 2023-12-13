import java.awt.*;
public class DialogeDemo extends Dialog
{
    DialogeDemo(Frame parent, String title)
{
    super(parent,title,false);
    setLayout(new FlowLayout());
    setSize(500,400);
    
    setBackground(Color.red);
    setForeground(Color.green);
    Button b= new Button("cancel");
    add(b);

}
 public static void main(String args[])
{
    Frame f1 = new Frame();
    DialogeDemo dd= new DialogeDemo(f1,"hello");
    dd.setVisible(true);
}
}
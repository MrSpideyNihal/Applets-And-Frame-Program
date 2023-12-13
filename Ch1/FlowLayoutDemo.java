import java.awt.*;
import java.applet.*;

/*
<applet code= "FlowLayoutDemo" height = "300" width = "300" >
</applet>
*/

public class FlowLayoutDemo extends Applet{
     public void init(){
       FlowLayout f1 = new FlowLayout();
       setLayout(f1);
       Label l1 = new Label("Enter User Id! ");
       Checkbox ch1 = new Checkbox("Pizza");
       Label l2 = new Label("Enter Password!");
       TextField Tf1 = new TextField("This is a Text box !");
        
        add(l1);
        add(ch1);
        add(l2);
        add(Tf1);

   
    

     }
}
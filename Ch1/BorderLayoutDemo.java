import java.awt.*;
import java.applet.*;

/*
<applet code= "BorderLayoutDemo" height = "300" width = "300" >
</applet>
*/

public class BorderLayoutDemo extends Applet{
     public void init(){
    //Creating a border Layout!
       BorderLayout b1 = new BorderLayout();
       setLayout(b1);
    //Creating Buttons
       Button bt1 = new Button("North");
       Button bt2 = new Button("East!");
       Button bt3 = new Button("West");
       Button bt4 = new Button("South");
       Button bt5 = new Button("Center");

        add(bt1,b1.NORTH);
        add(bt2,b1.EAST);
        add(bt3,b1.WEST);
        add(bt4,b1.SOUTH);
        add(bt5,b1.CENTER);

        

   
    

     }
}
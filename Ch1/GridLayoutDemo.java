import java.awt.*;
import java.applet.*;

/*
<applet code= "GridLayoutDemo" height = "300" width = "300" >
</applet>
*/

public class GridLayoutDemo extends Applet{
    public void init(){
    setFont(new Font("Algerian",Font.BOLD,24));
    GridLayout gl1 = new GridLayout(4,3);
    setLayout(gl1);

    for(int i = 1; i <= 9; i++){
        add(new Button("" + i));
    }
    Button bt1 = new Button("*");
    Button bt2 = new Button("0");
    Button bt3 = new Button("#");
    

    add(bt1);
    add(bt2);
    add(bt3);

     }
}
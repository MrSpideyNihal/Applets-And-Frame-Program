import java.awt.*;
import java.applet.*;

/*
<applet code= "GridBagLayoutDemo" height = "300",width = "300" >
</applet>
*/

public class GridBagLayoutDemo extends Frame{

    public static void main(String args[])
    {
        GridBagLayoutDemo fr = new GridBagLayoutDemo();
        fr.setTitle("GridBag Layout Example");
        fr.setSize(300,300);
        fr.        



    setFont(new Font("Algerian",Font.BOLD,24));
    GridBagLayout gb1 = new GridBagLayout(4,3);
    setLayout(gb1);
    GridBagLayout gb2 = new GridBagLayout(4,3);
    
     }
}
import  javax.swing.*;
/*
<applet code  ="TabbedPanes" width =400 height=100>
</applet>
*/
public class TabbedPanes extends JApplet{
    public void init()
    
    {
        JTabbedPane jtp = new JTabbedPane();

        jtp.addTab("LANGUAGE",new LangPanel());
        jtp.addTab("Colors",new ColorsPanel());
        jtp.addTab("Flavour",new FlavourPanel());

        add(jtp);
    }
    }
class LangPanel extends JPanel
{
    public LangPanel()
    {
        JButton b1 = new JButton("Marathi");
        JButton b2 = new JButton("Hindi");
        JButton b3 = new JButton("Bengali");
        JButton b4 = new JButton("Tamil");
add(b1);
add(b2);
add(b3);
add(b4);
    }
}
class FlavourPanel extends JPanel
{
    public FlavourPanel()
    {
        JComboBox Jcb = new JComboBox();
        Jcb.addItem("VANILLA");
        Jcb.addItem("CHOCLATE");
        Jcb.addItem("MANGO");
add(Jcb);

    }
}
class ColorsPanel extends JPanel
{
    public ColorsPanel()
    {
       
     JCheckBox b2 = new JCheckBox("RED");
     JCheckBox b3 = new JCheckBox("Orange");
     JCheckBox b4 = new JCheckBox("Green");
add(b2);
add(b3);
add(b4);
    }
}

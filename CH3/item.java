import java.awt.event.*;
import java.awt.*;
public class item extends Frame implements ItemListener{
    List ls;
    Label lb;
    public item(){
    setLayout(new FlowLayout());
        
       ls = new List();
       lb = new Label("SELECTED ITEM");
       ls.add("INDIA");
       ls.add("JAPAN");
       ls.add("INDONESIA");
       ls.add("AMERICA");
       ls.add("BHARAT");
       add(ls);
       
       ls.addItemListener(this);
        add(lb);


    }
    public void itemStateChanged(ItemEvent ie){
       lb.setText(ls.getSelectedItem());
    }
    public static void main(String[] args) {
        item an = new item();
        an.setSize(700,500);
        an.setVisible(true);
        an.setTitle("ITEMLISTNER");
    }
}

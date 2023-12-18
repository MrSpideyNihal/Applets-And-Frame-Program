import java.awt.event.*;
import java.awt.*;

public class Textd extends Frame implements TextListener{
TextField tf,tf2;
    public Textd(){
        setSize(500,500);
        setVisible(true);
        setTitle("TEXT");
        setLayout(new FlowLayout());
        TextField tf = new TextField(15);
        TextField tf2 = new TextField(15);
        
             add(tf);
             add(tf2);


        tf2.setEditable(false);
        tf.addTextListener(this);

    }
    public void textValueChanged(TextEvent te){
        
          tf2.setText(tf.getText());
    }
    public static void main(String args[]){
        new Textd();
    }
}
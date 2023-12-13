//Resume Maker:
import java.applet.*;
import java.awt.*;

//<applet code = "allinone" height = 670 width = 500></applet>

public class allinone extends Applet{
     public void init(){
         //Label : 
        //  GridBagLayout gl = new GridBagLayout();
        //  setLayout(gl);
         
         Label name = new Label("Name");
         TextField getname = new TextField("Enter your Name");
         Button btn1 = new Button("Submit !");

        

         CheckboxGroup gender = new CheckboxGroup();
         Checkbox male = new Checkbox("Male",false,gender);
         Checkbox female = new Checkbox("Female",false,gender);
         Checkbox Other = new Checkbox("Other",true,gender);



         add(name);
         add(getname);
         add(btn1);
         
         FlowLayout fl = new FlowLayout();
         setLayout(fl);

         add(male);
         add(female);
         add(Other);


         
     }
    
}
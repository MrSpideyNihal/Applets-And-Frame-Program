import java.awt.*;
class MenuDemo extends Frame{
    public MenuDemo(){
        MenuBar mb = new MenuBar();
        Menu m1 = new Menu("FILE");
        Menu m2 = new Menu("Edit");
        Menu m3 = new Menu("Format");
        Menu m4 = new Menu("Open");
        
        MenuItem mi1 =  new MenuItem("New");
        MenuItem mi2 =  new MenuItem("Save");
        MenuItem mi3 =  new MenuItem("Save AS");
        MenuItem mi4 =  new MenuItem("Cut Ctrl+x");
        MenuItem mi5 =  new MenuItem("Copy Ctrl+c");
        MenuItem mi6 =  new MenuItem("Paste Ctrl+v");
        MenuItem mi7 =  new MenuItem("Font ");
        MenuItem mi8 =  new MenuItem("File1 ");
        MenuItem mi9 =  new MenuItem("File2 ");

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);

        m2.add(mi5);
        m2.add(m4);
        m2.add(mi6);
        m2.add(mi7);
       
        m3.add(mi8);
         
        m4.add(mi9);

        setMenuBar(mb);


       

    }
    public static void main(String args[]){
        
        MenuDemo obj1 = new MenuDemo();
        obj1.setTitle("Menu Demo");
        obj1.setSize(500,500);
        obj1.setVisible(true);
        
    }
}



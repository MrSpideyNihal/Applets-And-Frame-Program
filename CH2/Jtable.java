import javax.swing.*;
public class Jtable
{
    JFrame f;
    Jtable(){
        f = new  JFrame();
        String rows[][] = {
                {"101","Amit","670000"},
                {"102","JAI","670000"},
                {"03","SACHIN","900000"}

        };
        String columns[]={"id","NAME","Salary"};
        JTable jt = new JTable(rows , columns);
        jt.setBounds(30,40,200,300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Jtable();
    }
}
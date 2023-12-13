import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class iamtree{
     JTree tree;
     JFrame f;
     iamtree(){
         f = new JFrame();
         f.setLayout(new BorderLayout());
         DefaultMutableTreeNode top = new DefaultMutableTreeNode("OPtions");
         DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
         DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
         DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("a1");
         DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("a2");
         DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("b1");
         DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("b2");
         DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("b3");
     top.add(a);
     top.add(b);

         a.add(a1);
         a.add(a2);


         b.add(b1);
         b.add(b2);
         b.add(b2);



         tree = new JTree(top);
         JScrollPane jsp = new JScrollPane(tree);
         f.add(jsp,BorderLayout.CENTER);
         f.setSize(500,500);
         f.setVisible(true);
     }

    public static void iamtree(String[] args) {
        new iamtree();
    }
}
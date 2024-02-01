import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class TreeExample {
    JFrame f;
    TreeExample(){
        f = new JFrame();
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Estilo");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("cor");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("fonte");
        style.add(color);
        style.add(font);
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("vermelho");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("azul");
        DefaultMutableTreeNode black = new DefaultMutableTreeNode("preto");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("verde");
        color.add(red);color.add(blue);color.add(black);color.add(green);
        JTree jt = new JTree(style);
        f.add(jt);
        f.setSize(200,200);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new TreeExample();
    }
}
//https://www.javatpoint.com/java-jcolorchooser
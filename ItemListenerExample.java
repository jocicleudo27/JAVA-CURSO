import java.awt.*;
import java.awt.event.*;

public class ItemListenerExample implements ItemListener {
    Checkbox checkBox1, checkBox2;
    Label label;

    ItemListenerExample(){
        Frame f = new Frame("Checkbox Example");
    label = new Label();
    label.setSize(400, 100);
    checkBox1 = new Checkbox("C++");
    checkBox1.setBounds(100, 100, 50, 50);
    checkBox2 = new Checkbox("Java");
    checkBox2.setBounds(100, 150, 50, 50);
    f.add(checkBox1); f.add(checkBox2); f.add(label);
    checkBox1.addItemListener(this);
    checkBox2.addItemListener(this);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);

    f.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    });
    }
    
    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == checkBox1)
            label.setText("Checkbox C++: " +
            (e.getStateChange() == 1?"checked":"unchecked"));
                if(e.getSource() == checkBox2)
                    label.setText("Checbox Java: " +
                    (e.getStateChange() == 1?"checked":"unchecked"));
    }
    public static void main(String[] args){
        new ItemListenerExample();
    }
}

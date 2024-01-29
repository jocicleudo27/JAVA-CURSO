import javax.swing.*;

import java.awt.event.*;

public class ItemListenerExample implements ItemListener {
    JCheckBox checkBox1, checkBox2;
    JLabel label;

    ItemListenerExample(){
        JFrame f = new JFrame("Checkbox Example");
        label = new JLabel();
        label.setBounds(100, 200, 200, 50);
        checkBox1 = new JCheckBox("C++");
        checkBox1.setBounds(100, 100, 100, 50);
        checkBox2 = new JCheckBox("Java");
        checkBox2.setBounds(100, 150, 100, 50);
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
            label.setText("Checkbox Java: " +
            (e.getStateChange() == 1?"checked":"unchecked"));
    }
    public static void main(String[] args){
        new ItemListenerExample();
    }
}

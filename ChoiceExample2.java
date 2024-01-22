
import java.awt.event.*;
import javax.swing.*;

public class ChoiceExample2{
    ChoiceExample2(){
        JFrame f = new JFrame();
        final JLabel label =  new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 100);
        
        JButton b = new JButton("Mostrar");
        b.setBounds(200, 100, 50, 20);

        final JComboBox<String> c = new JComboBox<String>();
        c.setBounds(100, 100, 75, 75);

        c.addItem("C");
        c.addItem("C++");
        c.addItem("Java");
        c.addItem("PHP");
        c.addItem("Android");

        f.add(c);
        f.add(label);
        f.add(b);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String data = "Programming language Selected: "+ c.getItemAt(c.getSelectedIndex());
                label.setText(data);
            }
        });
    }
    public static void main(String[] args){
        new ChoiceExample2();
    }
}
//https://www.javatpoint.com/java-awt-choice
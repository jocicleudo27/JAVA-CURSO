/**
 * AWTExample2
 */
import java.awt.*;
import javax.swing.*;

public class AWTExample2 {

    AWTExample2(){
        JFrame f = new JFrame();

        JLabel l = new JLabel("ID do funcionario:");

        JButton b = new JButton("Enviar");

        JTextField t = new JTextField();

        
        l.setBounds(20, 50, 50, 30);
        t.setBounds(20, 100, 80, 25);
        b.setBounds(100, 100, 80, 25);

        f.add(b);
        f.add(l);
        f.add(t);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
     new AWTExample2();   
    }
} 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelExample{
    PanelExample(){
        JFrame f = new JFrame("Exemplo de Painel");
        JPanel panel = new JPanel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.gray);
        JButton b1 = new JButton("Botão 1");
        b1.setBounds(50, 100, 80, 30);
        b1.setBackground(Color.yellow);
        JButton b2 = new JButton("Botão 2");
        b2.setBounds(100, 100, 80, 30);
        b2.setBackground(Color.green);
        panel.add(b1);
        panel.add(b2);
        f.add(panel);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args){
        new PanelExample();
    }
}

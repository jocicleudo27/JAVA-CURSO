import java.awt.*;
import java.awt.event.*;

public class PanelExample{
    PanelExample(){
        Frame f = new Frame("Exemplo de Painel");
        Panel panel = new Panel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.gray);
        Button b1 = new Button("Botão 1");
        b1.setBounds(50, 100, 80, 30);
        b1.setBackground(Color.yellow);
        Button b2 = new Button("Botão 2");
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
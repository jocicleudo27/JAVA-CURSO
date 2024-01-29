import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample extends JFrame implements KeyListener {
    Label l;
    TextArea area;

    KeyListenerExample(){
        l = new Label();
        l.setBounds(20, 50, 100, 20);
        area = new TextArea();
        area.setBounds(20, 80, 300, 300);
        area.addKeyListener(this);
        add(l);
        add(area);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public void keyPressed(KeyEvent e){
        l.setText("Tecla pressionada");
    }
    public void keyReleased(KeyEvent e){
        l.setText("Chave Liberada");
    }
    public void keyTyped(KeyEvent e){
        l.setText("Tecla digitada");
    }
    public static void main(String[] args){
        new KeyListenerExample();
    }
}

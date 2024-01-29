import javax.swing.*;
import java.awt.event.*;

public class AdapterExample{
    JFrame f;

    AdapterExample(){
        f = new JFrame("Adaptador de Janela");

        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new AdapterExample();
    }
}

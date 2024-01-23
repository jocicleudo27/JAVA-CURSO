import java.awt.*;
import java.awt.event.*;

public class DialogExample {
    private static Dialog d;
    DialogExample() {
        Frame f = new Frame();
        d = new Dialog(f , "Exemplo de diálogo", true);
        d.setLayout( new FlowLayout() );
        Button b = new Button ("OK");
        b.addActionListener ( new ActionListener() {
            public void actionPerformed( ActionEvent e ) {
                DialogExample.d.setVisible(false);
            }
        });
        d.add( new Label ("Clique no botão para continuar."));
        d.add(b);
        d.setSize(300, 300);
        d.setVisible(true);
    }
    public static void main(String args[]) {
        new DialogExample();
    }
}

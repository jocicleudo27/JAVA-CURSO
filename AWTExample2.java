/**
 * AWTExample2
 */
import java.awt.*;

public class AWTExample2 {

    AWTExample2(){
        Frame f = new Frame();

        Label l = new Label("ID do funcionario:");

        Button b = new Button("Enviar");

        TextField t = new TextField();

        
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
        
    }
}
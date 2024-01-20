import java.awt.*;
import javax.swing.*;

public class TextAreaExemplo{
    TextAreaExemplo(){
        JFrame f = new JFrame();
        TextArea area = new TextArea("Bem-vindo ao javatpoint");

        area.setBounds(10, 30, 300, 300);
        f.add(area);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new TextAreaExemplo();
    }
}
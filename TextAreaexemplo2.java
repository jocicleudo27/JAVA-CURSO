/*O exemplo a seguir exibe uma área de texto no quadro 
onde ele estende a classe Frame e implementa a interface do ActionListener. 
Usando o ActionListener o evento é gerado no pressionar do botão, 
onde estamos contando o número de caracteres e palavras inseridos na área de texto. */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextAreaexemplo2 extends JFrame implements ActionListener{
    JLabel l1, l2;
    TextArea area;
    Button b;
    TextAreaexemplo2(){
        l1 = new JLabel();
        l1.setBounds(50, 50, 100, 30);
        l2 = new JLabel();
        l2.setBounds(160, 50, 100, 30);
        area = new TextArea();
        area.setBounds(20, 100, 300, 300);
        b = new Button("Contar Palavras");
        b.setBounds(100, 400, 100, 30);

        b.addActionListener(this);

        add(l1);
        add(l2);
        add(area);
        add(b);

        setSize(400, 450);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String text = area.getText();
        String words[] = text.split("\\s");
        l1.setText("Palavras: "+ words.length);
        l2.setText("Carcteres: " + text.length());
    }
    public static void main(String[] args){
        new TextAreaexemplo2();
    }
}
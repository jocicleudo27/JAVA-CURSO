/*Como escrever o ActionListener
A abordagem comum é implementar o ActionListener. 
Se você implementar a classe ActionListener, precisará seguir 3 etapas:

1) Implemente a interface do ActionListener na classe: 
2) Registre o componente com o ouvinte:
3) Substitua o método actionPerformed():
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample implements ActionListener{
    JTextField tf;  // Declare tf here so it can be accessed in actionPerformed method

    public static void main(String[] args) {
        ActionListenerExample example = new ActionListenerExample();  // Create an instance of the class
        example.createUI();  // Call the method to create the UI
    }

    public void createUI() {
        JFrame f = new JFrame("Exemplo do ActionListener");
        tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        JButton b = new JButton("Clique Aqui");
        b.setBounds(50, 100, 80, 30);
        b.addActionListener(this);  // Add the action listener to the button
        f.add(b); 
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);  
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }  

    public void actionPerformed(ActionEvent e){
        tf.setText("Bem-vindo ao Javatpoint.");
    }  
}



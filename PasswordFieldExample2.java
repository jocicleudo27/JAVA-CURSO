import javax.swing.*;
import java.awt.event.*;

public class PasswordFieldExample2{
    public static void main(String[] args){
        JFrame f = new JFrame("Exemplo de Campo de Senha");
        final JLabel label = new JLabel();
        label.setBounds(20, 150, 200, 50);
        final JPasswordField valor = new JPasswordField();
        valor.setBounds(100, 75, 100, 30);
        JLabel l1 = new JLabel("Nome do usuario: ");
        l1.setBounds(20, 20, 80, 30);
        JLabel l2 = new JLabel("Senha:");
        l2.setBounds(20, 75, 80, 30);
        JButton b = new JButton("Login");
        b.setBounds(100, 120, 80, 30);
        final JTextField texto = new JTextField();
        texto.setBounds(100, 20, 100, 30);
        f.add(valor);
        f.add(l1); 
        f.add(label); 
        f.add(l2); 
        f.add(b); 
        f.add(texto);
        f.setSize(300, 300);
        f.setLayout(null);    
        f.setVisible(true);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String dados = "Nome de usuário " +
                texto.getText();
                    dados += ", Senha: " + new
                    String(valor.getPassword());
                        label.setText(dados);
            }
        });
    }
}

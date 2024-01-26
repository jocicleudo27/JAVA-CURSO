import javax.swing.*;
public class PasswordFieldExample{
    public static void main(String[] args){
        JFrame f = new JFrame("Exemplo de campo de senha");
        JPasswordField valor =  new JPasswordField();
        JLabel l1 = new JLabel("Senha:");
        l1.setBounds(20, 100, 80, 30);
        valor.setBounds(100, 100, 100, 30);
        f.add(valor);
        f.add(l1);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
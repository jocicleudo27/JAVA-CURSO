import javax.swing.*;


public class LabelExample {
    public static void main(String args[]) {

        // Criando o objeto da classe JFrame e da classe JLabel
        JFrame f = new JFrame("Exemplo de rótulo");
        JLabel l1, l2;

        // Inicializando os rótulos
        l1 = new JLabel("Primeiro Rótulo");
        l2 = new JLabel("Segundo Rótulo");

        // Definir o local do rótulo
        l1.setBounds(50, 50, 100, 30);
        l2.setBounds(50, 100, 100, 30);

        // Adicionando rótulos ao quadro
        f.add(l1);
        f.add(l2);

        // Definindo tamanho, layout e visibilidade do quadro
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}

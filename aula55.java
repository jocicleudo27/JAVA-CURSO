import javax.swing.*;

public class aula55 {

    public static void main(String[] args) {
        JFrame f = new JFrame("Example de TextField");

        JTextField t1, t2;
        t1 = new JTextField("Bem-vindo ao Javatoint.");
        t1.setBounds(50,100,200,30);
        t2 = new JTextField("Tutrorial AWT");
        t2.setBounds(50,150,200,30);

        f.add(t1);
        f.add(t2);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
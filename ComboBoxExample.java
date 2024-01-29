import javax.swing.*;

public class ComboBoxExample{
    JFrame f;

    ComboBoxExample(){
        f = new JFrame("Exemplo de ComboBox");
        String country[] = {"India", "Aus", "EUA","Inglaterra", "Nova Zelândia"};
        JComboBox<String> cb = new JComboBox<>(country);
        cb.setBounds(50, 50, 90, 20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400, 500);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new ComboBoxExample();
    }
}
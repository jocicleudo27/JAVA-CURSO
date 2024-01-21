import javax.swing.*;
public class ChoiceExample{
    ChoiceExample(){
        JFrame f = new JFrame();

        JComboBox<String> c = new JComboBox<String>();

        c.setBounds(100, 100, 75, 75);

        c.addItem("Item 1");
        c.addItem("Item 2");
        c.addItem("Item 3");
        c.addItem("Item 4");

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[]args){
        new ChoiceExample();
    }
}
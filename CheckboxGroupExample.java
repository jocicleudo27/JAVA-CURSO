import javax.swing.*;

public class CheckboxGroupExample{
    CheckboxGroupExample(){
        JFrame f = new JFrame("Exemplo de CheckboxGroup");
        ButtonGroup cbg = new ButtonGroup();
        JCheckBox checkBox1 = new JCheckBox("C++", false);
        
        checkBox1.setBounds(100, 100, 50, 50);
        JCheckBox checkbox2 = new JCheckBox("Java", true);
        checkbox2.setBounds(100, 150, 50, 50);
        f.add(checkBox1);
        f.add(checkbox2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new CheckboxGroupExample();
    }
    
}

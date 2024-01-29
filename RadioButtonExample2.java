

//https://www.javatpoint.com/java-jradiobutton

import javax.swing.*;
import java.awt.event.*;

public class RadioButtonExample2 extends JFrame implements ActionListener{
    JRadioButton rb1, rb2;
    JButton b;

    RadioButtonExample2(){
        rb1 = new JRadioButton("Masculino");
        rb1.setBounds(100, 50, 100, 30);
        rb2 = new JRadioButton("Feminino");
        rb2.setBounds(100, 100, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        b = new JButton("clique");
        b.setBounds(100, 150, 80, 30);
        b.addActionListener(this);
        add(rb1);
        add(rb2);
        add(b);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(rb1.isSelected()){
            JOptionPane.showMessageDialog(this, "Você é masculino.");
        }
        if(rb2.isSelected()){
            JOptionPane.showMessageDialog(this, "Você é mulher.");
        }
    }
    public static void main(String[] args){
        new RadioButtonExample2();
    }
}


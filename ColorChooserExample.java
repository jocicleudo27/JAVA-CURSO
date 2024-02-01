import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ColorChooserExample extends JFrame implements ActionListener{
    JButton b;
    Container c;

    ColorChooserExample(){
        c = getContentPane();
        c.setLayout(new FlowLayout());
        b = new JButton("cor");
        b.addActionListener(this);
        c.add(b);
    }
    public void actionPerformed(ActionEvent e){
        Color initialcolor =  Color.RED;
        Color color = JColorChooser.showDialog(this,"Selecione uma cor",initialcolor);
        c.setBackground(color);
    }
    public static void main(String[] args){
        ColorChooserExample ch = new ColorChooserExample();
        ch.setSize(400, 400);
        ch.setVisible(true);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
/*public class ColorChooserExample extends JFrame implements ActionListener {
Aqui, estamos declarando uma classe pública chamada ColorChooserExample que herda de JFrame 
(uma classe que fornece as funcionalidades básicas de uma janela) 
e implementa a interface ActionListener (usada para receber eventos de ação).

JButton b;    
Container c;
Estamos declarando um botão b e um contêiner c. O contêiner é um componente que pode conter outros componentes AWT.

ColorChooserExample(){    
    c = getContentPane();    
    c.setLayout(new FlowLayout());
    b = new JButton("cor");
    b.addActionListener(this);
    c.add(b);    
}    

Este é o construtor da classe. 
Ele inicializa o contêiner com o painel de conteúdo do JFrame, 
define o layout do contêiner como FlowLayout, inicializa o botão com o texto “cor”, 
adiciona o ActionListener ao botão e adiciona o botão ao contêiner.

public void actionPerformed(ActionEvent e) {
    Color initialcolor = Color.RED;
    Color color = JColorChooser.showDialog(this, "Selecione uma cor", initialcolor);
    c.setBackground(color);
}    

Este método é chamado quando uma ação ocorre. 
Aqui, ele define a cor inicial como vermelho, 
exibe um diálogo de seleção de cor e muda a cor de fundo do contêiner para a cor selecionada.

public static void main(String[] args) {
    ColorChooserExample ch = new ColorChooserExample();    
    ch.setSize(400, 400);
    ch.setVisible(true);
    ch.setDefaultCloseOperation(EXIT_ON_CLOSE);    
}    

Este é o método main, onde o programa começa. 
Ele cria uma instância da classe ColorChooserExample, define o tamanho da janela, 
torna a janela visível e define a operação padrão quando a janela é fechada para sair do aplicativo.
*/
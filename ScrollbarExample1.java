import javax.swing.*;

import java.awt.event.*;

public class ScrollbarExample1 {
  
    // Construtor  
    public ScrollbarExample1() {    
  
        // Criando um quadro  
        JFrame f = new JFrame("Exemplo de barra de rolagem");
        // Criando uma barra de rolagem  
        JScrollBar s = new JScrollBar();
  
        // Definindo a posição da barra de rolagem  
        s.setBounds (100, 100, 50, 100);
  
        // Adicionando barra de rolagem ao quadro  
        f.add(s);    
  
        // Definindo tamanho, layout e visibilidade do quadro  
        f.setSize(400, 400);  
        f.setLayout(null);    
        f.setVisible(true);

        // Adicionando WindowListener para fechar a janela
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }    
  
    // Método principal  
    public static void main(String args[]) {    
        new ScrollbarExample1();
    }    
}

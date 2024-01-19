import java.awt.*;
import javax.swing.*;
public class ButtonExample{
    public static void main(String[] args){
        //Criar instância de quadro com o rótulo 
        JFrame f = new JFrame("Exemplo de botão");
        // Criar instância de botão com rótulo 
        Button b = new Button("clique aqui");
        // Definir a posição do botão no quadro  
        b.setBounds(50, 100, 80, 30);
         // Adicionar botão ao quadro 
         f.add(b);

         // Definir tamanho, layout e visibilidade do quadro.

         f.setSize(400, 400);
         f.setLayout(null);
         f.setVisible(true);
         
    }
} 

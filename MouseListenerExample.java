import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends JFrame implements MouseListener {
    Label l;

    MouseListenerExample(){
        l = new Label();
        l.setBounds(20, 50, 100, 20);
        add(l);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        this.addMouseListener(this);

        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }

    public void mouseClicked(MouseEvent e){
        l.setText("Clique com o mouse");
    }
    public void mouseEntered(MouseEvent e){
        l.setText("Mouse digitado");
    }
    public void mouseExited(MouseEvent e){
        l.setText("Mouse Saido");
    }
    public void mousePressed(MouseEvent e){
        l.setText("Mouse pressionado");
    }
    public void mouseReleased(MouseEvent e){
        l.setText("Mouse Liberado");
    }
    public static void main(String[] args) {
        new MouseListenerExample();
    }
}

/*Java MouseListener Interface
O Java MouseListener é notificado sempre que você altera o estado do mouse. 
Ele é notificado contra MouseEvent. 
A interface MouseListener é encontrada no pacote java.awt.event. 
Tem cinco métodos.

Métodos da interface MouseListener
A assinatura de 5 métodos encontrados na interface MouseListener 
são dados abaixo:*/

/*import java.awt.*; // Importa todas as classes do pacote java.awt.
import java.awt.event.*; // Importa todas as classes do pacote java.awt.event.

public class MouseListenerExample extends Frame implements MouseListener { // Declara uma classe pública chamada MouseListenerExample que herda de Frame e implementa a interface MouseListener.
    Label l; // Declara uma variável de instância do tipo Label chamada l.

    MouseListenerExample(){ // Define o construtor da classe.
        addMouseListener(this); // Adiciona um ouvinte de mouse ao frame.

        l = new Label(); // Inicializa a variável l como um novo objeto Label.
        l.setBounds(20, 50, 100, 20); // Define a posição e o tamanho do rótulo.
        add(l); // Adiciona o rótulo ao frame.
        setSize(300, 300); // Define o tamanho do frame.
        setLayout(null); // Define o gerenciador de layout como null, permitindo o posicionamento absoluto dos componentes.
        setVisible(true); // Torna o frame visível.

        this.addWindowListener(new WindowAdapter(){ // Adiciona um ouvinte de janela ao frame.
            public void windowClosing(WindowEvent we){ // Define o que acontece quando a janela é fechada.
                System.exit(0); // Encerra o programa.
            }
        });
    }

    public void mouseClicked(MouseEvent e){ // Define o que acontece quando o mouse é clicado.
        l.setText("Clique com o mouse"); // Altera o texto do rótulo.
    }

    public void mouseEntered(MouseEvent e){ // Define o que acontece quando o mouse entra no frame.
        l.setText("Mouse digitado"); // Altera o texto do rótulo.
    }

    public void mouseExited(MouseEvent e){ // Define o que acontece quando o mouse sai do frame.
        l.setText("Mouse Saído"); // Altera o texto do rótulo.
    }

    public void mousePressed(MouseEvent e){ // Define o que acontece quando o botão do mouse é pressionado.
        l.setText("Mouse pressionado"); // Altera o texto do rótulo.
    }

    public void mouseReleased(MouseEvent e){ // Define o que acontece quando o botão do mouse é liberado.
        l.setText("Mouse Liberado"); // Altera o texto do rótulo.
    }

    public static void main(String[] args) { // Define o método principal que é o ponto de entrada do programa.
        new MouseListenerExample(); // Cria uma nova instância da classe MouseListenerExample.
    }
}
*/
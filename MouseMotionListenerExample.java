import java.awt.*;
import java.awt.event.*;

public class MouseMotionListenerExample extends Frame implements MouseMotionListener {
    MouseMotionListenerExample(){
        addMouseMotionListener(this);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public void mouseDragged(MouseEvent e){
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 20, 20);
    }
    public void mouseMoved(MouseEvent e){}

    public static void main(String[] args) {
        new MouseMotionListenerExample();
    }
}

/*public class MouseMotionListenerExample extends Frame implements MouseMotionListener {
Esta é a declaração da classe MouseMotionListenerExample. 
Ela estende a classe Frame (que é uma janela com borda e título) 
e implementa a interface MouseMotionListener 
(que é usada para receber eventos de movimento do mouse).

Este é o construtor da classe. 
Ele configura o ouvinte de movimento do mouse, define o tamanho da janela, 
define o layout como nulo 
(o que significa que você precisa definir as posições dos componentes manualmente), 
torna a janela visível e adiciona um ouvinte de janela para fechar a janela quando o usuário clica no botão de fechar.

MouseMotionListenerExample(){
    addMouseMotionListener(this);
    setSize(300, 300);
    setLayout(null);
    setVisible(true);

    this.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    });
}

Este é o método mouseDragged, que é chamado quando o mouse é arrastado. 
Ele obtém o objeto Graphics da janela, 
define a cor como azul e desenha um círculo na posição do mouse.

public void mouseDragged(MouseEvent e){
    Graphics g = getGraphics();
    g.setColor(Color.BLUE);
    g.fillOval(e.getX(), e.getY(), 20, 20);
}

Este é o método mouseMoved, que é chamado quando o mouse é movido. Ele não faz nada neste código.

public void mouseMoved(MouseEvent e){}

*/
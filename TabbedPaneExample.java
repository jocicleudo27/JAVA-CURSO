import javax.swing.*;
public class TabbedPaneExample{
    JFrame f;
    TabbedPaneExample(){
        f = new JFrame();
        JTextArea ta = new JTextArea(200, 200);
        JPanel p1 = new JPanel();
        p1.add(ta);
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 200, 200);
        tp.add("principal", p1);
        tp.add("visita", p2);
        tp.add("ajuda",p3);
        f.add(tp);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args){
        new TabbedPaneExample();
    }
}
/*public class TabbedPaneExample {
    JFrame f;  

Aqui, estamos declarando uma classe pública chamada TabbedPaneExample e uma variável de instância f do tipo JFrame. JFrame é uma classe em Swing para criar uma janela na qual os componentes podem ser adicionados.

Java

TabbedPaneExample(){  
    f = new JFrame();

Este é o construtor da classe TabbedPaneExample. Ele inicializa a variável f com uma nova instância de JFrame.

Java

JTextArea ta = new JTextArea(200, 200);

Esta linha cria uma nova instância de JTextArea, que é um componente que permite a edição de várias linhas de texto.

Java

JPanel p1 = new JPanel();
p1.add(ta);  

Aqui, um novo JPanel é criado e a área de texto é adicionada a ele. JPanel é uma classe que funciona como um contêiner que pode conter outros componentes.

Java

JPanel p2 = new JPanel();
JPanel p3 = new JPanel();

Estas linhas criam mais dois painéis, p2 e p3.

Java

JTabbedPane tp = new JTabbedPane();
tp.setBounds(50, 50, 200, 200);

Aqui, um novo JTabbedPane é criado e suas dimensões são definidas. JTabbedPane é um componente que permite alternar entre grupos de componentes por meio de abas.

Java

tp.add("principal", p1);
tp.add("visita", p2);
tp.add("ajuda", p3);

Estas linhas adicionam os painéis p1, p2 e p3 ao painel de abas com os títulos “principal”, “visita” e “ajuda”, respectivamente.

Java

f.add(tp);  
f.setSize(400, 400);
f.setLayout(null);  
f.setVisible(true);

Estas linhas adicionam o painel de abas ao quadro, definem o tamanho do quadro, definem o layout do quadro como nulo (o que significa que nenhum gerenciador de layout é usado, e os componentes são posicionados usando suas coordenadas e tamanhos) e tornam o quadro visível.

Java

public static void main(String[] args) {
    new TabbedPaneExample();
}

Este é o método main, onde o programa começa. Ele cria uma nova instância da classe TabbedPaneExample.*/
import javax.swing.*;
public class ProgressBarExample extends JFrame{
    JProgressBar jb;
    int i = 0, num = 0;
    ProgressBarExample(){
        jb = new JProgressBar(0, 2000);
        jb.setBounds(40,40,160, 30);
        jb.setValue(0);
        jb.setStringPainted(true);
        add(jb);
        setSize(250,150);
        setLayout(null);
    }
    public void iterate(){
        while(i <= 2000){
            jb.setValue(i);
            i = i+20;
            try{Thread.sleep(150);}catch(Exception e){}
        }
    }
    public static void main(String[]args){
        ProgressBarExample m = new ProgressBarExample();
        m.setVisible(true);
        m.iterate();
    }
}
/*Claro, vou explicar o código passo a passo:

1. `import javax.swing.*;`: Este comando importa todas as classes do pacote `javax.swing`. 
Este pacote contém classes para criar componentes gráficos na linguagem Java.

2. `public class ProgressBarExample extends JFrame{...}`: Aqui, estamos definindo uma nova classe chamada `ProgressBarExample` 
que herda de `JFrame`. `JFrame` é uma classe no Swing para criar uma janela na interface gráfica.

3. `JProgressBar jb; int i=0,num=0;`: Estas são as variáveis de instância da classe. 
`jb` é um objeto da classe `JProgressBar`, que é usada para criar uma barra de progresso. 
`i` e `num` são variáveis inteiras usadas para controlar o progresso da barra.

4. `ProgressBarExample(){...}`: Este é o construtor da classe `ProgressBarExample`. 
Ele é chamado quando um novo objeto da classe é criado.

5. `jb=new JProgressBar(0,2000);`: Aqui, estamos inicializando a barra de progresso `jb`. 
Os números `0` e `2000` representam o valor mínimo e máximo da barra de progresso, respectivamente.

6. `jb.setBounds(40,40,160,30);`: Este método é usado para definir a posição e o tamanho da barra de progresso na janela. 
Os primeiros dois números são as coordenadas x e y, e os últimos dois números são a largura e a altura.

7. `jb.setValue(0);`: Este método define o valor atual da barra de progresso. Neste caso, estamos definindo para `0`.

8. `jb.setStringPainted(true);`: Este método, quando definido como `true`, 
mostra a porcentagem atual de progresso na barra de progresso.

9. `add(jb);`: Este método adiciona a barra de progresso à janela.

10. `setSize(250,150);`: Este método define o tamanho da janela.

11. `setLayout(null);`: Este método define o gerenciador de layout da janela como `null`. 
Isso significa que você terá que definir manualmente as posições e tamanhos de todos os componentes.

12. `public void iterate(){...}`: Este é um método que atualiza 
o valor da barra de progresso em um loop até atingir o valor máximo.

13. `public static void main(String[] args) {...}`: 
Este é o método principal onde a execução do programa começa. 
Ele cria uma instância da classe `ProgressBarExample` e chama o método `iterate()`.

*/

import javax.swing.*;
public class CheckboxExample1{
    CheckboxExample1(){
        JFrame f = new JFrame("Exemplo de caixa de seleção");

        JCheckBox checkbox1 = new JCheckBox("C++");
        checkbox1.setBounds(100, 100, 50, 50);
        JCheckBox checkbox2 = new JCheckBox("Java", true);

        checkbox2.setBounds(100, 150, 50, 50);
        f.add(checkbox1);
        f.add(checkbox2);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new CheckboxExample1();
    }
}
/*import java.awt.*; // Importa todas as classes do pacote java.awt, que contém todas as classes para criar interfaces gráficas do usuário.
import javax.swing.*; // Importa todas as classes do pacote javax.swing, que é uma extensão do java.awt e adiciona recursos adicionais.

public class CheckboxExample1{ // Declaração da classe pública CheckboxExample1.
    CheckboxExample1(){ // Construtor da classe CheckboxExample1.
        JFrame f = new JFrame("Exemplo de caixa de seleção"); // Cria um novo objeto JFrame (uma janela com borda, barra de título e botões) com o título "Exemplo de caixa de seleção".

        JCheckBox checkbox1 = new JCheckBox("C++"); // Cria um novo objeto JCheckBox (uma caixa de seleção) com o rótulo "C++".
        checkbox1.setBounds(100, 100, 50, 50); // Define a posição (x, y) e o tamanho (largura, altura) do checkbox1 na janela.
        JCheckBox checkbox2 = new JCheckBox("Java", true); // Cria um novo objeto JCheckBox com o rótulo "Java" e o define como selecionado (true).

        checkbox2.setBounds(100, 150, 50, 50); // Define a posição e o tamanho do checkbox2 na janela.
        f.add(checkbox1); // Adiciona o checkbox1 ao JFrame.
        f.add(checkbox2); // Adiciona o checkbox2 ao JFrame.

        f.setSize(400, 400); // Define o tamanho da janela para 400x400 pixels.
        f.setLayout(null); // Define o layout do JFrame como null, o que significa que você precisa definir manualmente a posição e o tamanho de cada componente.
        f.setVisible(true); // Torna a janela visível.
    }
    public static void main(String[] args){ // Método principal que é chamado quando o programa é executado.
        new CheckboxExample1(); // Cria uma nova instância da classe CheckboxExample1, que por sua vez cria a janela e os componentes.
    }
}
*/
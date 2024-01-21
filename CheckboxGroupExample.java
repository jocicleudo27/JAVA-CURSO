import javax.swing.*;

public class CheckboxGroupExample{
    CheckboxGroupExample(){
        JFrame f = new JFrame("Exemplo de CheckboxGroup");
        ButtonGroup cbg = new ButtonGroup();
        JCheckBox checkBox1 = new JCheckBox("C++", false);
        
        checkBox1.setBounds(100, 100, 50, 50);
        JCheckBox checkbox2 = new JCheckBox("Java", true);
        checkbox2.setBounds(100, 150, 50, 50);
        cbg.add(checkBox1);
        cbg.add(checkbox2);
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
/*import javax.swing.*; // Importa todas as classes do pacote javax.swing, que contém todas as classes para criar interfaces gráficas do usuário.

public class CheckboxGroupExample{ // Declaração da classe pública CheckboxGroupExample.
    CheckboxGroupExample(){ // Construtor da classe CheckboxGroupExample.
        JFrame f = new JFrame("Exemplo de CheckboxGroup"); // Cria um novo objeto JFrame (uma janela com borda, barra de título e botões) com o título "Exemplo de CheckboxGroup".
        ButtonGroup bg = new ButtonGroup(); // Cria um novo grupo de botões. Isso é útil para criar um conjunto de botões dos quais apenas um pode ser selecionado.
        JCheckBox checkBox1 = new JCheckBox("C++", false); // Cria um novo objeto JCheckBox (uma caixa de seleção) com o rótulo "C++". O segundo argumento (false) indica que a caixa de seleção não está selecionada por padrão.
        checkBox1.setBounds(100, 100, 50, 50); // Define a posição (x, y) e o tamanho (largura, altura) do checkBox1 na janela.
        JCheckBox checkbox2 = new JCheckBox("Java", true); // Cria um novo objeto JCheckBox com o rótulo "Java". O segundo argumento (true) indica que a caixa de seleção está selecionada por padrão.
        checkbox2.setBounds(100, 150, 50, 50); // Define a posição e o tamanho do checkbox2 na janela.
        bg.add(checkBox1); // Adiciona o checkBox1 ao grupo de botões.
        bg.add(checkbox2); // Adiciona o checkbox2 ao grupo de botões.
        f.add(checkBox1); // Adiciona o checkBox1 ao JFrame.
        f.add(checkbox2); // Adiciona o checkbox2 ao JFrame.
        f.setSize(400, 400); // Define o tamanho da janela para 400x400 pixels.
        f.setLayout(null); // Define o layout do JFrame como null, o que significa que você precisa definir manualmente a posição e o tamanho de cada componente.
        f.setVisible(true); // Torna a janela visível.
    }
    public static void main(String[] args){ // Método principal que é chamado quando o programa é executado.
        new CheckboxGroupExample(); // Cria uma nova instância da classe CheckboxGroupExample, que por sua vez cria a janela e os componentes.
    }
}
 */

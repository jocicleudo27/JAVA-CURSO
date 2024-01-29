import javax.swing.*;

public class TableExample {
    JFrame f;
    TableExample(){
        f = new JFrame();
        String data[][] = { {"101", "Amit", "670000"},
    {"102", "Jai", "780000"},
    {"101", "Sachin", "700000"}};
    String colum[] = {"ID","NOME", "SALARIO"};
    JTable jt = new JTable(data, colum);
    jt.setBounds(30, 40, 200, 300);
    JScrollPane sp = new JScrollPane(jt);
    f.add(sp);
    f.setSize(300, 400);
    f.setVisible(true);
    }
    public static void main(String[] args){
        new TableExample();
    }
}
/*Claro, aqui está uma explicação detalhada do código:

1. `TableExample()`: Este é o construtor da classe `TableExample`. Ele é chamado quando um novo objeto da classe 
`TableExample` é criado.

2. `f = new JFrame();`: Aqui, um novo objeto `JFrame` 
é criado e atribuído à variável `f`. `JFrame` é uma classe em Java Swing usada para 
criar uma janela na qual os componentes podem ser adicionados.

3. `String data[][]={ {"101","Amit","670000"}, {"102","Jai","780000"}, {"101","Sachin","700000"}};`: 
Esta é a matriz de dados que será usada para preencher a tabela. Cada submatriz representa uma linha na tabela.

4. `String column[]={"ID","NOME","SALÁRIO"};`: Este é o array que contém os nomes das colunas da tabela.

5. `JTable jt = new JTable(data, column);`: Aqui, um novo objeto `JTable` 
é criado usando os dados e nomes de colunas definidos anteriormente.

6. `jt.setBounds(30, 40, 200, 300);`: Este método é usado para definir a posição (x, y) 
e o tamanho (largura, altura) da tabela na janela.

7. `JScrollPane sp = new JScrollPane(jt);`: Um `JScrollPane` é criado para a tabela. 
Isso adiciona barras de rolagem à tabela, permitindo que o usuário role se a tabela for muito grande para caber na janela.

8. `f.add(sp);`: O painel de rolagem (que contém a tabela) é adicionado ao quadro.

9. `f.setSize(300, 400);`: O tamanho da janela é definido para 300 pixels de largura e 400 pixels de altura.

10. `f.setVisible(true);`: Isso torna a janela visível. Por padrão, a janela é invisível, 
então você precisa torná-la visível após adicionar todos os componentes.

11. `public static void main(String[] args) { new TableExample(); }`: 
Este é o método `main`, que é o ponto de entrada para qualquer programa Java. 
Ele cria uma nova instância da classe `TableExample`, que por sua vez cria a janela e a tabela.

Espero que isso ajude a entender melhor o código! Se você tiver mais perguntas, fique à vontade para perguntar.*/
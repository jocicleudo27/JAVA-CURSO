// Importando classes e interface
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class aula37 {
    // Classe TreeNode
    static class TreeNode<T> {
        // Para armazenar o valor do nó
        T data;

        // Lista de TreeNode para armazenar
        // os nós filhos
        ArrayList<TreeNode<T> > children;

        // Construtor para atribuir dados ao nó
        TreeNode(T data)
        {
            this.data = data;
            children = new ArrayList<TreeNode<T> >();
        }
    }

    // Função para receber entrada nível a nível
    // ou seja, na travessia em nível
    static TreeNode<Integer> takeInputLevelWise(int arr[])
    {
        int idx = 1; // usada para rastrear a posição atual do array de entrada arr[]

        // Entrada da raiz
        int rootData = arr[0];

        // Inicializa a árvore com um nó raiz
        TreeNode<Integer> root
            = new TreeNode<Integer>(rootData);

        // Inicializa a fila para anexar
        // nó como filho do pai em
        // árvore N-ária
        Queue<TreeNode<Integer> > pendingNodes
            = new LinkedList<TreeNode<Integer> >();

        // Coloca o nó raiz na fila
        pendingNodes.add(root);

        // Enquanto a fila não estiver vazia, anexa
        // filho ao nó
        while (pendingNodes.size() != 0) {

            // Pega o primeiro nó
            TreeNode<Integer> front = pendingNodes.peek();
            pendingNodes.poll();

            // Entrada do número de seus filhos
            int numChild = arr[idx];// é usado para acessar os elementos do array
            idx++;//é incrementado cada vez que um elemento é acessado:

            for (int i = 0; i < numChild; i++) {
                int childData = arr[idx];
                idx++;

                // Cria nó filho
                TreeNode<Integer> child
                    = new TreeNode<Integer>(childData);

                // Anexa nó filho a
                // seu pai
                front.children.add(child);
                pendingNodes.add(child);
            }
        }
        return root;
    }

    // Função para imprimir cada dado do nó
    // em ordem de nível
    static void printLevelATNewLine(TreeNode<Integer> root)
    {
        Queue<TreeNode<Integer> > q
            = new LinkedList<TreeNode<Integer> >();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            TreeNode<Integer> first = q.peek();
            q.poll();

            if (first == null) {
                // Se não houver mais nós
                if (q.isEmpty()) {
                    break;
                }
                // Todos os nós do nível atual são
                // visitados
                System.out.println();
                q.add(null);
                continue;
            }

            System.out.print(first.data + " ");

            // Anexa filho do nó atual à fila
            for (int i = 0; i < first.children.size();
                 i++) {
                q.add(first.children.get(i));
            }
        }
    }

    // Função auxiliar para substituir o
    // dado do nó com o valor de seu nível
    static void helper(TreeNode<Integer> root, int depth)
    {
        // Substitui o dado do nó com
        // sua profundidade
        root.data = depth;
        for (int i = 0; i < root.children.size(); i++) {
            helper(root.children.get(i), depth + 1);
        }
    }

    // Função para substituir com profundidade
    static void
    replaceWithDepthValue(TreeNode<Integer> root)
    {
        helper(root, 0);
    }

    // Código do Driver
    public static void main(String[] args)
    {
        // Dada a travessia em nível de ordem em
        // a matriz arr[]
        int arr[]
            = { 10, 3, 20, 30, 40, 2, 40, 50, 0, 0, 0, 0 };

        // Inicializa a Árvore
        TreeNode<Integer> root;
        root = takeInputLevelWise(arr);

        // Chamada de função para substituir com
        // valor de profundidade
        replaceWithDepthValue(root);

        // Chamada de função para imprimir
        // em ordem de nível
        printLevelATNewLine(root);
    }
}
/*1.A classe TreeNode é usada para criar os nós da árvore. 
Cada nó tem um valor de dados.
T data;
e uma lista de seus nós filhos.
 ArrayList<TreeNode<T> > children;
 
Quando um novo objeto TreeNode é criado, o construtor é chamado com um argumento 
que representa os dados que o nó deve armazenar. 
O construtor faz duas coisas:
1.1 Atribui o valor de data passado como argumento ao campo de dados do nó 
(this.data = data;). 
Isso significa que o nó agora armazena o valor de data.

1.2 Inicializa o campo children do nó com uma nova lista vazia de TreeNode.
children = new ArrayList<TreeNode<T> >(); 
Isso significa que o nó não tem filhos no momento da criação.

2.A função takeInputLevelWise é usada para construir a árvore a partir de um array de entrada. 
A árvore é construída nível por nível (da esquerda para a direita), onde cada nó é seguido pelo 
número de seus filhos e os valores desses filhos.

3.A função printLevelATNewLine é usada para imprimir os valores dos nós da árvore em ordem de nível. 
Ela usa uma fila para percorrer a árvore nível por nível e imprime os valores dos nós.
// A função printLevelATNewLine recebe um nó raiz de uma árvore como argumento.
static void printLevelATNewLine(TreeNode<Integer> root)
{
    // Uma fila 'q' é criada para armazenar os nós da árvore.
    Queue<TreeNode<Integer> > q = new LinkedList<TreeNode<Integer> >();
    
    // O nó raiz é adicionado à fila.
    q.add(root);
    
    // Um valor nulo é adicionado à fila para marcar o fim de um nível na árvore.
    q.add(null);
    
    // Enquanto a fila não estiver vazia, o processo continua.
    while (!q.isEmpty()) {
        
        // O primeiro nó na fila é recuperado e removido da fila.
        TreeNode<Integer> first = q.peek();
        q.poll();

        // Se o nó for nulo, significa que um nível da árvore foi completamente visitado.
        if (first == null) {
            
            // Se a fila estiver vazia, todos os nós da árvore foram visitados e o loop é encerrado.
            if (q.isEmpty()) {
                break;
            }
            
            // Uma nova linha é impressa para indicar o início de um novo nível na árvore.
            System.out.println();
            
            // Um valor nulo é adicionado à fila para marcar o fim do nível atual.
            q.add(null);
            
            // O loop continua com o próximo nó na fila.
            continue;
        }

        // O valor do nó é impresso.
        System.out.print(first.data + " ");

        // Todos os filhos do nó atual são adicionados à fila.
        for (int i = 0; i < first.children.size(); i++) {
            q.add(first.children.get(i));
        }
    }
}


4.A função helper é uma função recursiva que substitui o valor de cada nó pelo seu nível na árvore. 
Ela é chamada pela função replaceWithDepthValue, que inicia a recursão a partir do nó raiz com profundidade 0.
// A função 'helper' é uma função auxiliar recursiva que recebe dois argumentos: um nó da árvore (root) e um valor inteiro (depth).
static void helper(TreeNode<Integer> root, int depth)
{
    // A primeira linha dentro da função substitui o valor do nó atual (root.data) pelo valor de 'depth', que representa a profundidade do nó na árvore.
    root.data = depth;
    
    // Em seguida, temos um loop for que percorre todos os filhos do nó atual.
    for (int i = 0; i < root.children.size(); i++) {
        
        // Dentro do loop, a função 'helper' é chamada recursivamente para cada filho do nó atual.
        // O primeiro argumento para a chamada recursiva é o i-ésimo filho do nó atual.
        // O segundo argumento é 'depth + 1'. Isso porque cada nível abaixo do nó atual na árvore representa um aumento na profundidade.
        helper(root.children.get(i), depth + 1);
    }
}


5.Finalmente, a função main é onde o programa começa. 
Ela cria a árvore a partir de um array de entrada, 
substitui os valores dos nós pelos seus níveis e imprime a árvore. */


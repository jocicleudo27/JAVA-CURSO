class StackNode{
    int data;
    StackNode next;
    public StackNode(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class MyStack{ // Renomeado para MyStack
    StackNode top;
    public void push(int data)
    {
        if(this.top == null)
        {
            top = new StackNode(data);
            return;
        }
        StackNode s = new StackNode(data);
        s.next = this.top;
        this.top = s;
    }

    public StackNode pop()
    {
        StackNode s = this.top;
        this.top = this.top.next;
        return s;
    }

    public void display()
    {
        StackNode s = this.top;
        while(s != null)
        {
            System.out.print(s.data + " ");
            s = s.next;
        }
        System.out.println();
    }

    public void reverse()
    {
        StackNode prev, cur, succ;
        cur = prev = this.top;
        cur = cur.next;
        prev.next = null;
        while(cur != null)
        {
            succ = cur.next;
            cur.next = prev;
            prev = cur;
            cur = succ;
        }
        this.top = prev;
    }
}

public class reverseStackWithoutSpace{
    public static void main(String[] args)
    {
        MyStack s = new MyStack(); // Alterado para MyStack
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Original Stack");
        s.display();
        s.reverse();

        System.out.println("Reversed Stack");
        s.display();
    }
}
/*class StackNode{ // Declaração da classe StackNode
    int data; // Variável de instância para armazenar os dados do nó
    StackNode next; // Variável de instância para referenciar o próximo nó na pilha
    public StackNode(int data) // Construtor da classe StackNode
    {
        this.data = data; // Inicializa a variável de instância data com o valor passado
        this.next = null; // Inicializa a variável de instância next como null
    }
}

class MyStack{ // Declaração da classe MyStack
    StackNode top; // Variável de instância para manter o topo da pilha
    public void push(int data) // Método para adicionar um elemento ao topo da pilha
    {
        if(this.top == null) // Se a pilha estiver vazia
        {
            top = new StackNode(data); // Cria um novo nó e o coloca no topo da pilha
            return;
        }
        StackNode s = new StackNode(data); // Cria um novo nó
        s.next = this.top; // O próximo do novo nó aponta para o antigo topo
        this.top = s; // O novo nó se torna o topo da pilha
    }

    public StackNode pop() // Método para remover um elemento do topo da pilha
    {
        StackNode s = this.top; // Armazena o nó do topo em uma variável temporária
        this.top = this.top.next; // Move o topo para o próximo nó na pilha
        return s; // Retorna o nó removido
    }

    public void display() // Método para exibir os elementos da pilha
    {
        StackNode s = this.top; // Começa pelo topo da pilha
        while(s != null) // Enquanto não chegar ao final da pilha
        {
            System.out.print(s.data + " "); // Imprime o dado do nó atual
            s = s.next; // Move para o próximo nó
        }
        System.out.println(); // Imprime uma nova linha no final
    }

    public void reverse() // Método para reverter a pilha
    {
        StackNode prev, cur, succ; // Declaração de variáveis para manter o nó anterior, atual e sucessor
        cur = prev = this.top; // Inicializa o nó atual e anterior para o topo
        cur = cur.next; // Move o nó atual para o próximo nó
        prev.next = null; // O próximo do nó anterior (topo) se torna null
        while(cur != null) // Enquanto o nó atual não for null
        {
            succ = cur.next; // O nó sucessor se torna o próximo do nó atual
            cur.next = prev; // O próximo do nó atual se torna o nó anterior
            prev = cur; // O nó anterior se torna o nó atual
            cur = succ; // O nó atual se torna o nó sucessor
        }
        this.top = prev; // O nó anterior (último nó da pilha original) se torna o novo topo
    }
}

public class reverseStackWithoutSpace{ // Declaração da classe principal
    public static void main(String[] args) // Método principal
    {
        MyStack s = new MyStack(); // Cria uma nova instância da classe MyStack
        s.push(1); // Adiciona o elemento 1 ao topo da pilha
        s.push(2); // Adiciona o elemento 2 ao topo da pilha
        s.push(3); // Adiciona o elemento 3 ao topo da pilha
        s.push(4); // Adiciona o elemento 4 ao topo da pilha
        System.out.println("Original Stack"); // Imprime "Original Stack"
        s.display(); // Exibe os elementos da pilha
        s.reverse(); // Reverte a pilha

        System.out.println("Reversed Stack"); // Imprime "Reversed Stack"
        s.display(); // Exibe os elementos da pilha revertida
    }
}
 */
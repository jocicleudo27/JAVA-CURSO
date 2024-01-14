/*Criação do HashMap: Um HashMap chamado mp é criado para armazenar os nós da árvore. 
A chave do HashMap é o nó pai e o valor é uma pilha que armazena os filhos desse nó.

Preenchimento do HashMap: O código percorre os nós da primeira árvore (u1 e v1). Para cada par de nós, 
ele verifica se o nó pai (u1[i]) já está no HashMap. Se não estiver, ele cria uma nova pilha, 
coloca o nó filho (v1[i]) na pilha e adiciona o par ao HashMap. Se o nó pai já estiver no HashMap, 
ele simplesmente empilha o nó filho na pilha existente.

Verificação da segunda árvore: O código então percorre os nós da segunda árvore (u2 e v2). 
Para cada par de nós, ele verifica se o nó pai (u2[i]) está no HashMap e se a pilha correspondente não está vazia. 
Se essas condições forem atendidas, ele verifica se o nó filho (v2[i]) é igual ao elemento do topo da pilha. 
Se não for, ele retorna false, indicando que as árvores não são espelhos uma da outra. 
Se for, ele remove o elemento do topo da pilha.

Resultado final: Se todas as verificações passarem, o código retorna true, 
indicando que as duas árvores são espelhos uma da outra. */


import java.util.Stack;
public class aula36
{
    // Function to check given two trees are mirror
    // of each other or not
    static boolean checkMirrorTree(int M, int N, int[] u1, int[] v1, int[] u2, int[] v2)
    {
        
        // Map to store nodes of the tree
        java.util.HashMap<Integer, Stack<Integer>> mp = new java.util.HashMap<>();
     
        // Traverse first tree nodes
        for (int i = 0 ; i < N ; i++ )
        {
           if(!mp.containsKey(u1[i]))
           {
               mp.put(u1[i], new Stack<Integer>());
           }
           else{
               mp.get(u1[i]).push(v1[i]);
           }
        }
           
        // Traverse second tree nodes
        for (int i = 0 ; i < N ; i++)
        {
            if(mp.containsKey(u2[i]) && mp.get(u2[i]).size() > 0)
            {
                if(mp.get(u2[i]).peek() != v2[i])
                  return false;
                mp.get(u2[i]).pop();
            }
        }
     
        return true;
    }
     
  // Driver code
    public static void main(String[] args) {
        int M = 7, N = 6;
       
        // Tree 1
        int[] u1 = { 1, 1, 1, 10, 10, 10 };
        int[] v1 = { 10, 7, 3, 4, 5, 6 };
         
        // Tree 2
        int[] u2 = { 1, 1, 1, 10, 10, 10 };
        int[] v2 = { 3, 7, 10, 6, 5, 4 };
       
        if(checkMirrorTree(M, N, u1, v1, u2, v2))
           System.out.print("Yes");
        else
           System.out.print("No");
    }
}
/*o código assume que duas árvores já existem
e estão representadas como arrays de nós pais (u1 e u2) e nós filhos (v1 e v2).

Aqui está como as árvores são representadas:

Cada índice i nos arrays u1 e v1 representa uma aresta na primeira árvore, 
onde u1[i] é o nó pai e v1[i] é o nó filho.
Da mesma forma, cada índice i nos arrays u2 e v2 representa uma aresta na segunda árvore, 
onde u2[i] é o nó pai e v2[i] é o nó filho.

O código então verifica se as duas árvores são espelhos uma da outra, 
construindo um HashMap para a primeira árvore e depois verificando a segunda árvore contra esse HashMap.

No entanto, a criação explícita de uma árvore em Java geralmente envolve a definição de uma classe. 
para o nó da árvore (que contém o valor do nó e referências aos nós filhos) 
e uma classe para a árvore em si (que contém uma referência ao nó raiz)1. */
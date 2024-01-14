// Java program to traverse an N-ary tree
// without recursion
import java.util.ArrayList;
import java.util.Stack;

class aula38{

// Structure of a node of 
// an n-ary tree
static class Node 
{
	char key;
	ArrayList<Node> child;

	public Node(char key)
	{
		this.key = key;
		child = new ArrayList<>();
	}
};

// Function to traverse tree without recursion
static void traverse_tree(Node root) 
{
	
	// Stack to store the nodes
	Stack<Node> nodes = new Stack<>();

	// push the current node onto the stack
	nodes.push(root);

	// Loop while the stack is not empty
	while (!nodes.isEmpty()) 
	{
		
		// Store the current node and pop
		// it from the stack
		Node curr = nodes.pop();

		// Current node has been travarsed
		if (curr != null)
		{
			System.out.print(curr.key + " ");

			// Store all the childrent of 
			// current node from right to left.
			for(int i = curr.child.size() - 1; i >= 0; i--) 
			{
				nodes.add(curr.child.get(i));
			} 
		}
	}
}

// Driver code
	public static void main(String[] args)
	{
		
		/* Let us create below tree 
		*		 A 
		*	 / / \ \ 
		*	 B F D E 
		*	 / \	 | /|\ 
		*	 K J	 G C H I 
		* / \		 | | 
		* N M	 O L 
		*/

		Node root = new Node('A');
		(root.child).add(new Node('B'));
		(root.child).add(new Node('F'));
		(root.child).add(new Node('D'));
		(root.child).add(new Node('E'));
		(root.child.get(0).child).add(new Node('K'));
		(root.child.get(0).child).add(new Node('J'));
		(root.child.get(2).child).add(new Node('G'));
		(root.child.get(3).child).add(new Node('C'));
		(root.child.get(3).child).add(new Node('H'));
		(root.child.get(3).child).add(new Node('I'));
		(root.child.get(0).child.get(0).child).add(new Node('N'));
		(root.child.get(0).child.get(0).child).add(new Node('M'));
		(root.child.get(3).child.get(0).child).add(new Node('O'));
		(root.child.get(3).child.get(2).child).add(new Node('L'));

		traverse_tree(root);
	}
}

/*static class Node // Declaração de uma classe estática chamada Node
Esta classe Node é usada para representar um nó em uma árvore n-ária.
Cada nó pode ter um número arbitrário de filhos, que são armazenados na lista child. 
A chave ou o valor que cada nó armazena é do tipo char e é armazenado na variável key.
{
	char key; // Declaração de uma variável de caractere chamada key. Esta variável representa a chave ou o valor que o nó armazena.

	ArrayList<Node> child; Declaração de uma lista de nós chamada child. Esta lista armazena referências p/ todos os nós filhos deste nó.

	public Node(char key) // Este é o construtor da classe Node. Ele é chamado quando um novo objeto da classe Node é criado.
	{
		this.key = key; // Atribui o valor do parâmetro key à variável de instância key. 
							Isso significa que o valor do nó é definido como o valor passado quando o nó é criado.

		child = new ArrayList<>(); // Inicializa a variável de instância child como uma nova lista de nós. 
										Isso significa que inicialmente o nó não tem filhos.
	}
};
 */
/*Este método é usado para percorrer uma árvore n-ária sem usar recursão. 
Ele usa uma pilha para armazenar os nós que ainda precisam ser visitados. 
O método começa adicionando o nó raiz à pilha. Então, enquanto a pilha não estiver vazia, 
ele remove o nó do topo da pilha, imprime sua chave e adiciona todos os seus filhos à pilha. 
Isso continua até que todos os nós tenham sido visitados e a pilha esteja vazia. 

Declaração de um método estático chamado traverse_tree que recebe um nó como parâmetro
static void traverse_tree(Node root) 
{
	
	// Pilha para armazenar os nós
	Stack<Node> nodes = new Stack<>(); // Cria uma nova pilha de nós

	// Empilha o nó atual na pilha
	nodes.push(root); // Adiciona o nó raiz à pilha

	// Loop enquanto a pilha não estiver vazia
	while (!nodes.isEmpty()) // Enquanto a pilha não estiver vazia, continua o loop
	{
		
		// Armazena o nó atual e desempilha
		// da pilha
		OBS:Node curr = ... cria uma nova variável chamada curr do tipo Node. 
		A variável curr é então inicializada com o nó que foi removido da pilha.
		Node curr = nodes.pop(); // Remove o nó do topo da pilha e o armazena na variável curr

		// O nó atual foi percorrido 
		if (curr != null) // Se o nó atual não for nulo
		{
			System.out.print(curr.key + " "); // Imprime a chave do nó atual

			// Armazena todos os filhos do
			// nó atual da direita para a esquerda.
			for(int i = curr.child.size() - 1; i >= 0; i--) // Para cada filho do nó atual, da direita para a esquerda
			{
				nodes.add(curr.child.get(i)); // Adiciona o filho à pilha
			} 
		}
	}
}
Este método main cria uma árvore n-ária e depois a percorre usando o método 
traverse_tree. 
A árvore é criada adicionando nós filhos aos nós pais. A chave de cada nó é um caractere.
 */
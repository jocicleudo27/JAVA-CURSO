class TOH{ // Declaração da classe chamada 'TOH'
	
// A structure to represent a stack
class Stack // Declaração de uma classe interna chamada 'Stack'
{
	int capacity; // Variável para armazenar a capacidade da pilha
	int top; // Variável para armazenar o índice do topo da pilha
	int array[]; // Array para armazenar os elementos da pilha
}

// Function to create a stack of given capacity.
Stack createStack(int capacity) // Método para criar uma pilha de capacidade dada
{
	Stack stack = new Stack(); // Cria uma nova instância da classe Stack
	stack.capacity = capacity; // Define a capacidade da pilha
	stack.top = -1; // Inicializa o topo da pilha como -1, indicando que a pilha está vazia
	stack.array = new int[capacity]; // Cria um novo array de inteiros com a capacidade dada
	return stack; // Retorna a pilha criada
}

// A pilha está cheia quando o topo é igual ao último índice
boolean isFull(Stack stack) // Método para verificar se a pilha está cheia
{
	return (stack.top == stack.capacity - 1); // Retorna verdadeiro se o topo da pilha for igual à capacidade da pilha menos 1, indicando que a pilha está cheia
}

// Stack está vazio quando o topo é igual a -1
boolean isEmpty(Stack stack) // Método para verificar se a pilha está vazia
{
	return (stack.top == -1); // Retorna verdadeiro se o topo da pilha for -1, indicando que a pilha está vazia
}

// Function to add an item to stack.It 
// increases top by 1
void push(Stack stack, int item) // Método para adicionar um item à pilha
{
	if (isFull(stack)) // Se a pilha estiver cheia, retorna sem fazer nada
		return;
		
	stack.array[++stack.top] = item; // Incrementa o topo da pilha e adiciona o item no novo topo
}

// Function to remove an item from stack.It
// decreases top by 1
int pop(Stack stack) // Método para remover um item da pilha
{
	if (isEmpty(stack)) // Se a pilha estiver vazia, retorna o menor valor inteiro possível
		return Integer.MIN_VALUE;
		
	return stack.array[stack.top--]; // Retorna o item no topo da pilha e decrementa o topo
}

// Função para implementar a movimentação legal entre
//dois polos
void moveDisksBetweenTwoPoles(Stack src, Stack dest, 
							char s, char d) // Método para mover discos entre dois postes
{
	int pole1TopDisk = pop(src); // Remove o disco do topo do poste 1
	int pole2TopDisk = pop(dest); // Remove o disco do topo do poste 2

	// Quando o polo 1 está vazio
	if (pole1TopDisk == Integer.MIN_VALUE) // Se o poste 1 estiver vazio (indicado pelo retorno de pop() ser o menor valor inteiro possível)
	{
		push(src, pole2TopDisk); // Adiciona o disco do topo do poste 2 de volta ao poste 1
		moveDisk(d, s, pole2TopDisk); // Registra o movimento do disco do poste 2 para o poste 1
	}
	
	//Quando o polo 2 está vazio
	else if (pole2TopDisk == Integer.MIN_VALUE) // Se o poste 2 estiver vazio
	{
		push(dest, pole1TopDisk); // Adiciona o disco do topo do poste 1 de volta ao poste 2
		moveDisk(s, d, pole1TopDisk); // Registra o movimento do disco do poste 1 para o poste 2
	}
	
	// Quando o disco superior do polo1 > disco superior do polo2
	else if (pole1TopDisk > pole2TopDisk) // Se o disco do topo do poste 1 for maior que o disco do topo do poste 2
	{
		push(src, pole1TopDisk); // Adiciona o disco do topo do poste 1 de volta ao poste 1
		push(src, pole2TopDisk); // Adiciona o disco do topo do poste 2 ao poste 1
		moveDisk(d, s, pole2TopDisk); // Registra o movimento do disco do poste 2 para o poste 1
	}
	// Quando o disco superior do polo1 < o disco superior do polo2
	else // Se o disco do topo do poste 1 for menor que o disco do topo do poste 2
	{
		push(dest, pole2TopDisk); // Adiciona o disco do topo do poste 2 de volta ao poste 2
		push(dest, pole1TopDisk); // Adiciona o disco do topo do poste 1 ao poste 2
		moveDisk(s, d, pole1TopDisk); // Registra o movimento do disco do poste 1 para o poste 2
	}
}

//Método para registrar o movimento de um disco de um poste para outro
void moveDisk(char fromPeg, char toPeg, int disk) 
{
	System.out.println("Move the disk " + disk + 
							" from " + fromPeg + 
							" to " + toPeg); // Imprime a mensagem de movimento do disco
}

// Método para resolver o quebra-cabeça da Torre de Hanói de forma iterativa
void tohIterative(int num_of_disks, Stack
				src, Stack aux, Stack dest) 
{
	int i, total_num_of_moves;
	char s = 'S', d = 'D', a = 'A';

	// If number of disks is even, then 
	// interchange destination pole and
	// auxiliary pole
	if (num_of_disks % 2 == 0) // Se o número de discos for par
	{
		char temp = d; // Troca os postes de destino e auxiliar
		d = a;
		a = temp;
	}
	total_num_of_moves = (int)(Math.pow(
						2, num_of_disks) - 1); // Calcula o número total de movimentos necessários

	// Larger disks will be pushed first
	for(i = num_of_disks; i >= 1; i--) // Adiciona os discos ao poste de origem, começando pelo maior disco
		push(src, i);

	for(i = 1; i <= total_num_of_moves; i++) // Para cada movimento
	{
		if (i % 3 == 1) // Se o movimento for do tipo 1 (1, 4, 7, etc.)
		moveDisksBetweenTwoPoles(src, dest, s, d); // Move discos entre os postes de origem e de destino

		else if (i % 3 == 2) // Se o movimento for do tipo 2 (2, 5, 8, etc.)
		moveDisksBetweenTwoPoles(src, aux, s, a); // Move discos entre os postes de origem e auxiliar

		else if (i % 3 == 0) // Se o movimento for do tipo 3 (3, 6, 9, etc.)
		moveDisksBetweenTwoPoles(aux, dest, a, d); // Move discos entre os postes auxiliar e de destino
	}
}

// Driver code
public static void main(String[] args) // Método principal que é executado quando o programa é iniciado
{
	
	// Input: number of disks
	int num_of_disks = 3; // Define o número de discos
	
	TOH ob = new TOH(); // Cria uma nova instância da classe TOH
	Stack src, dest, aux; // Declara três pilhas: origem, destino e auxiliar
	
	// Create three stacks of size 'num_of_disks'
	// to hold the disks
	src = ob.createStack(num_of_disks); // Cria a pilha de origem
	dest = ob.createStack(num_of_disks); // Cria a pilha de destino
	aux = ob.createStack(num_of_disks); // Cria a pilha auxiliar
	
	ob.tohIterative(num_of_disks, src, aux, dest); // Resolve o quebra-cabeça da Torre de Hanói de forma iterativa
}
}
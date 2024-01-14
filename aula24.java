class aula24{ // Declaração da classe chamada 'aula24'
    static  int MAX = 1000; // Declaração de uma variável estática 'MAX' com valor 1000

    // Método que retorna o índice do próximo maior elemento à esquerda para cada elemento de um array
    static int[] nextGreaterInLeft(int []a, int n) 
    {
        int []left_index = new int[MAX]; // Cria um novo array 'left_index' de tamanho 'MAX'
        java.util.Stack<Integer> s = new java.util.Stack<Integer>(); // Cria uma nova pilha 's'

        // Loop que percorre o array 'a' de trás para frente
        for(int i = n -1; i >= 0; i--)
        {
            // Enquanto a pilha não estiver vazia e o elemento atual for maior que o elemento no topo da pilha
            while (s.size() != 0 && a[i] > a[s.peek() -1]) {
                int r = s.peek(); // Pega o elemento no topo da pilha
                s.pop(); // Remove o elemento no topo da pilha
                left_index[r -1] = i + 1; // Atualiza o índice do próximo maior elemento à esquerda
            }
            s.push(i + 1); // Adiciona o índice atual (incrementado por 1) à pilha
        }
        return left_index; // Retorna o array 'left_index'
    }

    // Método semelhante ao anterior, mas que retorna o índice do próximo maior elemento à direita
    static int[] nextGreaterInRight(int []a, int n)
    {
        int []right_index = new int[MAX]; // Cria um novo array 'right_index' de tamanho 'MAX'
        java.util.Stack<Integer> s = new java.util.Stack<Integer>(); // Cria uma nova pilha 's'

        // Loop que percorre o array 'a' da esquerda para a direita
        for(int i = 0; i < n; ++i){
            // Enquanto a pilha não estiver vazia e o elemento atual for maior que o elemento no topo da pilha
            while (s.size() != 0 && a[i] > a[s.peek() -1]) {
                int r = s.peek(); // Pega o elemento no topo da pilha
                s.pop(); // Remove o elemento no topo da pilha
                right_index[r -1] = i + 1; // Atualiza o índice do próximo maior elemento à direita
            }
            s.push(i + 1); // Adiciona o índice atual (incrementado por 1) à pilha
        }
        return right_index; // Retorna o array 'right_index'
    }

    // Método que retorna o produto máximo dos índices dos próximos maiores elementos à esquerda e à direita
    static int LRProduct(int []arr, int n)
    {
        int []left = nextGreaterInLeft(arr, n); // Obtém os índices dos próximos maiores elementos à esquerda
        int []right = nextGreaterInRight(arr, n); // Obtém os índices dos próximos maiores elementos à direita
        int ans = -1; // Inicializa a resposta como -1

        // Loop que percorre os arrays 'left' e 'right'
        for(int i = 0; i < n; i++)
        {
            ans = Math.max(ans, left[i]* right[i]); // Atualiza a resposta com o produto máximo
        }
        return ans; // Retorna a resposta
    }

    // Método principal que é executado quando o programa é iniciado
    public static void main(String[] args) {
        int []arr = new int[]{5, 4, 3, 4, 5}; // Cria um array 'arr'
        int n = arr.length; // Obtém o tamanho do array

        System.out.print(LRProduct(arr, n)); // Imprime o produto máximo retornado pelo método 'LRProduct'
    }
}

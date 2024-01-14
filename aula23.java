// Define uma classe chamada GFG
class GFG {

    // Define um método estático chamado NFG que recebe três parâmetros: um array de inteiros, um inteiro n e um array de inteiros freq
    static void NFG(int a[], int n, int freq[])
    {
        // Cria uma nova instância de Stack para armazenar as posições dos elementos do array
        java.util.Stack<Integer> s = new java.util.Stack<Integer>();
        s.push(0);

        // Cria um novo array de inteiros chamado res para armazenar os valores dos próximos elementos de maior frequência para cada elemento
        int res[] = new int[n];
        for (int i = 0; i < n; i++)
            res[i] = 0;

        // Loop que percorre o array a partir do segundo elemento
        for (int i = 1; i < n; i++) 
        {
            // Se a frequência do elemento apontado pelo topo da pilha é maior que a frequência do elemento atual, empilha a posição atual i na pilha
            if (freq[a[s.peek()]] > freq[a[i]])
                s.push(i);
            else
            {
                // Se a frequência do elemento apontado pelo topo da pilha é menor que a frequência do elemento atual, desempilha a pilha e continua desempilhando até que a condição acima seja verdadeira ou a pilha esteja vazia
                while (freq[a[s.peek()]] < freq[a[i]]
                    && s.size() > 0) 
                {
                    res[s.peek()] = a[i];
                    s.pop();
                }

                // Empilha o elemento atual
                s.push(i);
            }
        }

        // Enquanto a pilha não estiver vazia, desempilha a pilha e atribui -1 ao elemento correspondente no array res
        while (s.size() > 0) 
        {
            res[s.peek()] = -1;
            s.pop();
        }

        // Loop que percorre o array res e imprime cada elemento
        for (int i = 0; i < n; i++) 
        {
            System.out.print(res[i] + " ");
        }
    }

    // Método principal que é executado quando o programa é iniciado
    public static void main(String args[])
    {
        // Define um array de inteiros a e um inteiro len
        int a[] = { 1, 1, 2, 3, 4, 2, 1 };
        int len = 7;

        // Define um inteiro max e o inicializa com o menor valor possível para um inteiro
        int max = Integer.MIN_VALUE;

        // Loop que percorre o array a e atualiza max para o maior elemento encontrado
        for (int i = 0; i < len; i++)
        {
            if (a[i] > max) 
            {
                max = a[i];
            }
        }

        // Define um array de inteiros freq e inicializa todos os elementos com 0
        int freq[] = new int[max + 1];
        for (int i = 0; i < max + 1; i++)
            freq[i] = 0;

        // Loop que percorre o array a e incrementa a frequência do elemento correspondente no array freq
        for (int i = 0; i < len; i++)
        {
            freq[a[i]]++;
        }

        // Chama o método NFG com os parâmetros a, len e freq
        NFG(a, len, freq);
    }
}

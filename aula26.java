import java.util.Stack;

class SortStack // Define uma nova classe chamada SortStack.
{
    public static Stack<Integer> sortstack(Stack<Integer>input) // Declara um método público e estático chamado sortstack que recebe uma pilha de inteiros como entrada e retorna uma pilha de inteiros.
    {
        Stack<Integer> tmpStack = new Stack<Integer>(); // Cria uma nova pilha de inteiros chamada tmpStack.

        while(!input.isEmpty()) // Enquanto a pilha de entrada não estiver vazia...
        {
            int tmp = input.pop(); // ...remove o elemento do topo da pilha de entrada e o armazena na variável tmp.

            while(!tmpStack.isEmpty() && tmpStack.peek() < tmp) // Enquanto a pilha tmpStack não estiver vazia e o elemento do topo for menor que tmp...
            {
                input.push(tmpStack.pop()); // ...remove o elemento do topo da pilha tmpStack e o adiciona à pilha de entrada.
            }
            tmpStack.push(tmp); // Adiciona tmp ao topo da pilha tmpStack.
        }
        return tmpStack; // Retorna a pilha tmpStack.
    }

    // Código do driver
    public static void main(String[] args) // Declara o método principal que é o ponto de entrada do programa.
    {
        Stack<Integer> input = new Stack<Integer>(); // Cria uma nova pilha de inteiros chamada input.
        input.add(34); 
        input.add(3); 
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);
        input.search(98);
        input.size();
        System.out.println("Posição do número 98 na pilha: " + input.search(98));
        System.out.println("Tamanho da pilha: " + input.size()); 

        Stack<Integer> tmpStack = sortstack(input); // Chama o método sortstack com a pilha input como argumento e armazena o resultado na pilha tmpStack.

        System.out.println("Sorted numbers are:"); // Imprime a string "Sorted numbers are:" na saída padrão.

        while(!tmpStack.empty()) // Enquanto a pilha tmpStack não estiver vazia...
        {
            System.out.print(tmpStack.pop()+" "); // ...remove o elemento do topo da pilha tmpStack e o imprime na saída padrão.
            
        }
    }
}
/*

1. Primeiro, você importa a classe `Stack` do pacote `java.util`. Isso é necessário para usar pilhas no seu código.

2. Em seguida, você cria uma classe chamada `SortStack`. Esta é a classe principal do seu programa.
class SortStack

3. Dentro da classe `SortStack`, você define um método estático chamado `sortstack`. Este método recebe uma pilha de inteiros como entrada e retorna uma pilha de inteiros.
public static Stack<Integer> sortstack(Stack<Integer>input)

4. No início do método `sortstack`, você cria uma nova pilha de inteiros chamada `tmpStack`. Esta pilha será usada para armazenar temporariamente os elementos da pilha de entrada.
Stack<Integer>tmpStack = new Stack<Integer>();

5. Então, enquanto a pilha de entrada não estiver vazia, você faz o seguinte:
   - Remove o elemento do topo da pilha de entrada e o armazena em uma variável chamada `tmp`.
   - Enquanto a pilha `tmpStack` não estiver vazia e o elemento do topo for menor que `tmp`, você remove o elemento do topo da pilha `tmpStack` e o adiciona à pilha de entrada.
   - Depois disso, você adiciona `tmp` ao topo da pilha `tmpStack`.
   while(!input isEmpty())
   {
    int tmp = input.pop();
    while(!tmpStack.isEmpty() && tmpStack.peek() < tmp)
    {
        input.push(tmpStack.pop());
    }
    tmpStack.push(tmp);
   }
   

6. Quando todos os elementos da pilha de entrada tiverem sido processados, o método `sortstack` retorna a pilha `tmpStack`.
return tmpStack;

7. No método `main`, que é o ponto de entrada do programa, você cria uma nova pilha de inteiros chamada `input` e adiciona alguns números a ela.
public static void main(String[] args)

8. Em seguida, você chama o método `sortstack` com a pilha `input` como argumento e armazena o resultado na pilha `tmpStack`.
Stack<Integer> input = sortstack(input);

9. Depois disso, você imprime a string "Sorted numbers are:".
System.out.println("Sorted number are:");

10. Finalmente, enquanto a pilha `tmpStack` não estiver vazia, você remove o elemento do topo da pilha `tmpStack` e o imprime.
while(!tmpStack.empty)
{
    System.out.print(tmpStack.pop()+" ");
}

 😊 */


/*1 Crie uma pilha vazia.
Comece a partir da primeira barra e faça o seguinte para cada barra hist[i] onde 'i' varia de 0 a n-1
2 Se a pilha estiver vazia ou hist[i] for maior do que a barra no topo da pilha, pressione 'i' para empilhar.
3 Se essa barra for menor que o topo da pilha, continue removendo o topo da pilha enquanto o topo da pilha for maior.
4 Deixe a barra removida ser hist[tp]. Calcule a área do retângulo com hist[tp] como a menor barra.
Para hist[tp], o 'índice esquerdo' é o item anterior (anterior ao tp) na pilha e o 'índice direito' é 'i' (índice atual).
5 Se a pilha não estiver vazia, remova uma a uma todas as barras da pilha e faça a etapa (2.2 e 2.3) para cada barra removida */

import java.util.Stack;

public class aula31
{
    static int getMaxArea(int hist[], int n)
    {
        Stack<Integer> s = new Stack<>();
        int max_area = 0;
        int tp;
        int area_with_top;

        int i = 0;
        while(i < n){
            if(s.empty() || hist[s.peek()] <= hist[i]){
                s.push(i++);
            }else{
                tp = s.peek();
                s.pop();
                area_with_top = hist[tp]
                    * (s.empty() ? i : i - s.peek() -1);
                if(max_area < area_with_top)
                    max_area = area_with_top;
            }
        }
        return max_area;
    }
    public static void main(String[] args)
    {
        int hist[] = {6, 2, 5, 4, 5, 1, 6};

        System.out.println("Maximum area is: "
        + getMaxArea(hist, hist.length));
    }
}
/*A função getMaxArea recebe um array de inteiros hist e um inteiro n que representa o número de barras no histograma.

Uma pilha s é criada para armazenar os índices das barras do histograma.

A variável max_area é inicializada com 0 e será usada para armazenar a área máxima encontrada.

A variável tp será usada para armazenar o índice da barra no topo da pilha.

A variável area_with_top será usada para armazenar a área com a barra no topo da pilha.

O código então entra em um loop while que percorre as barras do histograma.

Dentro do loop, se a pilha estiver vazia ou se a altura da barra atual for maior ou igual à barra no topo da pilha, 
o índice da barra atual é empilhado.

Se a altura da barra atual for menor que a barra no topo da pilha, então calculamos a área de retângulo com a barra no topo da pilha 
como altura. Para isso, removemos a barra do topo da pilha e calculamos a área. 
A largura do retângulo é calculada como a diferença entre o índice atual e o índice da nova barra no topo da pilha, subtraído por 1. 
Se a pilha estiver vazia, a largura do retângulo é o índice atual.

Se a área calculada for maior que max_area, então atualizamos max_area.

O loop continua até que todas as barras sejam processadas.

Finalmente, a função retorna max_area que é a maior área retangular no histograma. */
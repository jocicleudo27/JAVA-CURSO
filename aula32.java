//Encontrar o máximo de mínimo para cada tamanho de janela em uma determinada matriz 
/*Atravessar um loop em K de1 a N
Inicializar uma variável maxOfMin = INT_MIN
Inicializar um loop aninhado em i de 0 até N – K
Inicializar uma variável min = arr[i]
Inicializar outro loop aninhado em j de 1 a K
Se min > arr[i + j]
Atualização min = arr[i + j]
Se maxOfMin < min
Atualização maxOfMin = min
Imprima maxOfMin para a janela de tamanho K. */

class Test{
    static int arr[] = {10, 20, 30, 50, 10, 70, 30};

    static void printMaxOfMin(int n)
    {
        for(int K = 1; K <= n; K++){
            int maxOfMin = Integer.MIN_VALUE;
            for(int i = 0; i <= n - K; i++){
                int min = arr[i];
                for(int j = 1; j < K; j++){
                    if(arr[i + j] < min)
                        min = arr[i + j];
                }
                if(min > maxOfMin)
                    maxOfMin = min;
            }
            System.out.print(maxOfMin + " ");
        }
    }
    public static void main(String[] args){
        printMaxOfMin(arr.length);
    }
}

/*A função printMaxOfMin recebe um inteiro n que representa o número de elementos no array arr.

O código então entra em um loop for externo que percorre todos os possíveis tamanhos de janela K de 1 a n.

Para cada tamanho de janela K, inicializa maxOfMin como o menor valor inteiro possível.

Em seguida, entra em um loop for interno que percorre todas as janelas possíveis de tamanho K no array.

Para cada janela, encontra o valor mínimo min na janela.

Se min for maior que maxOfMin, então atualiza maxOfMin com min.

Após verificar todas as janelas de tamanho K, imprime maxOfMin, que é o máximo dos mínimos para janelas de tamanho K.

O processo é repetido para todos os tamanhos de janela possíveis de 1 a n. */
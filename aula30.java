import java.util.Stack;

class aula30
{
    static boolean check(int A[], int N)
    {
        Stack<Integer> s = new Stack<Integer>();

        int B_end = 0;
        for(int i = 0; i < N; i++)
        {
            if(!s.empty())
            {
                int top = s.peek();
                while(top == B_end + 1)
                {
                    B_end = B_end + 1;
                    s.pop();
                    if(s.empty())
                    {
                        break;
                    }
                    top = s.peek();
                }
                
                if(s.empty())
                {
                    s.push(A[i]);
                }else{
                    top = s.peek();
                    if(A[i] < top){
                        s.push(A[i]);
                    }else{
                        return false;
                    }
                }
            }else{
                s.push(A[i]);
            }
        }
        return true;
    }
    //Dreive code
    public static void main(String[] args){
        int A[] = {4, 1, 2, 3};
        int N = A.length;

        if(check(A, N)){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
//https://www.geeksforgeeks.org/check-array-stack-sortable/?ref=lbp


/*Este código Java verifica se uma sequência de números pode ser reordenada para formar uma sequência crescente 
consecutiva usando uma pilha. Aqui está a lógica passo a passo:

1. O código cria uma pilha `s` e um contador `B_end` inicializado com 0.

2. Ele percorre o array `A[]` de tamanho `N`. Para cada elemento `A[i]`, ele verifica se a pilha está vazia.

3. Se a pilha não estiver vazia, ele verifica se o elemento no topo da pilha é igual a `B_end + 1`. Se for, 
ele incrementa `B_end` e remove o elemento do topo da pilha. Ele continua fazendo isso até que o elemento 
no topo da pilha não seja igual a `B_end + 1` ou até que a pilha esteja vazia.

4. Se a pilha estiver vazia após o passo 3, ele empurra `A[i]` para a pilha. Se a pilha não estiver vazia, 
ele verifica se `A[i]` é menor que o elemento no topo da pilha. 
Se for, ele empurra `A[i]` para a pilha. Se `A[i]` for maior, ele retorna `false`, indicando que a sequência não 
pode ser reordenada para formar uma sequência crescente.

5. Se a pilha estiver vazia no início (ou seja, antes do passo 3), ele empurra `A[i]` para a pilha.

6. Após processar todos os elementos de `A[]`, se a função não retornou `false`, ela retorna `true`, 
indicando que a sequência pode ser reordenada para formar uma sequência crescente.

Espero que isso ajude a entender a lógica do código! 😊 */
/*import java.util.Stack;

public class desafio{
    //Função para return de precedencia de operadores.
    static int prec(char c){
        if(c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if(c == '+' || c == '-')
            return 1;
        else 
            return -1;
    }
    //Função para return de associatividade de operadores
    static char associatividade(char c){
        if(c == '^')
            return 'R';
        return 'L';//Default para associatividaesquerda
    }
    // The main função para converter infix expre
    static void infixToPostfix(String s){
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            //if the scanned character is an operrand,, add
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')){
                result.append(c);
            }
            // If the scanned character is an ‘(‘, push it to the stack.
            else if(c == '('){
                stack.push(c);
            }
             // If the scanned character is an ‘)’, pop and add to the output string from the stack
            // until an ‘(‘ is encountered.
            else if(c == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    result.append(stack.pop());
                }
                stack.pop();
            }
            //if an operand is scanned
            else{
                while(!stack.isEmpty() && (prec(s.charAt(i)) < prec(stack.peek()) ||
                prec(s.charAt(i)) == prec(stack.peek()) && 
                associatividade(s.charAt(i)) == 'L')){
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        // Pop all the remaining elements from the stack
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        System.out.println(result);
    }
    //Driver code
    public static void main(String[] args){
        String exp = "a+b*(c^d-e)^(f+g*h)-i";

        //function call
        infixToPostfix(exp);
    }
} */


/*Digitalize a expressão infix da esquerda para a direita.
Se o caractere digitalizado for um operando, coloque-o na expressão postfix.
Caso contrário, faça o seguinte
Se a precedência e a associatividade do operador digitalizado forem maiores do que a precedência e a associatividade do operador 
na pilha [ou a pilha estiver vazia ou a pilha contiver um '('], então empurre-a na pilha. ['^' operador é associativo 
direito e outros operadores como '+','–','*' e '/' são esquerdo-associativo].
Verifique especialmente se há uma condição quando o operador na parte superior da pilha e o operador digitalizado são '^'. 
Nessa condição, a precedência do operador escaneado é maior devido à sua associatividade direita. Assim, 
ele será empurrado para a pilha do operador.
Em todos os outros casos, quando a parte superior da pilha do operador é a mesma que o operador digitalizado, 
então solte o operador da pilha devido à associatividade esquerda devido à qual o operador digitalizado tem menos precedência.
Caso contrário, coloque todos os operadores da pilha que são maiores ou iguais à precedência do operador digitalizado.
Depois de fazer isso, empurre o operador digitalizado para a pilha. (Se você encontrar parênteses ao estourar, pare lá e empurre o operador digitalizado na pilha.)
Se o caractere digitalizado for um '(', empurre-o para a pilha.
Se o caractere digitalizado for um ')', coloque a pilha e a produza até que um '(' seja encontrado e descarte ambos os parênteses.
Repita as etapas de 2 a 5 até que a expressão infix seja verificada.
Quando a varredura terminar, coloque a pilha e adicione os operadores na expressão postfix até que ela não esteja vazia.
Finalmente, imprima a expressão postfix. */
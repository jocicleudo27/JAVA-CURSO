// Java program to find index of closing 
// bracket for given opening bracket. 
import java.util.Stack;
class aula33 {

// Function to find index of closing 
// bracket for given opening bracket. 
	static void test(String expression, int index) {
		int i;

		// If index given is invalid and is 
		// not an opening bracket. 
		if (expression.charAt(index) != '[') {
			System.out.print(expression + ", "
					+ index + ": -1\n");
			return;
		}

		// Stack to store opening brackets. 
		Stack<Integer> st = new Stack<>();

		// Traverse through string starting from 
		// given index. 
		for (i = index; i < expression.length(); i++) {

			// If current character is an 
			// opening bracket push it in stack. 
			if (expression.charAt(i) == '[') {
				st.push((int) expression.charAt(i));
			} // If current character is a closing 
			// bracket, pop from stack. If stack 
			// is empty, then this closing 
			// bracket is required bracket. 
			else if (expression.charAt(i) == ']') {
				st.pop();
				if (st.empty()) {
					System.out.print(expression + ", "
							+ index + ": " + i + "\n");
					return;
				}
			}
		}

		// If no matching closing bracket 
		// is found. 
		System.out.print(expression + ", "
				+ index + ": -1\n");
	}

// Driver Code 
	public static void main(String[] args) {
		test("[ABC[23]][89]", 0); // should be 8 
		test("[ABC[23]][89]", 4); // should be 7 
		test("[ABC[23]][89]", 9); // should be 12 
		test("[ABC[23]][89]", 1); // No matching bracket 
	}
}
/*class aula33 {: Inicia a definição da classe aula33.

static void test(String expression, int index) {: Define um método estático chamado test que recebe uma string expression e um inteiro 
index como parâmetros.

int i;: Declara uma variável inteira i que será usada como contador no loop for.

if (expression.charAt(index) != '[') {: Verifica se o caractere na posição index na expression não é um colchete de abertura. 
Se não for, imprime uma mensagem e retorna do método.

Stack<Integer> st = new Stack<>();: Cria uma nova pilha st para armazenar os índices dos colchetes de abertura.

for (i = index; i < expression.length(); i++) {: Inicia um loop for que percorre a expression a partir do index dado.

if (expression.charAt(i) == '[') {: Verifica se o caractere atual é um colchete de abertura. Se for, empilha o valor ASCII do 
caractere na pilha st.

else if (expression.charAt(i) == ']') {: Verifica se o caractere atual é um colchete de fechamento. Se for, desempilha um elemento da 
pilha st.

if (st.empty()) {: Verifica se a pilha st está vazia. Se estiver, imprime a expression, o index e o índice do colchete de fechamento correspondente, e retorna do método.

System.out.print(expression + ", " + index + ": -1\n");: Se nenhum colchete de fechamento correspondente for encontrado, 
imprime a expression, o index e -1.

public static void main(String[] args) {: Define o método main, que é o ponto de entrada para qualquer aplicativo Java.

test("[ABC[23]][89]", 0);: Chama o método test com a expressão "[ABC[23]][89]" e o índice 0. */
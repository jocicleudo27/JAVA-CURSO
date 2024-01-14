import java.util.Scanner;

public class achar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int start = s.nextInt();
        System.out.println("Digite o segundo numero: ");
        int end = s.nextInt();
        s.close();
        System.out.println("Lista de numeros primos entre " + start + " e " + end);
        for(int i = start; i <= end; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
/*Scanner s = new Scanner(System.in);: Esta linha cria um objeto Scanner 
que é usado para ler a entrada do usuário.
int start = s.nextInt(); e int end = s.nextInt();: Estas linhas lêem dois números 
inteiros do usuário. Estes serão os limites dentro dos quais o programa procurará 
números primos. 
for(int i = start; i <= end; i++): Este loop percorre todos os números entre start e end.
if(isPrime(i)): Para cada número, o programa verifica se ele é primo chamando a função isPrime.
public static boolean isPrime(int n): Esta é uma função que verifica se um número 
n é primo. Ela retorna true se o número for primo e false caso contrário.
for(int i = 2; i <= Math.sqrt(n); i++): Este loop verifica 
se n é divisível por qualquer número até a raiz quadrada de n. 
Se n for divisível por qualquer número nesse intervalo, então n não é primo.*/

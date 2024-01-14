/*
import java.util.Scanner;
import java.lang.Math;

public class Armstsroong {

    static boolean isArmstsrog(int n)
    {
        int temp, digitos = 0, ultimo = 0, soma = 0;
        temp = n;
        //executar loop até que a condição se torne falsa  
        while (temp > 0) {
            temp = temp/10;
            digitos++;
        }
        temp = n;
        while (temp > 0) {
            //determina o útimo digito do numero.
            ultimo = temp % 10;
            //calcula o poder de um numero até digito vezes e add  o resultante à variável soma.  
            soma +=(Math.pow(ultimo, digitos));
            //remove o último digito.
            temp = temp/10;
        }
        //compara a soma com n.
        if(n == soma)
        //retorna a soma com n.
        return true;
        //retorna false se a soma n não forem iguais.
        else
        return false;

    }
         public static void main(String[] args){
            int num;
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o limite: ");
            //lê o numero do usuario.
            num = sc.nextInt();
            System.out.println("Numero Armstrong até "+ num + " são");
            for(int i = 0; i <= num; i++)
            //chamada de função.
            if (isArmstsrog(i)) {
                //imprime os numeros armstrong.
                System.out.print(i+", ");
            }
        }
        
    }
    */
                    //Exp2Arms
        /*
import java.util.Scanner;
import java.lang.Math;
public class Armstsroong {
    static boolean isArmstsrog(int n){
        int temp, digitos = 0, ultimo = 0, soma = 0;
        
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digitos++;
        }
        temp = n;
        while (temp > 0) {
            ultimo = temp % 10;
            soma += (Math.pow(ultimo, digitos));
            temp = temp / 10;
        }
        if (n == soma) {
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        num = sc.nextInt();

        if (isArmstsrog(num)) {
            System.out.print("Armstrong");
        }else{
            System.out.println("Não Armstrong");
        }
    }
    
}
*/
//Refatoração de Armstrong.
/*public class Armstsroong {
    public static boolean isNarcissist(int num){
        int length = (int) (Math.log10(num) +1);
        int sum = 0;
        int n = num;

        while (num > 0) {
            sum += Math.pow(num % 10, length);
            num /= 10;
        }
        return sum == n;
    }
    public static void main(String [] args){
        int num = 153;
        if(isNarcissist(num)){
            System.out.println(num + " é um numero de Armstrong");
        }else {
            System.out.println(num + "Não é um numero de Armstrong");
        }
    }
} */

/*import java.util.HashMap;

public class Armstsroong {
    public static void main(String[] args) {
        int[][] matriz = {
            {7},
            {0},
            {1, 1, 2},
            {2},
            {0, 1, 0, 1, 0},
            {0},
            {1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1},
            {4}
        };

        for (int i = 0; i < matriz.length; i++) { // Percorre as linhas
            for (int j = 0; j < matriz[i].length; j++) { // Percorre as colunas da linha atual
                System.out.println("Elemento na linha " + i + " e coluna " + j + " é " + matriz[i][j]);
            }
        }

        int[] array = {1, 2, 2, 3, 3, 3, 4}; // Substitua por sua matriz

        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : countMap.keySet()) {
            if (countMap.get(num) % 2 == 0) {
                System.out.println("O número " + num + " aparece um número par de vezes.");
            } else {
                System.out.println("O número " + num + " aparece um número ímpar de vezes.");
            }
        }
    }
}
 */
/*import java.util.HashMap;

public class Armstsroong {
    public static void main(String[] args) {
        int[][] matriz = {
            {7},
            {0},
            {1, 1, 2},
            {2},
            {0, 1, 0, 1, 0},
            {0},
            {1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1},
            {4}
        };

        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int num = matriz[i][j];
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }

        for (int num : countMap.keySet()) {
            if (countMap.get(num) % 2 != 0) {
                System.out.println("O número " + num + " aparece um número ímpar de vezes.");
            }
        }
    }
}
 */
/*import java.util.HashMap;

public class Armstsroong {
    public static int findIt(int[] a) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : a) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : countMap.keySet()) {
            if (countMap.get(num) % 2 != 0) {
                return num;
            }
        }
        return 0; // Retorna 0 se nenhum número ímpar for encontrado, o que não deve acontecer conforme as instruções.
    }
}  */

 

/*import java.util.HashMap; // Importa a classe HashMap do pacote java.util.

public class FindOdd { // Define uma classe pública chamada FindOdd.

    public static int findIt(int[] a) { // Define um método estático que recebe um array de inteiros como parâmetro e retorna um inteiro.

        HashMap<Integer, Integer> countMap = new HashMap<>(); // Cria um novo objeto HashMap para armazenar a contagem de cada número no array.

        for (int num : a) { // Loop for-each para percorrer cada número no array.
            countMap.put(num, countMap.getOrDefault(num, 0) + 1); // Atualiza a contagem do número atual no HashMap. Se o número não estiver no HashMap, getOrDefault retornará 0.
        }

        for (int num : countMap.keySet()) { // Loop for-each para percorrer cada número no HashMap.
            if (countMap.get(num) % 2 != 0) { // Verifica se a contagem do número atual é ímpar usando o operador % (módulo).
                return num; // Retorna o número que aparece um número ímpar de vezes.
            }
        }

        return 0; // Retorna 0 se nenhum número ímpar for encontrado, o que não deve acontecer conforme as instruções.
    }
}
Declara uma variável chamada countMap do tipo HashMap<Integer, Integer>. 
Um HashMap é uma estrutura de dados que armazena pares de chave-valor, 
onde cada chave é única e está associada a um valor.
Neste caso, as chaves e os valores são do tipo Integer, 
que é uma classe que representa números inteiros em Java.
Inicializa a variável countMap com um novo objeto HashMap<Integer, Integer>(). 
Isso cria um novo HashMap vazio, sem nenhum par de chave-valor. 
Os sinais <> indicam que o tipo dos elementos do HashMap é inferido a partir da declaração 
da variável, portanto, não é necessário repeti-lo no construtor.
 */

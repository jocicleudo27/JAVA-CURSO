/*public class Padrao1{
    public static void main(String[] args)
    {
        //i para Linhas j para Colunas
        //triangulo Direito.
        int i, j, linha = 6;

        for(i = 0; i < linha; i++){
            for(j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} */

/*public class Padrao1{
    public static void main(String[] args)
    {
        //Triangulo Esquerdo
        int i, j, linha = 6;

        for(i = 0; i < linha; i++){
            for(j = 2*(linha-i); j > 0; j--){
                //imprime espaços entre duas estrelas
                System.out.print(" ");
            }
            for(j = 0; j < i; j++){
                //estampa estreals
                System.out.print("* ");
            }
            //lança o curso em uma nova linha depois de imprimir cada linha.
            System.out.println();
        }
    }
} */

/*public class Padrao1{
    public static void main(String[] args)
    {
        int i, j, linha = 6;
        //Padrão3 piramide.

        //Trabalho de loop externo para linha.
        for( i = 0; i < linha; i++){
            for(j = linha-i; j > 1; j--){//trabalho de loop interno p/ espaços.
                System.out.print(" ");
            }
            for(j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} */
/*import java.util.Scanner;
//Padrão 4 Diamante.
public class Padrao1{
    public static void main(String[] args)
    {
        int linha, i, j, espaço = 1;
        System.out.print("Digite o numero de Linhas que você deseja imprimir: ");
        Scanner sc = new Scanner(System.in);
        linha = sc.nextInt();
        sc.close();
        espaço = linha - 1;

        for(j = 1; j <= linha; j++){
            for(i = 1; i <= espaço; i++){
                System.out.print(" ");
            }
            espaço--;
            for(i = 1; i <= 2*j-1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        espaço = 1;
        for(j = 1; j <= linha -1; j++){
            for(i = 1; i <= espaço; i++){
                System.out.print(" ");
            }
            espaço++;
            for(i = 1; i <= 2 *(linha -j) -1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
} */

//Padrão 5
/*public class Padrao1 {
    public static void main(String[] args) {
        int linhas = 7;
        for(int i = linhas -1; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                //estampa estrela e espaço.
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
} */

//Padrão 6.
/*public class Padrao1 {

    public static void main(String[] args) {
        int n = 7;
        //laço interno
        for(int i = 0; i <= n; i++){
            //loop externo
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
} */


//Padrão 7.
/*public class Padrao1 {

    public static void main(String[] args) {
        int linhas = 8;
        for(int i = 0; i <= linhas -1; i++){
            for(int j = 0 ; j <= i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= linhas -1-i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
} */

//Padrão 8.
/*public class Padrao1 {

    public static void main(String[] args) {
        int linha = 7;
        for(int i = linha; i >= 1; i--){
            for(int j = linha; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
} */

//Padrão 9.
/*import java.util.Scanner;
public class Padrao1 {

    public static void main(String[] args) {
        int i, j, linhas;
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o numero de linhas: ");
        linhas = sc.nextInt();
        sc.close();
        for(i = 0; i <= linhas; i++){
            for(j = 0; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for(i = linhas; i >= 0; i--){
            for(j = 0; j <= i-1; j++){
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
} */
//desafio 1.    
    /*
public class Padrao1 {
    public static void main(String[] args) {
        System.out.println(isMatch("abc", "a*c")); //true
    }
    public static boolean isMatch(String s, String p){
        int sIndex = 0;
        int pIndex = 0;

        int pStarIndex = -1;
        int sStarIndex = -1;

        while (sIndex < s.length()) {
            if (pIndex < p.length() && (s.charAt(sIndex)== p.charAt(pIndex) || p.charAt(pIndex) == '?')) {
                sIndex++;
                pIndex++;
            }else if (pIndex < p.length() && p.charAt(pIndex)== '*') {
                pStarIndex = pIndex;
                sStarIndex = sIndex;
                pIndex++;
            }else if (pStarIndex != -1) {
                pIndex = pStarIndex + 1;
                sIndex = sStarIndex + 1;
                sStarIndex++;
            }else{
                return false;
            }
        }
        while (pIndex < p.length() && p.charAt(pIndex) == '*') {
            pIndex++;
        }
        return pIndex == p.length();
    }
} */
// Desafio 1.2

/*Algoritmos e Estruturas de Dados: Entender como as estruturas de dados (como arrays, listas encadeadas, pilhas, filas, árvores, etc.) 
funcionam e como usar algoritmos eficientes para manipulá-las é fundamental.

Recursão e Programação Dinâmica: Muitos problemas de correspondência de padrões podem ser resolvidos usando recursão 
ou programação dinâmica. A recursão é o processo de resolver um problema dividindo-o em subproblemas menores. 
A programação dinâmica é uma técnica para resolver problemas de otimização que exibem a propriedade de sobreposição de subproblemas.

Expressões Regulares: As expressões regulares são uma ferramenta poderosa para correspondência de padrões e manipulação de strings. 
Elas podem ser usadas para resolver uma ampla variedade de problemas, incluindo a correspondência de padrões com caracteres curinga.

Manipulação de Strings: Como este problema envolve a manipulação de strings, é importante entender 
como as operações de string funcionam em sua linguagem de programação escolhida (neste caso, Java). */    
//https://www.javatpoint.com/how-to-print-pattern-in-java

   //Padrão 11.
/*import java.util.Scanner;
   
public class Padrao1 {
   
    public static void main(String[] args) {
        
        int i, j, k, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de linhas :");
        n = sc.nextInt();
        sc.close();

        for(i = 0; i <= n-1; i++){
            for(j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(k = i; k <= n-1; k++){
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for(i = n-1; i >= 0; i--){
            for(j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(k = i; k <= n-1; k++){
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
} */
//padrão A.
/*public class Padrao1 {

    public static void main(String[] args) {
        
        int i, j, n= 8;

        for(i =0; i <= n; i++){
            for(j = 0; j <= n/2; j++){
                if ((j == 0 || j == n/2) && i!= 0 ||
                i == 0 && j != n/2 ||
                i == n/2) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
} */

//Padrão 13.
/*public class Padrao1 {

    public static void main(String[] args) {
        int i, j, k, linhas = 9;
        
        for(i = 1; i <= linhas; i++){
            for(j = i; j < linhas; j++){
                System.out.print(" ");
            }
            for(k = 1; k <= (2*i -1); k++){
                if (k == 1 || i == linhas || k == (2*i -1)) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
} */

//Padrão 14.
/*public class Padrao1 {

    public static void main(String[] args) {
        int n = 8;

        for(int i = 0; i < n; i++){
            int numero = 1;
            System.out.printf("%" + (n-i)*2 + "s","");
            for(int j = 0; j <= i; j++){
                System.out.printf("%4d", numero);
                numero = numero *(i-j)/(j+1);
            }
            System.out.println(); 
        }
    }
}
 */

 








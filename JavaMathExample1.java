/*public class JavaMathExample1{
    public static void main(String[] args){
        double x = 28;
        double y = 4;

        System.out.println("Maximum number of x and y is: "+Math.max(x, y));
        System.out.println("Sqaure root of y is: " + Math.sqrt(y));
        System.out.println("Power of x and y is: " + Math.pow(x, y));
        System.out.println("Logarithm of x is: " + Math.log(x));
        System.out.println("Logarithm of y is: " + Math.log(y));
        
    }
}
 */
public class JavaMathExample1 {

    public static void main(String[] args) {
        Integer a = new Integer(3);
        int i = a.intValue();
        int j = a;
        System.out.println(a+" "+i+" "+j);
    }
}
/*Integer a = new Integer(3); - Aqui, um novo objeto da classe Integer é criado com o valor 3. 
Este é um exemplo de uma classe wrapper sendo usada para criar um objeto a partir de um valor primitivo.
int i = a.intValue(); - Aqui, o método intValue() é chamado no objeto a para obter seu valor 
como um tipo primitivo int. Isso é chamado de unboxing.
int j = a; - Aqui, o objeto Integer a é automaticamente desempacotado para um int. 
Isso é chamado de autounboxing.
System.out.println(a+" "+i+" "+j); - Aqui, os valores de a, i e j são impressos. 
Como a é um objeto Integer, seu método toString() é chamado automaticamente para converter 
o objeto em uma string antes de ser impresso. */

//https://www.javatpoint.com/call-by-value-and-call-by-reference-in-java
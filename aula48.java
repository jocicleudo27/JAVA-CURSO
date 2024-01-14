//Vinculação estática e vinculação dinâmica
/*A conexão de uma chamada de método ao corpo do método é conhecida como associação.

Existem dois tipos de vinculação

Vinculação estática (também conhecida como vinculação antecipada).
Vinculação dinâmica (também conhecida como vinculação tardia).

A vinculação estática em Java, também conhecida como vinculação inicial, 
é a vinculação que pode ser resolvida em tempo de compilação pelo compilador. 
Isso significa que o compilador Java determina exatamente qual método ou variável
será chamado ou acessado antes que o programa seja executado.

A vinculação de todos os métodos estáticos, privados e finais é feita em tempo de compilação. 
Isso ocorre porque o compilador sabe que esses métodos não podem ser sobrescritos e sempre serão 
acessados pelo objeto da classe local1. Portanto, a vinculação para tais métodos é estática.

Por exemplo, se você tiver uma classe Counter com um campo estático count, você pode referenciar 
a variável com a seguinte expressão: Counter.count. Da mesma forma, se a classe Counter tiver 
um método estático increment(), você pode chamar esse método usando Counter.increment().

public class Counter {
    private static int count;
    
    public static void increment() {
        count++;
    }
    
    public static void main(String[] args) {
        Counter.increment();
        System.out.println(Counter.count);
    }
}
Neste exemplo, tanto o campo count quanto o método increment() são estáticos, portanto, eles são vinculados estaticamente. 
Você pode chamar o método increment() e acessar o campo count diretamente usando o nome da classe Counter, 
sem precisar criar uma instância da classe.

Vale ressaltar que a vinculação estática tem melhor desempenho 
em termos de desempenho, pois nenhuma sobrecarga extra é necessária1
*/
/*Instância Java de
O operador java instanceof é usado para testar se o objeto é uma instância 
do tipo especificado (classe ou subclasse ou interface).

A instância em java também é conhecida como operador de comparação de 
tipo porque compara a instância com o tipo. Ele retorna verdadeiro ou falso. 
Se aplicarmos o operador instanceof com qualquer variável que tenha valor nulo, ele retornará false. 
*/
/*class Simple1{
    public static void main(String[] args) {
        Simple1 s = new Simple1();
        System.out.println(s instanceof Simple1);
    }
}
*/

//instanceof em java com uma variável que tem valor nulo
/*class Dog2{
    public static void main(String[] args) {
        Dog2 d = null;
        System.out.println(d instanceof Dog2);
    }
}
*/

/*Downcasting com operador java instanceof
Quando o tipo Subclass se refere ao objeto da classe Pai , ele é conhecido como downcasting. 
Se o executarmos diretamente, o compilador dará erro de compilação. 
Se você executá-lo por typecasting, ClassCastException é lançado em tempo de execução. 
Mas se usarmos instanceof operator, o downcasting é possível. 
Possibilidade de downcasting com instância de
Vejamos o exemplo, onde o downcasting é possível por instância do operador.
*/
/*class Animal{}
    class Dog2 extends Animal{
        static void method(Animal a){
            if(a instanceof Dog2){
                Dog2 d = (Dog2)a;
                System.out.println("Ok downcasting perfomde");
            }
        }
        public static void main(String[] args) {
            Animal a = new Dog2();
            Dog2.method(a);
        }
    }
 O downcasting com o operador instanceof em Java pode resolver vários tipos de problemas, especialmente aqueles relacionados à manipulação 
 de hierarquias de classes e ao tratamento de diferentes tipos de objetos em tempo de execução. Aqui estão alguns exemplos:

Evitar ClassCastException: O operador instanceof pode ser usado para verificar o tipo de um objeto antes de fazer o downcasting1. 
Isso pode ajudar a evitar exceções de ClassCastException em tempo de execução1.

Acessar métodos específicos de subclasses: Se você tem uma referência de uma superclasse que aponta para um objeto de uma subclasse, 
você pode usar downcasting para acessar métodos que são específicos para essa subclasse1.

Implementar lógica condicional baseada em tipos: Em alguns casos, você pode querer executar diferentes blocos de código dependendo do 
tipo real de um objeto. Você pode usar instanceof para verificar o tipo de objeto e, em seguida, fazer o downcasting apropriado1.

Por exemplo, se você estiver implementando um sistema de animais onde diferentes tipos de animais têm diferentes formas de se mover 
(alguns podem voar, outros podem nadar, etc.), você pode usar instanceof e downcasting para chamar o método de movimento apropriado 
dependendo do tipo real do animal.

No entanto, é importante notar que o uso excessivo de downcasting e instanceof pode ser um sinal de que o design do seu código pode ser 
melhorado. Idealmente, o código deve ser escrito de forma que o downcasting seja minimizado1.

*/
/*Esta é uma interface vazia chamada Printable. 
As interfaces são usadas para alcançar a abstração total e o polimorfismo em Java. */
interface Printable{}
//Aqui, A é uma classe que implementa a interface Printable e define um método chamado a(). 
class A implements Printable{
    public void a(){System.out.println("a method");}
}
//B é outra classe que implementa a interface Printable e define um método chamado b().
class B implements Printable{
    public void b(){System.out.println("b method");}
}
class Call{
    /*A classe Call tem um método invoke() que aceita um objeto do tipo Printable. 
    Dentro deste método, ele verifica se o objeto p é uma instância de A ou B usando 
    o operador instanceof. Se p for uma instância de A, ele faz o downcasting de p para A e chama o método a(). 
    Se p for uma instância de B, ele faz o downcasting de p para B e chama o método b(). */
    void invoke(Printable p){
        if (p instanceof A) {
            A a = (A)p;
            a.a();
        }
        if (p instanceof B) {
            B b = (B)p;
            b.b();
        }
    }
}
class testar4{
    public static void main(String[] args) {
        Printable p = new B();
        Call c = new Call();
        c.invoke(p);
    }
}
/*Finalmente, a classe Test4 contém o método main(), que é o ponto de entrada do programa. 
Aqui, um objeto B é criado e referenciado pela variável p da interface Printable. 
Em seguida, um objeto Call é criado e o método invoke() é chamado com p como argumento. */
//https://www.javatpoint.com/abstract-class-in-java
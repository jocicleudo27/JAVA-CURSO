//Polimorfismo em Java
/*É UM CONCEITO PELO QUAL PODEMOS REALIZAR UMA ÚNICA AÇÃO DE DIFERENTES MANEIRAS.
Portanto, polimorfismo significa muitas formas.

Existem dois tipos de polimorfismo em Java: 
1.polimorfismo em tempo de compilação e 
2.polimorfismo em tempo de execução. 
Podemos realizar polimorfismo em java por sobrecarga de método e substituição de método.

Se você sobrecarregar um método estático em Java, ele é o exemplo de polimorfismo em tempo de compilação. 
Aqui, vamos nos concentrar no polimorfismo de tempo de execução em java.
Polimorfismo em tempo de execução em Java
Polimorfismo de tempo de execução ou Dynamic Method Dispatch é um processo no qual 
uma chamada para um método substituído é resolvida em tempo de execução em vez de tempo de compilação.

Nesse processo, um método substituído é chamado por meio da variável de referência de uma superclasse. 
A determinação do método a ser chamado baseia-se no objeto a que se refere a variável de referência.

Vamos primeiro entender a reformulação antes do Polimorfismo de Tempo de Execução.

Upcasting
Se a variável de referência da classe Parent se referir ao objeto da classe Child, ela será conhecida como upcasting.

Exemplo de Polimorfismo em Java Runtime
Neste exemplo, estamos criando duas classes Bike e Splendor. 
A classe Splendor estende a classe Bike e substitui seu método run(). 
Estamos chamando o método run pela variável de referência da classe Parent. 
Como ele se refere ao objeto de subclasse e o método de subclasse substitui 
o método de classe pai, o método de subclasse é chamado em tempo de execução.

Como a invocação do método é determinada pelo compilador da JVM, não pelo compilador, 
ela é conhecida como polimorfismo de tempo de execução.
*/
/*class Bike{
    void run(){System.out.println("em execução");}
}
class Splendor extends Bike{
    void run(){System.out.println("rodando com ssegurança com 60km");}
    public static void main(String[] args) {
        Bike b = new Splendor();
        b.run();
    }
} */

/*Exemplo de Polimorfismo em Java Runtime: Banco
Considere um cenário em que Banco é uma classe que fornece um método para obter a taxa de juros. 
No entanto, a taxa de juros pode variar de acordo com os bancos. 
Por exemplo, os bancos SBI, ICICI e AXIS estão fornecendo taxas de juros de 8,4%, 7,3% e 9,7%. 

Nota: Este exemplo também é dado na substituição de método, mas não houve upcasting.

*/
/*Esta é a classe Banco que possui um método chamado getRareOfinterest(). 
Este método retorna um valor de ponto flutuante, que neste caso é 0 

as classes SBI,ICICI,AXIS são subclass de Banco e todas sobrescreve o método getRareOfinterest() 
para retornar seus propios valores.

Finalmente, a classe TestPolymorphism contém o método main().
Aqui, um objeto Banco é criado e referenciado por b. 
Inicialmente, b é um objeto SBI, então o método getRareOfinterest() retorna 8.4. 
Em seguida, b é reatribuído como um objeto ICICI, então o método getRareOfinterest() retorna 7.3. 
Finalmente, b é reatribuído como um objeto AXIS, então o método getRareOfinterest() retorna 9.7.

Este código é um exemplo de polimorfismo, 
um conceito fundamental da programação orientada a objetos, 
onde uma classe pode ter várias formas. Neste caso, Banco pode ser SBI, ICICI ou AXIS.
*/
/*class Banco{
    float getRareOfinterest(){return 0;}
}
class SBI extends Banco{
    float getRareOfinterest(){return 8.4f;}
}
class ICICI extends Banco{
    float getRareOfinterest(){return 7.3f;}
}
class AXIS extends Banco{
    float getRareOfinterest(){return 9.7f;}
}
class TestPolymorphism{
    public static void main(String[] args) {
        Banco b = new SBI();
        System.out.println("SBI Rate of Interest: "+b.getRareOfinterest());
        b = new ICICI();
        System.out.println("ICICI Rate of Interest:"+b.getRareOfinterest());
        b = new AXIS();
        System.out.println("AXIS Rate of Interest:"+b.getRareOfinterest());
    }
}
*/
/*Esta é a classe Bike que possui um membro de dados chamado speedlimit. 
O valor de speedlimit é definido como 90. 
Aqui, Honda3 é uma subclasse de Bike que tem seu próprio membro de dados speedlimit, definido como 150. No método main(), um objeto Honda3 é criado e referenciado pela variável obj da classe Bike. Quando obj.speedlimit é impresso, ele exibe o valor de speedlimit da classe Bike, que é 90, e não 150 da classe Honda3.

Isso ocorre porque, ao contrário dos métodos, os membros de dados não são substituídos em subclasses. 
Portanto, mesmo que obj seja um objeto Honda3, ele acessará o membro de dados speedlimit da classe Bike. 
Isso demonstra que o polimorfismo de tempo de execução não pode ser alcançado por membros de dados em Java.
*/
/*class Bike{
    int speedlimit = 90;
}
class Honda3 extends Bike{
    int speedlimit = 150;

    public static void main(String[] args) {
        Bike obj = new Honda3();
        System.out.println(obj.speedlimit);
    }
}
 */

 /*Polimorfismo Java Runtime com Herança Multinível
Vejamos o exemplo simples de Polimorfismo em Tempo de Execução com herança multinível. 

Esta é a classe Animal que possui um método chamado eat(). 
Este método imprime a string "eating" quando chamado.

Aqui, Dog é uma subclasse de Animal que sobrescreve o método eat() para imprimir "eating fruits".
BabyDog é uma subclasse de Dog que sobrescreve o método eat() para imprimir "drinking milk".

No método main(), três referências de Animal são criadas: a1, a2, e a3. 
a1 é referenciado a um objeto Animal, 
a2 a um objeto Dog, 
e a3 a um objeto BabyDog. 
Quando o método eat() é chamado em cada um desses objetos, 
a versão do método que corresponde ao tipo de objeto real (não o tipo de referência) é chamada. 
Isso é conhecido como vinculação dinâmica ou polimorfismo de tempo de execução.
*/
/*class Animal{
    void eat(){System.out.println("eating");}
}

class Dog extends Animal{
    void eat(){System.out.println("eating fruits");}
}
class BabyDog extends Dog{
    void eat(){System.out.println("drinkng milk");}

    public static void main(String[] args) {
        Animal a1, a2, a3;
        a1 = new Animal();
        a2 = new Dog();
        a3 = new BabyDog();

        a1.eat();
        a2.eat();
        a3.eat();
    }
}
*/



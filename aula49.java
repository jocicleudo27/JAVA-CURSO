//Exemplo de classe Abstract que tem um método abstrato

/*abstract class Bike{
    abstract void run();
}

class Honda4 extends Bike{
    void run(){System.out.println("running safely");}
    public static void main(String[] args){
        Bike obj = new Honda4();
        obj.run();
    }
}
*/
//Esta é a declaração de uma classe abstrata chamada Shape. 
// Ela tem um método abstrato chamado draw()
/*abstract class Shape{
    abstract void draw();
}
//Esta é a declaração de uma classe chamada Rectangle que 
//estende a classe abstrata Shape. Ela fornece uma implementação 
//para o método draw(), que é obrigatório porque draw() foi declarado como um método abstrato na classe Shape.
class Rectangle extends Shape{
    void draw(){System.out.println("drawing retangle");}
}
//Esta é a declaração de outra classe chamada Circle1 que 
//também estende a classe abstrata Shape. 
//Ela também fornece uma implementação para o método draw().
class Circle1 extends Shape{
    void draw(){System.out.println("drawing circle");}
}
class TestAbstraction1{
    public static void main(String[]args){
        Shape s = new Circle1();
        s.draw();
    }
}
*/

/*Finalmente, esta é a classe TestAbstraction1 que contém o método main(), 
que é o ponto de entrada para qualquer aplicativo Java. No método main(), 
um objeto do tipo Circle1 é criado e atribuído a uma variável do tipo Shape. 
Em seguida, o método draw() é chamado no objeto, o que resultará na impressão de 
“drawing circle” na saída padrão. */
/*abstract class Bank{
    abstract int getRateOfIntereset();
}
class SBI extends Bank{
    int getRateOfIntereset(){return 7;}
}
class PNB extends Bank{
    int getRateOfIntereset(){return 8;}
}

class TestBank{
    public static void main(String[] args){
        Bank b = new SBI();
        int intrest =b.getRateOfIntereset();
        System.out.println("Rate of Interest is: "+intrest+" %");
    }
}
*/

//Classe abstrata com construtor, membro de dados e métodos
/*Construtor: Embora uma classe abstrata não possa ser instanciada diretamente, 
ela pode ter um construtor. Este construtor é chamado quando uma subclasse é instanciada.

Membro de Dados: Uma classe abstrata pode ter membros de dados, assim como qualquer 
outra classe em Java. Estes são essencialmente variáveis que são atribuídas à classe.

 */
abstract class Bike{
    Bike(){System.out.println("bike is created");}
    abstract void run();
void changerGear(){System.out.println("gear changed");}
}

class Honda extends Bike{
    void run(){System.out.println("running safely..");}
}
class TestAbstraction2{
    public static void main(String[] args){
        Bike obj =  new Honda();
        obj.run();
        obj.changerGear();
    }
}

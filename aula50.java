//Interface em Java.
/*Uma interface em Java é um blueprint de uma classe. 
Possui constantes estáticas e métodos abstratos.

A interface em Java é um mecanismo para alcançar a abstração. 
Pode haver apenas métodos abstratos na interface Java, não no corpo do método. 
Ele é usado para alcançar abstração e herança múltipla em Java.

Em outras palavras, pode-se dizer que as interfaces podem ter métodos e variáveis abstratas. 
Não pode ter um corpo de método.

A Interface Java também representa a relação IS-A.

Ele não pode ser instanciado como a classe abstrata.

Desde o Java 8, podemos ter métodos padrão e estáticos em uma interface.

Desde o Java 9, podemos ter métodos privados em uma interface.

Por que usar a interface Java?
Existem principalmente três razões para usar a interface. Eles são dados abaixo. 
1. É usado para alcançar a abstração.
2. Por interface, podemos suportar a funcionalidade de herança múltipla.
3. Ele pode ser usado para conseguir acoplamento solto.
Como declarar uma interface?
Uma interface é declarada usando a palavra-chave interface. 
Proporciona total abstração; significa que todos os métodos em uma interface são 
declarados com o corpo vazio, e todos os campos são públicos, estáticos e finais por padrão. 
Uma classe que implementa uma interface deve implementar todos os métodos declarados na interface.
os campos de interface são públicos, estáticos e finais por padrão, e os métodos são públicos e abstratos.
uma classe estende outra classe, uma interface estende outra interface, mas uma classe implementa uma interface.
Neste exemplo, a interface imprimível tem apenas um método e sua implementação é fornecida na classe A6.
*/
/**
 * aula50
 */
/*interface aula50 {

    void print();
}
class A6 implements aula50{
    public void print(){
        System.out.println("Hello");
    }
    public static void main(String[] args){
        A6 obj = new A6();
        obj.print();        
    }
}
*/
/**
 * aula50
 */
/*public interface aula50 {

    void print();
}
interface Showable{
    void show();
}
class A7 implements aula50, Showable{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Wellcome");}

    public static void main(String[] args) {
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}
*/
/**
 * aula50
 */
/*public interface aula50 {

    void print();

}
interface Showable extends aula50{
    void show();
}
class TestInterface4 implements Showable{
    public void print(){System.out.println("Bom");}
    public void show(){System.out.println("Dia");}

    public static void main(String[] args) {
        TestInterface4 obj = new TestInterface4();
        obj.print();
        obj.show();
    }
}
*/
/*public interface aula50 {

    public void obterCoordenadas();
}
interface Radio {
    public void ligarRadio();
    public void pararRadio();
    public boolean estaLigado();
    
}
class Smartphone implements aula50, Radio{
    private boolean radioLigado;
    public void obterCoordenadas(){
        if (radioLigado) {
            System.out.println("94.7");
        }else{
            System.out.println("O rádio está desligado. Não é possível obter as coordenadas.");
        }
        
    }
    public void ligarRadio(){
        radioLigado = true;            
        System.out.println("radio ligado");
    }
    public void pararRadio(){
        radioLigado =  false;
        System.out.println("radio delsigado");
    }
    public boolean estaLigado(){
        return radioLigado;
    }
    public static void main(String[] args) {
        Smartphone obj = new Smartphone();
 
        //obj.ligarRadio();
        obj.pararRadio();
        obj.obterCoordenadas();
        
    }
} 
*/



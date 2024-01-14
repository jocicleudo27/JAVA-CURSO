//SOBRECARGA DE MÉTODOS
/*A sobrecarga de métodos é um recurso em Java que permite a uma classe 
ter mais de um método com o mesmo nome, mas com diferentes listas de parâmetros. 
Isso é útil quando queremos realizar ações semelhantes para diferentes tipos de dados 
ou diferentes números de argumentos.

Há duas maneiras de sobrecarregar o método em java
1° Alterando o número de argumentos
2° Alterando o tipo de dados

Aqui estão algumas regras para sobrecarga de métodos:

1. O número de parâmetros deve ser diferente para cada método sobrecarregado.
2. Ou os tipos de parâmetros devem ser diferentes para cada método sobrecarregado.
3. Ou a ordem dos parâmetros deve ser diferente para cada método sobrecarregado. 

Neste exemplo, o método show é sobrecarregado com três versões diferentes. 
A primeira versão aceita um parâmetro inteiro, 
a segunda aceita dois parâmetros inteiros e a 
terceira aceita um parâmetro String. 
Cada um desses métodos realiza uma ação semelhante (imprimir os parâmetros), 
mas eles são aplicados a diferentes tipos ou números de argumentos.

lass Demo {
    void show(int a) {
        System.out.println("Método com um parâmetro: " + a);
    }

    void show(int a, int b) {
        System.out.println("Método com dois parâmetros: " + a + ", " + b);
    }

    void show(String a) {
        System.out.println("Método com um parâmetro String: " + a);
    }
}

Neste exemplo, criamos dois métodos, o primeiro método add() executa a adição de dois números. 
E o segundo método add executa a adição de três números.

Neste exemplo, estamos criando métodos estáticos para que não precisemos criar instância para chamar métodos.

class Adder{  
    static int add(int a,int b){return a+b;}  
    static int add(int a,int b,int c){return a+b+c;}  
}  
    class TestOverloading1{  
        public static void main(String[] args){  
        System.out.println(Adder.add(11,11));  
        System.out.println(Adder.add(11,11,11));  
    }
}

Neste exemplo, criamos dois métodos que diferem no tipo de dados. 
O primeiro método add recebe dois argumentos inteiros.
Segundo método add recebe dois argumentos float.

class Adder{  
    static int add(int a, int b){return a+b;}  
    static double add(double a, double b){return a+b;}  
}  
class TestOverloading2{  
    public static void main(String[] args){  
        System.out.println(Adder.add(11,11));  
        System.out.println(Adder.add(12.3,12.6));  
    }
}

Em java, a sobrecarga de método não é possível alterando o tipo de RETORNO do método. 
apenas devido à ambiguidade. Vejamos como a ambiguidade pode ocorrer:
Isso ocorre porque o compilador Java não considera o tipo de retorno ao diferenciar métodos, 
então ter dois métodos com o mesmo nome e a mesma lista de parâmetros, 
mas com tipos de retorno diferentes, resultaria em um erro de compilação.

class Adder{  
    static int add(int a,int b){return a+b;}  
    static double add(int a,int b){return a+b;}  
}  
class TestOverloading3{  
    public static void main(String[] args){  
        System.out.println(Adder.add(11,11));//ambiguity  
    }

}  
*/
/*class OverloadingCalculation1{
    void sum(int a, long b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        OverloadinCalculation1 obj = new OverloadinCalculation1();
        obj.sum(20,20);
        obj.sum(20,20,20);
    }
} */

//https://compiler.javatpoint.com/opr/test.jsp?filename=OverloadingCalculation1
//https://www.javatpoint.com/method-overloading-in-java